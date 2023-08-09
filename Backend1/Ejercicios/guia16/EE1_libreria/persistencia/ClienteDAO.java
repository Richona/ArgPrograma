package persistencia;

import entidades.Cliente;
import java.util.List;
import javax.persistence.NoResultException;

/*

*/
public class ClienteDAO extends DAO<Cliente>{
    public void guardarCliente(Cliente cliente) throws Exception {
        if (buscarClienteDocumento(cliente.getDocumento()) != null) {
            throw new Exception("Ya existe un cliente con el mismo documento");
        }

        super.guardar(cliente);

    }
    
    public void editarCliente(Cliente cliente) throws Exception {
        if (buscarClienteDocumento(cliente.getDocumento()) == null) {
            throw new Exception("No existe un cliente con el documento ingresado.");
        }

        cliente.setId(buscarClienteDocumento(cliente.getDocumento()).getId());
        
        super.editar(cliente);
    }
    
    public void eliminarCliente(Long documento) throws Exception {
        Cliente cliente = buscarClienteDocumento(documento);
        
        if (cliente == null) {
            throw new Exception("No existe un cliente con el documento ingresado.");
        }

        super.eliminar(cliente);
    }
    
    public Cliente buscarClienteId(Integer id) throws Exception {
        try {
            Cliente cliente = em.find(Cliente.class, id);

            return cliente;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por id: " + e.getMessage());
            throw e;
        }
    }
    
    public Cliente buscarClienteDocumento(Long documento) throws Exception {
        try {
            Cliente cliente = em.createQuery("SELECT c FROM Cliente c WHERE c.documento LIKE :documento", Cliente.class)
                    .setParameter("documento", documento)
                    .getSingleResult();

            return cliente;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por documento: " + e.getMessage());
            throw e;
        }
    }
    
    public List<Cliente> buscarClientesNombre(String nombre) throws Exception {
        try {
            List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre", Cliente.class)
                    .setParameter("nombre", nombre)
                    .getResultList();

            return clientes;
        } catch (Exception e) {
            System.out.println("Error al buscar clientes por nombre: " + e.getMessage());
            throw e;
        }
    }
    
    public List<Cliente> buscarClientesApellido(String apellido) throws Exception {
        try {
            List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.apellido LIKE :apellido", Cliente.class)
                    .setParameter("apellido", apellido)
                    .getResultList();

            return clientes;
        } catch (Exception e) {
            System.out.println("Error al buscar clientes por apellido: " + e.getMessage());
            throw e;
        }
    }
}
