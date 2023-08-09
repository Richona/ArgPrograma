package servicios;

import entidades.Editorial;
import persistencia.EditorialDAO;

/*

 */
public class EditorialService {

    EditorialDAO eDAO = new EditorialDAO();

    public Editorial crearEditorial(String nombre) throws Exception {
        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);

        try {
            eDAO.guardarEditorial(editorial);
            System.out.println("Editorial guardado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al crear Editorial SERVICE");
        }
        return editorial;
    }

    public Editorial editarEditorial(Integer id, String nombre) throws Exception {
        Editorial editorial = new Editorial();

        editorial.setId(id);
        editorial.setNombre(nombre);

        try {
            eDAO.editarEditorial(editorial);
            System.out.println("Editorial editada con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al editar Editorial ");
        }
        return editorial;
    }

    public void darDeAltaEditorial(Integer id) throws Exception {
        try {
            eDAO.darDeAltaEditorial(id);
            
            System.out.println("Editorial dada de alta con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al dar de alta Editorial ");
        }
    }

    public void darDeBajaEditorial(Integer id) throws Exception {
        try {
            eDAO.darDeBajaEditorial(id);
            
            System.out.println("Editorial dada de baja con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al dar de baja Editorial ");
        } 
    }

    public Editorial buscarEditorial(String nombre) throws Exception {
        Editorial editorial = null;

        try {
            editorial = eDAO.buscarEditorialNombre(nombre);
            
             if (editorial == null) {
                throw new Exception("No se encontre la editorial con ese nombre");
            }
            
            System.out.println(editorial);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" No se encontro el Autor ");
        }

        return editorial;
    }
}
