package principal;

import entidades.Prestamo;
import java.util.Date;
import java.util.List;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;
import servicios.AutorService;
import servicios.ClienteService;
import servicios.EditorialService;
import servicios.LibroService;
import servicios.PrestamoService;

public class E1_librearia {

    /*
        Sistema de Reservas de una Librería
Vamos a continuar con el ejercicio anterior. Ahora el objetivo de este ejercicio es el desarrollo
de un sistema de reserva de libros en JAVA. Para esto vamos a tener que sumar nuevas
entidades a nuestro proyecto en el paquete de entidades y crearemos los servicios de esas
entidades.
Usaremos la misma base de datos y se van a crear las tablas que nos faltan. Deberemos
agregar las entidades a la unidad de persistencia.
    
----------------------------------------------------------------------------------------------
a) Entidades
Crearemos el siguiente modelo de entidades:

Entidad Cliente
La entidad cliente modela los clientes (a quienes se les presta libros) de la biblioteca. Se
almacenan los datos personales y de contacto de ese cliente.
    
Entidad Préstamo
La entidad préstamo modela los datos de un préstamo de un libro. Esta entidad registra la
fecha en la que se efectuó el préstamo y la fecha en la que se devolvió el libro. Esta
entidad también registra el libro que se llevo en dicho préstamo y quien fue el cliente al
cual se le prestaron.
 
----------------------------------------------------------------------------------------------
b) Servicios
ClienteServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar clientes (consulta, creación, modificación y eliminación).
    
PrestamoServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
generar prestamos, va a guardar la información del cliente y del libro para persistirla en la
base de datos. (consulta, creación, modificación y eliminación).
    
----------------------------------------------------------------------------------------------
c) Tareas a realizar: Al alumno le toca desarrollar, las siguientes funcionalidades:
2) Creación de un Cliente nuevo
3) Crear entidad Préstamo
4) Registrar el préstamo de un libro.
5) Devolución de un libro.
6) Búsqueda de todos los préstamos de un Cliente.
• Agregar validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.
• No generar condiciones inválidas. Por ejemplo, no se debe permitir prestar más
ejemplares de los que hay, ni devolver más de los que se encuentran prestados.
No se podrán prestar libros con fecha anterior a la fecha actual, etc.
    
     */
    static Random rand = new Random();
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static final LibroService ls = new LibroService();
    static final AutorService as = new AutorService();
    static final EditorialService es = new EditorialService();
    static final ClienteService cs = new ClienteService();
    static final PrestamoService ps = new PrestamoService();

    public static void continuar() {
        System.out.println("Apreta enter para continuar...");
        leer.next();
    }

    public static void main(String[] args) throws Exception {
        int opc;
        do {
            try {
                System.out.println("\n*** MENU LIBRERIA ***\n"
                        + "1- Autor.\n"
                        + "2- Editorial.\n"
                        + "3- Libro.\n"
                        + "4- Cliente.\n"
                        + "5- Prestamo.\n"
                        + "0- Salir de la app.\n"
                        + "Elija una opcion...");
                opc = leer.nextInt();

                switch (opc) {
                    case 1:
                        menuAutor();

                        break;
                    case 2:
                        menuEditorial();

                        break;
                    case 3:
                        menuLibro();

                        break;
                    case 4:
                        menuCliente();

                        break;
                    case 5:
                        menuPrestamo();

                        break;
                    case 0:
                        System.out.println("Gracias por usar nuestra app :)");
                        break;
                    default:
                        System.out.println("ERROR! Opcion incorrecta.");
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Sucedio un error, manco.");

                leer.next();

                opc = 1;
            }
        } while (opc != 0);
    }

    public static void menuAutor() throws Exception {
        int opc;
        do {
            System.out.println("\n*** MENU AUTOR ***\n"
                    + "1- Crear.\n"
                    + "2- Editar.\n"
                    + "3- Dar de alta.\n"
                    + "4- Dar de baja.\n"
                    + "5- Buscar.\n"
                    + "0- Salir menu autor.\n"
                    + "Elija una opcion...");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("*** CREAR AUTOR ***");

                    System.out.println("Nombre: ");
                    as.crearAutor(leer.next());

                    continuar();
                    break;
                case 2:
                    System.out.println("*** EDITAR AUTOR ***");

                    System.out.println("ID: ");
                    Integer id = leer.nextInt();

                    System.out.println("NUEVO nombre: ");
                    String nombreAutor3 = leer.next();

                    as.editarAutor(id, nombreAutor3);

                    continuar();
                    break;
                case 3:
                    System.out.println("*** DAR DE ALTA AUTOR ***");

                    System.out.println("ID: ");
                    id = leer.nextInt();

                    as.darDeAltaAutor(id);

                    continuar();
                    break;
                case 4:
                    System.out.println("*** DAR DE BAJA AUTOR ***");

                    System.out.println("ID: ");
                    id = leer.nextInt();

                    as.darDeBajaAutor(id);

                    continuar();
                    break;
                case 5:
                    System.out.println("*** BUSCAR AUTOR ***");

                    System.out.println("Nombre del Autor: ");
                    as.buscarAutor(leer.next());

                    continuar();
                    break;
                case 0:
                    System.out.println("Saliendo menu autor.");
                    break;
                default:
                    System.out.println("ERROR! Opcion incorrecta.");
            }
        } while (opc != 0);

    }

