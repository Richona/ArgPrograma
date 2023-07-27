package persistencia;

import entidades.Fabricante;
import entidades.Producto;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Las consultas a realizar sobre la BD son las siguientes:
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 */
public class TiendaDAO extends DAO {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();

    public ArrayList<Producto> listaProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);

            Producto p;
            ArrayList<Producto> productos = new ArrayList();

            while (resultado.next()) {
                p = new Producto();

                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));

                productos.add(p);
            }

            return productos;
        } catch (Exception e) {
            System.out.println("ERROR! listaProductos");

            throw e;
        } finally {
            desconectarBase();
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto.
    public ArrayList<Producto> buscarProductos(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%" + nombre + "%' ";
            consultarBase(sql);

            Producto p;
            ArrayList<Producto> productos = new ArrayList();

            while (resultado.next()) {
                p = new Producto();

                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));

                productos.add(p);
            }

            return productos;
        } catch (Exception e) {
            System.out.println("ERROR! buscarProductos");
            
            throw e;
        }finally {
            desconectarBase();
        }
    }

    //e) Listar el nombre y el precio del producto más barato.
    public Producto buscarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio LIMIT 1";
            consultarBase(sql);

            Producto p = new Producto();

            while (resultado.next()) {
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));

            }

            return p;
        } catch (Exception e) {
            System.out.println("ERROR! buscarProductoMasBarato");
            
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    // f) Ingresar un producto a la base de datos.
    public void ingresarProducto(Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Error al ingresar el producto");
            }
            
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" + p.getNombre() + "'," + p.getPrecio()+ "," + p.getCodigoFabricante() + ")";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            System.out.println("ERROR! ingresarProducto");
            
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    //g) Ingresar un fabricante a la base de datos
    public void ingresarFabricante(Fabricante f) throws Exception {
        try {
            if (f == null) {
                throw new Exception("Error al ingresar el fabricante");
            }
            
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + f.getNombre() + "')";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            System.out.println("ERROR! ingresarFabricante");
            
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    // h) Editar un producto con datos a elección.
    public void editarProducto(Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Error al editar el producto");
            }
            
            String sql = "UPDATE producto SET "
                    + "nombre = '" + p.getNombre()+ "', " + "precio = " + p.getPrecio()+ ", " + "codigo_fabricante = " + p.getCodigoFabricante()
                    + " WHERE codigo = " + p.getCodigo() + " "; 
            
            insertarModificarEliminar(sql);
        }catch (Exception e) {
            System.out.println("ERROR! editarProducto");
            
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
