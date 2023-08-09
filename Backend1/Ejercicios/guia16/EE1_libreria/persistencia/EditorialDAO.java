package persistencia;

import entidades.Editorial;
import javax.persistence.NoResultException;

/*

 */
public class EditorialDAO extends DAO<Editorial> {

    public void guardarEditorial(Editorial Editorial) throws Exception {
        if (buscarEditorialNombre(Editorial.getNombre()) != null) {
            throw new Exception("Ya existe una Editorial con el mismo nombre.");
        }

        super.guardar(Editorial);
    }

    public void editarEditorial(Editorial editorial) throws Exception {
        if (buscarEditorialId(editorial.getId()) == null) {
            throw new Exception("No existe una Editorial con el id ingresado.");
        }

        if (buscarEditorialNombre(editorial.getNombre()) != null) {
            throw new Exception("Ya existe una Editorial con el mismo nombre.");
        }

        super.editar(editorial);
    }

    public void darDeAltaEditorial(Integer id) throws Exception {
        Editorial editorial = buscarEditorialId(id);

        if (editorial == null) {
            throw new Exception("No existe una Editorial con el id ingresado.");
        }

        editorial.setAlta(true);
        super.editar(editorial);
    }

    public void darDeBajaEditorial(Integer id) throws Exception {
        Editorial editorial = buscarEditorialId(id);

        if (editorial == null) {
            throw new Exception("No existe una Editorial con el id ingresado.");
        }

        editorial.setAlta(false);
        super.editar(editorial);
    }

    public Editorial buscarEditorialId(Integer id) throws Exception {
        try {
            Editorial editorial = em.find(Editorial.class, id);
            
            return editorial;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar editorial por nombre: " + e.getMessage());
            throw e;
        }
    }

    public Editorial buscarEditorialNombre(String nombre) throws Exception {
        try {
            Editorial libro = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nombre")
                    .setParameter("nombre", nombre)
                    .getSingleResult();

            return libro;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar editorial por nombre: " + e.getMessage());
            throw e;
        }
    }
}
