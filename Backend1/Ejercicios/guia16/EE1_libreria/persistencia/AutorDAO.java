package persistencia;

import entidades.Autor;
import javax.persistence.NoResultException;

/*

 */
public class AutorDAO extends DAO<Autor> {

    public void guardarAutor(Autor autor) throws Exception {
        if (buscarAutorNombre(autor.getNombre()) != null) {
            throw new Exception("Ya existe un Autor con el mismo nombre");
        }

        super.guardar(autor);

    }

    public void editarAutor(Autor autor) throws Exception {
        if (buscarAutorId(autor.getId()) == null) {
            throw new Exception("No existe un Autor con el id ingresado.");
        }

        if (buscarAutorNombre(autor.getNombre()) != null) {
            throw new Exception("Ya existe un Autor con el mismo nombre");
        }

        super.editar(autor);
    }

    public void darDeAltaAutor(Integer id) throws Exception {
        Autor autor = buscarAutorId(id);

        if (autor == null) {
            throw new Exception("No existe un Autor con el id ingresado.");
        }

        autor.setAlta(true);
        super.editar(autor);
    }

    public void darDeBajaAutor(Integer id) throws Exception {
        Autor autor = buscarAutorId(id);

        if (autor == null) {
            throw new Exception("No existe un Autor con el id ingresado.");
        }

        autor.setAlta(false);
        super.editar(autor);
    }

    public Autor buscarAutorId(Integer id) throws Exception {
        try {
            Autor autor = em.find(Autor.class, id);
            
            return autor;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar autor por id: " + e.getMessage());
            throw e;
        }
    }

    public Autor buscarAutorNombre(String nombre) throws Exception {
        try {
            Autor autor = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre", Autor.class)
                    .setParameter("nombre", nombre)
                    .getSingleResult();

            return autor;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar autor por nombre: " + e.getMessage());
            throw e;
        }
    }

}