    public static void menuEditorial() throws Exception {
        int opc;
        do {
            System.out.println("\n*** MENU EDITORIAL ***\n"
                    + "1- Crear.\n"
                    + "2- Editar.\n"
                    + "3- Dar de alta.\n"
                    + "4- Der de baja.\n"
                    + "5- Buscar.\n"
                    + "0- Salir menu editorial.\n"
                    + "Elija una opcion...");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("*** CREAR EDITORIAL ***");

                    System.out.println("Nombre: ");
                    es.crearEditorial(leer.next());

                    continuar();
                    break;
                case 2:
                    System.out.println("*** EDITAR EDITORIAL ***");

                    System.out.println("ID: ");
                    Integer id = leer.nextInt();

                    System.out.println("NUEVO nombre: ");
                    String nombreAutor = leer.next();

                    es.editarEditorial(id, nombreAutor);

                    continuar();
                    break;
                case 3:
                    System.out.println("*** DAR DE ALTA EDITORIAL ***");

                    System.out.println("ID: ");
                    id = leer.nextInt();

                    es.darDeAltaEditorial(id);

                    continuar();
                    break;
                case 4:
                    System.out.println("*** DAR DE BAJA EDITORIAL ***");

                    System.out.println("ID: ");
                    id = leer.nextInt();

                    es.darDeBajaEditorial(id);

                    continuar();
                    break;
                case 5:
                    System.out.println("*** BUSCAR EDITORIAL ***");

                    System.out.println("Nombre de la Editorial : ");
                    es.buscarEditorial(leer.next());

                    continuar();
                    break;
                case 0:
                    System.out.println("Saliendo menu editorial.");
                    break;
                default:
                    System.out.println("ERROR! Opcion incorrecta.");
            }
        } while (opc != 0);

    }

    public static void menuLibro() throws Exception {
        int opc;
        do {
            System.out.println("\n*** MENU LIBRO ***\n"
                    + "1- Crear.\n"
                    + "2- Editar.\n"
                    + "3- Dar de alta.\n"
                    + "4- Der de baja.\n"
                    + "5- Buscar.\n"
                    + "0- Salir menu libro.\n"
                    + "Elija una opcion...");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("*** CREAR LIBRO ***");

                    System.out.println("ISBN: ");
                    Long isbn = leer.nextLong();

                    System.out.println("Nombre: ");
                    String nombreLibro = leer.next();

                    System.out.println("Nombre del Autor: ");
                    String nombreAutor = leer.next();

                    System.out.println("Nombre de la Editorial: ");
                    String nombreEditorial = leer.next();

                    System.out.println("Año: ");
                    int anio = leer.nextInt();

                    System.out.println("Cantidad Ejemplares: ");
                    int ejm = leer.nextInt();

                    ls.crearLibro(isbn, nombreLibro, anio, ejm, as.buscarAutor(nombreAutor), es.buscarEditorial(nombreEditorial));

                    continuar();
                    break;
                case 2:
                    System.out.println("*** EDITAR LIBRO ***");

                    System.out.println("ISBN: ");
                    isbn = leer.nextLong();

                    System.out.println("Nombre: ");
                    nombreLibro = leer.next();

                    System.out.println("Nombre del Autor: ");
                    nombreAutor = leer.next();

                    System.out.println("Mombre de la Editorial: ");
                    nombreEditorial = leer.next();

                    System.out.println("Año: ");
                    anio = leer.nextInt();

                    System.out.println("Cantidad Ejemplares: ");
                    ejm = leer.nextInt();

                    ls.editarLibro(isbn, nombreLibro, anio, ejm, as.buscarAutor(nombreAutor), es.buscarEditorial(nombreEditorial));

                    continuar();
                    break;
                case 3:
                    System.out.println("*** DAR DE ALTA LIBRO ***");

                    System.out.println("ID: ");
                    isbn = leer.nextLong();

                    ls.darDeAltaLibro(isbn);

                    continuar();
                    break;
                case 4:
                    System.out.println("*** DAR DE BAJA LIBRO ***");

                    System.out.println("ID: ");
                    isbn = leer.nextLong();

                    ls.darDeBajaLibro(isbn);

                    continuar();
                    break;
                case 5:
                    System.out.println("*** BUSCAR LIBRO ***");

                    String var;
                    do {
                        System.out.println("\nIngrese la OPCION de Busqueda: "
                                + "\na) Por ISBN "
                                + "\nb) Por Nombre "
                                + "\nc) Por Nombre de Autor "
                                + "\nd) Por Nombre de Editorial"
                                + "\nf) Salir ");

                        var = leer.next();
                        switch (var) {
                            case "a":
                                System.out.println("ISBN: ");
                                ls.buscarLibroPorId(leer.nextLong());
                                break;
                            case "b":
                                System.out.println("Nombre del libro: ");
                                ls.buscarLibroPorNombre(leer.next());
                                break;
                            case "c":
                                System.out.println("Nombre del autor: ");
                                ls.buscarLibroPorNombreAutor(leer.next());
                                break;
                            case "d":
                                System.out.println("Nombre de la editorial: ");
                                ls.buscarLibroPorNombreEditorial(leer.next());
                                break;
                            case "f":
                                System.out.println("Saliendo de Buscar Libro.\n");
                                break;
                            default:
                                System.out.println("ERROR! Opcion incorrecta.");
                        }
                    } while (!"f".equals(var));

                    continuar();
                    break;
                case 0:
                    System.out.println("Saliendo menu libro.");
                    break;
                default:
                    System.out.println("ERROR! Opcion incorrecta.");
            }
        } while (opc != 0);

    }

    public static void menuCliente() throws Exception {
        int opc;
        do {
            System.out.println("\n*** MENU CLIENTE ***\n"
                    + "1- Crear.\n"
                    + "2- Editar.\n"
                    + "3- Eliminar.\n"
                    + "4- Buscar.\n"
                    + "0- Salir menu cliente.\n"
                    + "Elija una opcion...");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("*** CREAR CLIENTE ***");

                    System.out.println("Documento:");
                    Long documento = leer.nextLong();

                    System.out.println("Nombre:");
                    String nombre = leer.next();

                    System.out.println("Apellido:");
                    String apellido = leer.next();

                    System.out.println("Telefono:");
                    String telefono = leer.next();

                    cs.crearCliente(documento, nombre, apellido, telefono);

                    continuar();
                    break;
                case 2:
                    System.out.println("*** EDITAR CLIENTE ***");

                    System.out.println("Documento:");
                    documento = leer.nextLong();

                    System.out.println("Nombre:");
                    nombre = leer.next();

                    System.out.println("Apellido:");
                    apellido = leer.next();

                    System.out.println("Telefono:");
                    telefono = leer.next();

                    cs.editarCliente(documento, nombre, apellido, telefono);

                    continuar();
                    break;
                case 3:
                    System.out.println("*** ELIMINAR CLIENTE ***");

                    System.out.println("Documento:");
                    cs.eliminarCliente(leer.nextLong());

                    continuar();
                    break;
                case 4:
                    System.out.println("*** BUSCAR CLIENTE ***");

                    String var;
                    do {
                        System.out.println("\nIngrese la OPCION de Busqueda: "
                                + "\na) Por Id."
                                + "\nb) Por Documento."
                                + "\nc) Por Nombre."
                                + "\nd) Por Apellido."
                                + "\nf) Salir de Buscar cliente.");

                        var = leer.next();

                        switch (var) {
                            case "a":
                                System.out.println("Id:");
                                cs.buscarClienteId(leer.nextInt());
                                break;
                            case "b":
                                System.out.println("Documento:");
                                cs.buscarClienteDocumento(leer.nextLong());
                                break;
                            case "c":
                                System.out.println("Nombre:");
                                cs.buscarClientesNombre(leer.next());
                                break;
                            case "d":
                                System.out.println("Apellido:");
                                cs.buscarClientesApellido(leer.next());
                                break;
                            case "f":
                                System.out.println("Saliendo de buscar cliente.");
                                break;
                            default:
                                System.out.println("ERROR! Opcion incorrecta.");
                        }

                    } while (!"f".equals(var));

                    continuar();
                    break;
                case 0:
                    System.out.println("Saliendo menu cliente.");
                    break;
                default:
                    System.out.println("ERROR! Opcion incorrecta.");
            }
        } while (opc != 0);
    }

    public static void menuPrestamo() throws Exception {
        int opc;
        do {
            System.out.println("\n*** MENU PRESTAMO ***\n"
                    + "1- Pedir.\n"
                    + "2- Devolver.\n"
                    + "3- Buscar prestamos de un cliente.\n"
                    + "0- Salir menu prestamo.\n"
                    + "Elija una opcion...");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("*** PEDIR PRESTAMO ***");

                    System.out.println("Documento del cliente: ");
                    Long documento = leer.nextLong();

                    System.out.println("Nombre del libro: ");
                    String nombre = leer.next();

                    Date fechaPrestamo = new Date();
                    System.out.println("Fecha prestamo: " + fechaPrestamo);

                    System.out.println("Fecha devolucion: YYYY/MM/DD");
                    Date fechaDevolucion = new Date(leer.nextInt() - 1900, leer.nextInt() + 1, leer.nextInt());

                    ps.añadirPrestamo(fechaPrestamo, fechaDevolucion, ls.buscarLibroPorNombre(nombre), cs.buscarClienteDocumento(documento));

                    continuar();
                    break;
                case 2:
                    System.out.println("*** DEVOLVER PRESTAMO ***");

                    System.out.println("Documento cliente:");
                    List<Prestamo> prestamos = ps.buscarPrestamosCliente(leer.nextLong());

                    if (prestamos.isEmpty()) {
                        System.out.println("No tiene prestamos.");

                        continuar();
                        break;
                    }

                    String msg = "* Prestamos a devolver *\n";

                    for (int i = 0; i < prestamos.size(); i++) {
                        msg += (i + 1) + "- " + prestamos.get(i) + ". \n";
                    }

                    msg += "Elija una opcion...";
                    
                    int resp;
                    do {
                        System.out.println(msg);
                        resp = leer.nextInt();

                        if (resp < 1 || resp > prestamos.size()) {
                            System.out.println("ERROR! Opcion incorrecta.");
                        }
                    } while (resp < 1 || resp > prestamos.size());

                    ps.devolverPrestamo(prestamos.get(resp - 1).getId());

                    continuar();
                    break;
                case 3:
                    System.out.println("*** BUSCAR PRESTAMOS DE UN CLIENTE ***");

                    System.out.println("Documento:");
                    prestamos = ps.buscarPrestamosCliente(leer.nextLong());

                    for (Prestamo prestamo : prestamos) {
                        System.out.println(prestamo);
                    }

                    continuar();
                    break;
                case 0:
                    System.out.println("Saliendo menu prestamo.");
                    break;
                default:
                    System.out.println("ERROR! Opcion incorrecta.");
            }
        } while (opc != 0);
    }

}
