package servicios;

import entidades.Cliente;
import java.util.List;
import persistencia.ClienteDAO;

/*

*/
public class ClienteService {
    private final ClienteDAO cDAO = new ClienteDAO();
    
    public Cliente crearCliente(Long documento, String nombre, String apellido, String telefono) {

        Cliente cliente = new Cliente();

        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);

        try {
            cDAO.guardarCliente(cliente);
            
            System.out.println("Cliente creado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al crear cliente SERVICE");
        }

        return cliente;
    }
    
    public Cliente editarCliente(Long documento, String nombre, String apellido, String telefono) throws Exception {

        Cliente cliente = new Cliente();
        
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);

        try {
            cDAO.editarCliente(cliente);
            
            System.out.println("Cliente editado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Error al editar cliente SERVICE");
        }

        return cliente;
    }
    
    public void eliminarCliente(Long documento) throws Exception {
        try {
            cDAO.eliminarCliente(documento);
            
            System.out.println("Cliente eliminado con exito.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error al eliminar cliente SERVICE.");
        }
    }
    
    public Cliente buscarClienteId(Integer id) throws Exception {
        Cliente cliente = null;

        try {
            cliente = cDAO.buscarClienteId(id);
            
            if (cliente == null) {
                throw new Exception("No se encontre el cliente con ese id");
            }
            
            System.out.println(cliente);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se encontro el cliente.");
        }

        return cliente;
    }
    
    public Cliente buscarClienteDocumento(Long documento) throws Exception {
        Cliente cliente = null;

        try {
            cliente = cDAO.buscarClienteDocumento(documento);
            
            if (cliente == null) {
                throw new Exception("No se encontro el cliente con ese documento");
            }
            
            System.out.println(cliente);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se encontro el cliente.");
        }

        return cliente;
    }
    
    public List<Cliente> buscarClientesNombre(String nombre) throws Exception {
        List<Cliente> clientes = null;

        try {
            clientes = cDAO.buscarClientesNombre(nombre);

            if (clientes.isEmpty()) {
                throw new Exception("No se encontro clientes con ese nombre");
            }
            
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se encontro el cliente.");
        }

        return clientes;
    }
    
    public List<Cliente> buscarClientesApellido(String apellido) throws Exception {
        List<Cliente> clientes = null;

        try {
            clientes = cDAO.buscarClientesApellido(apellido);

            if (clientes.isEmpty()) {
                throw new Exception("No se encontro clientes con ese apellido");
            }
            
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se encontro el cliente.");
        }

        return clientes;
    }
}
