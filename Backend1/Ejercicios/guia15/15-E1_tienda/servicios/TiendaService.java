package servicios;

import entidades.Fabricante;
import entidades.Producto;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import persistencia.TiendaDAO;

/*
Paquete servicios:
En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. En
general se crea un servicio para administrar cada una de las entidades y algunos servicios
para manejar operaciones muy específicas como las estadísticas.
    
Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
 */
public class TiendaService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();
    private final TiendaDAO tDAO = new TiendaDAO();

    public void listar(int op) throws Exception {
        try {
            ArrayList<Producto> p;

            // a) Lista el nombre de todos los productos que hay en la tabla producto. 
            if (op == 1) {
                p = tDAO.listaProductos();
                System.out.println("\nNOMBRES DE TODOS LOS PRODUCTOS:");
                for (int i = 0; i < p.size(); i++) {
                    System.out.println((i + 1) + "- " + p.get(i).getNombre());
                }
            }
            
            // b) Lista los nombres y los precios de todos los productos de la tabla producto.
            if (op == 2) {
                p = tDAO.listaProductos();
                System.out.println("\nNOMBRES Y PRECIOS DE TODOS LOS PRODUCTOS:");
                for (int i = 0; i < p.size(); i++) {
                    System.out.println((i + 1) + "- " + p.get(i).getNombre() + " | $" + p.get(i).getPrecio());
                }
            }
            
            // c) Listar aquellos productos que su precio esté entre 120 y 202.
            if (op == 3) {
                p = tDAO.listaProductos();
                System.out.println("\nNOMBRES Y PRECIOS DE LOS PRODUCTOS CON PRECIO ENTRE 120 Y 202:");
                for (int i = 0; i < p.size(); i++) {
                    if (p.get(i).getPrecio() >= 120 && p.get(i).getPrecio() <= 202) {
                        System.out.println((i + 1) + "- " + p.get(i).getNombre() + " | $" + p.get(i).getPrecio());
                    }
                }
            }
            
            // d) Buscar y listar todos los Portátiles de la tabla producto. 
            if (op == 4) {
                
                p = tDAO.buscarProductos("Portatil");
                System.out.println("\nNOMBRES Y PRECIOS DE LOS PRODUCTOS PORTATIL:");
                for (int i = 0; i < p.size(); i++) {
                    System.out.println((i + 1) + "- " + p.get(i).getNombre() + " | $" + p.get(i).getPrecio());
                }
            }
            
            // e) Listar el nombre y el precio del producto más barato.
            if (op == 5) {
                Producto pBarato = tDAO.buscarProductoMasBarato();
                System.out.println("\nNOMBRE Y PRECIO DEL PRODUCTO MAS BARATO:");
                System.out.println("1- " + pBarato.getNombre() + " | $" + pBarato.getPrecio());
            }
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }
    
    public void ingresarProducto(){
        try {
            Producto p = new Producto();
            System.out.println("INGRESAR UN PRODUCTO");
            
            System.out.println("Nombre:");
            p.setNombre(leer.next());
            
            System.out.println("Precio:");
            p.setPrecio(leer.nextDouble());
           
            System.out.println("Codigo del fabricante:");
            p.setCodigoFabricante(leer.nextInt());
            
            tDAO.ingresarProducto(p);
            
            System.out.println("PRODUCTO AGREGADO CON EXITO.");
            
        } catch (Exception e) {
            System.out.println("ERROR! ingresarProducto");
        }
    }
    
    public void ingresarFabricante(){
        try {
            Fabricante f = new Fabricante();
            System.out.println("INGRESAR FABRICANTE");
            
            System.out.println("Nombre:");
            f.setNombre(leer.next());
            
            tDAO.ingresarFabricante(f);
            
            System.out.println("FABRICANTE AGREGADO CON EXITO.");
            
        } catch (Exception e) {
            System.out.println("ERROR! ingresarFabricante");
        }
    }
    
    // h) Editar un producto con datos a elección.
    public void modificarProducto() {
        try {
            Producto p = new Producto();

            System.out.println("Ingrese el codigo del producto para EDITAR : ");
            p.setCodigo(leer.nextInt());
            
            System.out.println("Ingrese el nombre del producto : ");
            p.setNombre(leer.next());
            
            System.out.println("Ingrese precio del producto : ");
            p.setPrecio(leer.nextDouble());
            
            System.out.println("Ingrese codigo Fabricante : ");
            p.setCodigoFabricante(leer.nextInt());

            tDAO.editarProducto(p);
            
            System.out.println("PRODUCTO EDITADO CON EXITO");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void Menu() {
        int opc;
        try {
            do {
                System.out.println("\n*** TIENDA MENU ***\n"
                        + "1. Listar el nombre de todos los productos.\n"
                        + "2. Listar los nombres y precios de todos los productos.\n"
                        + "3. Listar productos cuyo precio esté entre 120 y 202.\n"
                        + "4. Buscar y listar todos los Portátiles.\n"
                        + "5. Listar el nombre y precio del producto más barato.\n"
                        + "6. Ingresar un producto a la base de datos.\n"
                        + "7. Ingresar un fabricante a la base de datos.\n"
                        + "8. Editar un producto con datos a elección.\n"
                        + "9. Salir.\n"
                        + "Ingrese el número de la opción deseada:"
                );
                
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        listar(opc);
                        subMenu();
                        break;
                    case 6:
                        ingresarProducto();
                        break;
                    case 7:
                        ingresarFabricante();
                        break;
                    case 8:
                        modificarProducto();
                        break;
                    case 9:
                        System.out.println("Gracias por usar la app.");
                        break;
                    default:
                        System.out.println("ERROR! Opcion incorrecta");
                }
            } while (opc != 9);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR! Menu");

            leer.next();
            Menu();
        }
    }

    private void subMenu() {
        System.out.println("Apretar enter para continuar...");
        leer.next();
    }

}
