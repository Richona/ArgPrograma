package persistencia;

import entidades.Cliente;
import entidades.Libro;
import entidades.Prestamo;
import java.util.Collections;
import java.util.List;

/*
• Agregar validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.
• No generar condiciones inválidas. Por ejemplo, no se debe permitir prestar más
ejemplares de los que hay, ni devolver más de los que se encuentran prestados.
No se podrán prestar libros con fecha anterior a la fecha actual, etc.
 */
public class PrestamoDAO extends DAO<Prestamo> {

    private final LibroDAO lDAO = new LibroDAO();

    public void añadirPrestamo(Prestamo prestamo) throws Exception {
        Cliente cliente = prestamo.getCliente();
        Libro libro = prestamo.getLibro();

        if (cliente == null) {
            throw new Exception("...");
        }

        if (libro == null) {
            throw new Exception("...");
        }

        if (libro.getEjemplaresRestantes() == 0) {
            throw new Exception("No hay mas ejemplares disponibles.");
        }

        if (prestamo.getFechaPrestamo().after(prestamo.getFechaDevolucion())) {
            throw new Exception("Ingrese una fecha de devolucion correcta.");
        }

        lDAO.restarEjemplar(libro);
        prestamo.setLibro(libro);

        super.guardar(prestamo);
    }

    public void devolverPrestamo(Integer id) throws Exception {
        Prestamo prestamo = em.find(Prestamo.class, id);

        if (prestamo == null) {
            throw new Exception("No se encontro un prestamo con ese id.");
        }

        super.eliminar(prestamo);

        lDAO.sumarEjemplar(prestamo.getLibro());

    }

    public List<Prestamo> buscarPrestamosCliente(Long documento) {
        try {

            List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p JOIN p.cliente c WHERE c.documento LIKE :documento", Prestamo.class)
                    .setParameter("documento", documento)
                    .getResultList();


            return prestamos;
        } catch (Exception e) {
            System.out.println("Error al buscar prestamos por cliente: " + e.getMessage());
            return Collections.emptyList(); // Devuelve una lista vacía en caso de error
        }
    }

}
