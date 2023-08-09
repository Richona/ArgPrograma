package servicios;

import entidades.Cliente;
import entidades.Libro;
import entidades.Prestamo;
import java.util.Date;
import java.util.List;
import persistencia.PrestamoDAO;

/*

*/
public class PrestamoService {
    private final PrestamoDAO pDAO = new PrestamoDAO();
    
    public Prestamo añadirPrestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente){
        Prestamo prestamo = new Prestamo();

        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamo.setFechaDevolucion(fechaDevolucion);
        prestamo.setLibro(libro);
        prestamo.setCliente(cliente);

        try {
            pDAO.añadirPrestamo(prestamo);
            
            System.out.println("Prestamo creado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error al crear prestamo SERVICE.");
        }

        return prestamo;
    }
    
    public void devolverPrestamo(Integer id){
        try {
            pDAO.devolverPrestamo(id);
            
            System.out.println("Prestamo devuelto con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error al devolver prestamo.");
        }
    }
    
    public List<Prestamo> buscarPrestamosCliente(Long documento){
        List<Prestamo> prestamos = null;

        try {
            prestamos = pDAO.buscarPrestamosCliente(documento);

            if (prestamos.isEmpty()) {
                throw new Exception("No se encontro prestamos con ese documento de cliente.");
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se encontro prestamos.");
        }

        return prestamos;
    }
        
}
