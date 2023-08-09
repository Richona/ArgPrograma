package servicios;

import entidades.Autor;
import persistencia.AutorDAO;

/*

 */
public class AutorService {

    AutorDAO aDAO;

    public AutorService() {
        this.aDAO = new AutorDAO();
    }

    public Autor crearAutor(String nombre) {

        Autor autor = new Autor();

        autor.setNombre(nombre);

        try {
            aDAO.guardarAutor(autor);
            System.out.println("Autor creado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al crear Autor SERVICE");
        }

        return autor;
    }

    public Autor editarAutor(Integer id, String nombreNuevo) {
        Autor autor = new Autor();

        autor.setId(id);
        autor.setNombre(nombreNuevo);

        try {
            aDAO.editarAutor(autor);
            
            System.out.println("Autor editado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al Editar autor ");
        }
        return autor;
    }

    public void darDeAltaAutor(Integer id) throws Exception {
        try {
            aDAO.darDeAltaAutor(id);
            
            System.out.println("Autor dado de alta con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al dar de alta Libro ");
        }
    }

    public void darDeBajaAutor(Integer id) throws Exception {
        try {
            aDAO.darDeBajaAutor(id);
            
            System.out.println("Autor dado de baja con exito");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al dar de alta Libro ");
        }    
    }

    public Autor buscarAutor(String nombre) throws Exception {
        Autor autor = null;

        try {
            autor = aDAO.buscarAutorNombre(nombre);
            
            if (autor == null) {
                throw new Exception("No se encontre el autor con ese nombre");
            }
            
            System.out.println(autor);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" No se encontro el Autor ");
        }

        return autor;
    }
}
