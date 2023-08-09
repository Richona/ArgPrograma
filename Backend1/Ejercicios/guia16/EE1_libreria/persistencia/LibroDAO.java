package persistencia;

import entidades.Libro;
import java.sql.SQLClientInfoException;
import java.util.Collections;
import java.util.List;
import javax.persistence.NoResultException;

/*

 */
public class LibroDAO extends DAO<Libro> {

    public void guardarLibro(Libro libro) throws Exception {
        if (buscarLibroId(libro.getIsbn()) != null) {
            throw new Exception("Ya existe un libro con el mismo ISBN");
        }

        if (buscarLibroNombre(libro.getTitulo()) != null) {
            throw new Exception("Ya existe un libro con el mismo nombre");
        }

        if (libro.getAutor() == null) {
            throw new Exception("No existe un autor con el mismo nombre");
        }

        if (libro.getEditorial() == null) {
            throw new Exception("No existe una editorial con el mismo nombre");
        }

        super.guardar(libro);
    }

    public void editarLibro(Libro libro) throws Exception {
        if (buscarLibroId(libro.getIsbn()) == null) {
            throw new Exception("No existe un libro con el id ingresado");
        }

        if (buscarLibroNombre(libro.getTitulo()) != null) {
            throw new Exception("Ya existe un libro con el mismo nombre");
        }

        if (libro.getAutor() == null) {
            throw new Exception("No existe un autor con el nombre ingresado");
        }

        if (libro.getEditorial() == null) {
            throw new Exception("No existe una editorial con el nombre ingresado");
        }

        super.editar(libro);
    }

    public void darDeAltaLibro(Long id) throws Exception {
        Libro libro = buscarLibroId(id);

        if (libro == null) {
            throw new Exception("No existe un libro con el id ingresado");
        }

        libro.setAlta(true);
        super.editar(libro);
    }

    public void darDeBajaLibro(Long id) throws Exception {
        Libro libro = buscarLibroId(id);

        if (libro == null) {
            throw new Exception("No existe un libro con el id ingresado");
        }

        libro.setAlta(false);
        super.editar(libro);
    }

    public Libro buscarLibroId(Long id) throws Exception {
        try {
            Libro Libro = em.find(Libro.class, id);

            return Libro;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar libro por id: " + e.getMessage());

            throw e;
        }

    }

    public Libro buscarLibroNombre(String nombre) throws Exception {
        try {
            Libro libro = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre", Libro.class)
                    .setParameter("nombre", nombre)
                    .getSingleResult();

            return libro;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar libro por nombre: " + e.getMessage());

            throw e;
        }
    }

    public List<Libro> buscarLibrosPorNombreAutor(String nombreAutor) {
        try {
            List<Libro> libros = em.createQuery(
                    "SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombreAutor", Libro.class)
                    .setParameter("nombreAutor", nombreAutor)
                    .getResultList();

            return libros;
        } catch (Exception e) {
            System.out.println("Error al buscar libros por nombre de autor: " + e.getMessage());
            return Collections.emptyList(); // Devuelve una lista vacía en caso de error
        }
    }

    public List<Libro> buscarLibrosPorNombreEditorial(String nombreEditorial) {
        try {
            List<Libro> libros = em.createQuery(
                    "SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :nombreEditorial", Libro.class)
                    .setParameter("nombreEditorial", nombreEditorial)
                    .getResultList();

            return libros;
        } catch (Exception e) {
            System.out.println("Error al buscar libros por nombre de editorial: " + e.getMessage());
            return Collections.emptyList(); // Devuelve una lista vacía en caso de error
        }
    }
    
    public void restarEjemplar(Libro libro){
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
        
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);

        super.editar(libro);
    }
    
    public void sumarEjemplar(Libro libro){
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
        
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
        
        super.editar(libro);
    }
}
