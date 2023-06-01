package guia10.servicios;

import guia10.entidades.E6_Tienda;
import guia10.utilidades.E6_TiendaUtility;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;

/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
    
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class E6_TiendaService {

    private final Scanner leer = new Scanner(System.in);

    private void agregarProducto(HashMap<String, Double> productos) {
        E6_Tienda p = new E6_Tienda();

        p.setProducto(E6_TiendaUtility.validarNombre("Nombre del producto:", "\nIngresa el nombre por favor.", "El producto ya existe, ingrese otro por favor.", productos, false));

        p.setPrecio(E6_TiendaUtility.validarPrecio("Precio del producto:", "\nIngrese numeros positivos por favor."));

        productos.put(p.getProducto(), p.getPrecio());
    }

    private void editarPrecio(HashMap<String, Double> productos) {
        String nombre;
        Double nuevoPrecio;

        nombre = E6_TiendaUtility.validarNombre("Producto a actualizar precio:", "\nIngrese un nombre por favor.", "No se encontro el producto, ingrese otro por favor.", productos, true);

        nuevoPrecio = E6_TiendaUtility.validarPrecio("Nuevo precio del producto:", "\nIngrese numeros positivos por favor.");

        productos.replace(nombre, nuevoPrecio);
    }

    private void editarNombre(HashMap<String, Double> productos) {
        String nombreViejo;
        String nombreNuevo;

        nombreViejo = E6_TiendaUtility.validarNombre("Producto a actualizar nombre:", "\nIngrese un nombre por favor.", "No se encontro el producto, ingrese otro por favor.", productos, true);

        nombreNuevo = E6_TiendaUtility.validarNombre("Nuevo nombre del producto:", "\nIngrese un nombre por favor.", "El producto ya existe, ingrese otro por favor.", productos, false);

        //Rebuscada, la llave es final y no permite cambiarsela...
        productos.put(nombreNuevo, productos.get(nombreViejo));//agregamos producto con nuevo nombre y precio viejo.

        productos.remove(nombreViejo);//eliminamos producto viejo.
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        String nombre;

        nombre = E6_TiendaUtility.validarNombre("Producto a eliminar:", "\nIngrese un nombre por favor.", "No se encontro el producto, ingrese otro por favor.", productos, true);

        productos.remove(nombre);
    }

    public HashMap<String, Double> ordenamiento(HashMap<String, Double> productos, String[] title) {       
        int opc;
        boolean b = false;

        do {
            String msg = "*** ¿Como deseas ordenar? ***\n"
                    + "1- Precio de mayor a menor.\n"
                    + "2- Precio de menor a mayor. \n"
                    + "3- Nombre de mayor a menor. \n"
                    + "4- Nombre de menor a mayor. \n"
                    + "Elegi una opcion...";

            if (b) {//en caso de ingresar algo mal se añade esta frase.
                msg += "\n\nOpcion incorrecta.";
            }
            b = false;

            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            } catch (NumberFormatException e) {//validacion por si ingresa letras.
                opc = 6;
            }

            switch (opc) {
                case 1:
                    productos = (HashMap<String, Double>) E6_TiendaUtility.ordenarValorDesc(productos);
                    
                    title[0] = "Tienda: precio de mayor a menor.";
                    break;
                case 2:
                    productos = (HashMap<String, Double>) E6_TiendaUtility.ordenarValorAsc(productos);
                    
                    title[0] = "Tienda: precio de menor a mayor.";
                    break;
                case 3:
                    productos = (HashMap<String, Double>) E6_TiendaUtility.ordenarNombreDesc(productos);
                    
                    title[0] = "Tienda: nombre de mayor a menor.";
                    break;
                case 4:
                    productos = (HashMap<String, Double>) E6_TiendaUtility.ordenarNombreAsc(productos);

                    title[0] = "Tienda: nombre de menor a mayor.";
                    break;
                default:
                    b = true;
            }

        } while (b);

        return productos;
    }

    private void mostrarProductos(HashMap<String, Double> productos) {
        String msg = "*** Todos los productos ***";
        String title[] = {"Tienda"}; 
        int acu;
        
        
        if (JOptionPane.showConfirmDialog(null, "¿Quieres ordenarlos?", "Tienda", 0) == 0) {
            //como productos no se actualizaba como referencia, tuve que retornarlo en la funcion, y utilizar un array de string para manejar el title.
            productos = ordenamiento(productos, title);
        }

        acu = 1;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            msg += "\n_________________"
                    + "\nProducto N°" + acu
                    + "\nNombre: " + entry.getKey()
                    + "\nPrecio: $" + entry.getValue().intValue();

            acu++;
        }

        JTextArea jta = new JTextArea(msg); //espacio grande.
        JScrollPane jsp = new JScrollPane(jta) { //permite hacer scroll si hay muchos productos.
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(520, 520);
            }
        };

        JOptionPane.showMessageDialog(null, jsp, title[0], JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarProducto(HashMap<String, Double> productos) {
        String nombre, msg;

        nombre = E6_TiendaUtility.validarNombre("Producto a buscar:", "\nIngrese un nombre por favor.", "No se encontro el producto, ingrese otro por favor.", productos, true);

        msg = "_________________"
                + "\nProducto"
                + "\nNombre: " + nombre
                + "\nPrecio: $" + productos.get(nombre);

        JOptionPane.showMessageDialog(null, msg);
    }

    private int subMenu(String frase) {
        String msg = frase + "\n\n¿Quieres continuar?";

        if (JOptionPane.showConfirmDialog(null, msg, "Tienda", 0) == 0) {
            return 0;
        }

        return 7;
    }
    /*
    Menu general. Crea el hashMap de productos y a partir de eso
    le permite al usuario elegir distintas opciones, donde la misma
    llamara a las funciones para realizar la peticion.
    */
    private void menu() {
        HashMap<String, Double> productos = new HashMap<>();

        JOptionPane.showMessageDialog(null, "¡Bienvenido a la tienda!");

        int opc;
        boolean b = false;

        do {
            String msg = "*** MENU TIENDA ***\n"
                    + "1- Agregar producto.\n"
                    + "2- Editar precio producto. \n"
                    + "3- Editar nombre producto. \n"
                    + "4- Eliminar producto. \n"
                    + "5- Mostrar productos. \n"
                    + "6- Mostrar producto especifico. \n"
                    + "7- Salir. \n"
                    + "Elegi una opcion...";

            if (b) {//en caso de ingresar algo mal se añade esta frase.
                msg += "\n\nOpcion incorrecta.";
            }
            b = false;

            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            } catch (NumberFormatException e) {//validacion por si ingresa letras.
                opc = 8;
            }

            switch (opc) {
                case 1:
                    agregarProducto(productos);

                    opc = subMenu("¡Producto agregado con exito!");
                    break;
                case 2:
                    editarPrecio(productos);

                    opc = subMenu("¡Producto editado con exito!");
                    break;
                case 3:
                    editarNombre(productos);

                    opc = subMenu("¡Producto editado con exito!");
                    break;
                case 4:
                    eliminarProducto(productos);

                    opc = subMenu("¡Producto eliminado con exito!");
                    break;
                case 5:
                    mostrarProductos(productos);

                    opc = subMenu("¡Productos mostrados con exito!");
                    break;
                case 6:
                    mostrarProducto(productos);

                    opc = subMenu("¡Producto mostrado con exito!");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "¡Gracias por usar nuestra tienda!");
                    break;
                default:
                    b = true;
            }
        } while (opc != 7);
    }
    
    /*
    Funcion principal. Seteamos estilos con UIManager y llamamos al menu().
    */
    public void tienda() {
        Color color = new Color(32, 139, 223);//color general.
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 40);//fuente general.

        UIManager.put("OptionPane.background", color);//color del borde de la ventana
        UIManager.put("Panel.background", color);//color del fondo de la ventana
        UIManager.put("OptionPane.minimumSize", new Dimension(500, 500));//tamaño minimo de la ventana
        UIManager.put("OptionPane.messageFont", font);//fuente a los mensajes.
        UIManager.put("OptionPane.buttonFont", font);//fuente a los botones.

        UIManager.put("TextField.font", new FontUIResource(font));//aumentar tamaño input.
        UIManager.put("TextField.margin", new InsetsUIResource(0, 0, 0, -100));

        UIManager.put("TextArea.font", font);
        UIManager.put("TextArea.background", color);

        menu();
    }
}
