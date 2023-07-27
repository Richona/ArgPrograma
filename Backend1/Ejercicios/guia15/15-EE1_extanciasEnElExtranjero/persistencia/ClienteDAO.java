package persistencia;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
descripción de la casa donde la realizaron.
*/
public class ClienteDAO extends DAO{
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();
    
    public ArrayList<Cliente> listarClientes(String opc) throws Exception{
        String sql = "";
        
        if ("e".equalsIgnoreCase(opc)) {
           sql = "SELECT  c.*, co.comentario AS descripcion_casa "
                   + "FROM clientes c "
                   + "INNER JOIN estancias e ON c.id_cliente = e.id_cliente "
                   + "INNER JOIN casas ca ON e.id_casa = ca.id_casa "
                   + "INNER JOIN comentarios co on co.id_casa = ca.id_casa "
                   + "GROUP BY c.id_cliente";
        }
        
        ArrayList<Cliente> listarEstancias = new ArrayList();
        Cliente c;
        
        try {
            consultarBase(sql);
            
            while(resultado.next()){
                c = new Cliente();
                System.out.println(resultado.getMetaData());
                c.setId_cliente(resultado.getInt(1));
                c.setNombre(resultado.getString(2));
                c.setCalle(resultado.getString(3));
                c.setNumero(resultado.getInt(4));
                c.setCodigo_postal(resultado.getString(5));
                c.setCiudad(resultado.getString(6));
                c.setPais(resultado.getString(7));
                c.setEmail(resultado.getString(9));
                
                listarEstancias.add(c);
            } 
        } catch (Exception e) {
            System.out.println("ERROR en listaCasas ");
            System.out.println(e);
        }finally{
            desconectarBase();
        }
        
        return listarEstancias;
    }
}
