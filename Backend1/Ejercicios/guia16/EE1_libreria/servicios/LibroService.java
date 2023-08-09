package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.LibroDAO;

/*

 */
public class LibroService {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();

    LibroDAO lDAO = new LibroDAO();

//    public LibroService() {
//        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("libreariaPU");
//        EntityManager em = EMF.createEntityManager();
//    }
    public Libro crearLibro(Long isbn, String titulo, int anio, int ejemplares, Autor autor, Editorial editorial) throws Exception {
        Libro libro = new Libro();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresRestantes(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        try {
            lDAO.guardarLibro(libro);

            System.out.println("Libro guardado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al ingresar Libro ");
        }
        return libro;
    }

    public Libro editarLibro(Long isbn, String titulo, int anio, int ejemplares, Autor autor, Editorial editorial) throws Exception {
        Libro libro = new Libro();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresRestantes(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        try {
            lDAO.editarLibro(libro);

            System.out.println("Libro editado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al editar Libro ");
        }
        return libro;
    }

    public void darDeAltaLibro(Long id) throws Exception {
        try {
            lDAO.darDeAltaLibro(id);

            System.out.println("Libro dado de alta con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al dar de alta Libro ");
        }
    }

    public void darDeBajaLibro(Long id) throws Exception {
        try {
            lDAO.darDeBajaLibro(id);

            System.out.println("Libro dado de baja con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al dar de baja Libro ");
        }

    }

    public void buscarLibroPorId(Long id) throws Exception {
        Libro libro;

        try {
            libro = lDAO.buscarLibroId(id);

            if (libro == null) {
                throw new Exception("No se encontro un libro con ese ISBN");
            }

            System.out.println(libro);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se encontro el ISBN");
        }

    }

    public Libro buscarLibroPorNombre(String nombre) throws Exception {
        Libro libro = null;

        try {
            libro = lDAO.buscarLibroNombre(nombre);

            if (libro == null) {
                throw new Exception("No se encontro un libro con ese nombre");
            }

            System.out.println(libro);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se encontro el nombre");
        }
        return libro;
    }

    public void buscarLibroPorNombreAutor(String nombre) throws Exception {

        List<Libro> libro;
        try {
            libro = lDAO.buscarLibrosPorNombreAutor(nombre);
            libro.forEach((libro1) -> {
                System.out.println(libro1.toString());
            });
        } catch (Exception e) {
            System.out.println("No se encontro el nombre");
        }

    }

    public void buscarLibroPorNombreEditorial(String nombre) throws Exception {
        List<Libro> libro;
        try {
            libro = lDAO.buscarLibrosPorNombreEditorial(nombre);
            libro.forEach((libro1) -> {
                System.out.println(libro1.toString());
            });
        } catch (Exception e) {
            System.out.println("No se encontro el nombre");
        }

    }
}
