package principal;

import entidades.Autor;
import entidades.Editorial;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;
import servicios.AutorService;
import servicios.EditorialService;
import servicios.LibroService;

public class E1_librearia {

    /*
        El objetivo de este ejercicio es el desarrollo de un sistema de guardado de libros en JAVA
utilizando una base de datos MySQL y JPA como framework de persistencia.
    
Creación de la Base de Datos MySQL:
Lo primero que se debe hacer es crear la base de datos sobre el que operará el sistema de
reservas de libros. Para ello, se debe abrir el IDE de base de datos que se está utilizando
(Workbench) y ejecutar la siguiente sentencia:
CREATE DATABASE libreria;
De esta manera se habrá creado una base de datos vacía llamada librería.
    
------------------------------------------------------------         
Paquetes del Proyecto Java:
Los paquetes que se utilizarán para este proyecto son los siguientes:
• entidades: en este paquete se almacenarán aquellas clases que se quiere persistir en la
base de datos.
• servicios: en este paquete se almacenarán aquellas clases que llevarán adelante la lógica
del negocio. En general se crea un servicio para administrar las operaciones CRUD
(Create, Remove, Update, Delete) cada una de las entidades y las consultas de cada
entidad.
    
------------------------------------------------------------         
Nota: En este proyecto vamos a eliminar entidades, pero no es considerado una buena
práctica. Por esto, además de eliminar nuestras entidades, vamos a practicar que nuestras
entidades estén dadas de alta o de baja. Por lo que las entidades tendrán un atributo “activo”
de tipo booleano, que estará en true al momento de crearlas y en false cuando las demos de
baja, para evitar eliminarlas de la base de datos.
   
------------------------------------------------------------         
    a) Entidades
Crearemos el siguiente modelo de entidades:

Entidad Libro
La entidad libro modela los libros que están disponibles en la biblioteca para ser prestados. En
esta entidad, el atributo “ejemplares” contiene la cantidad total de ejemplares de ese libro,
mientras que el atributo “ejemplaresPrestados” contiene cuántos de esos ejemplares se
encuentran prestados en este momento y el atributo “ejemplaresRestantes” contiene cuántos
de esos ejemplares quedan para prestar.
    
Entidad Autor
La entidad autor modela los autores de libros.
    
Entidad Editorial
La entidad editorial modela las editoriales que publican libros.
    
------------------------------------------------------------      
b) Unidad de Persistencia
Para configurar la unidad de persistencia del proyecto, se recomienda leer el Instructivo
Unidad de Persistencia recuerde hacer click con el botón derecho sobre el proyecto y
seleccionar nuevo. A continuación, se debe seleccionar la opción de Persistence Unit como se
indica en la siguiente imagen.
           
    Base de Datos
Para este proyecto nos vamos a conectar a la base de datos Librería, que creamos
previamente.
    
Generación de Tablas
La estrategia de generación de tablas define lo que hará JPA en cada ejecución, si debe crear
las tablas faltantes, si debe eliminar todas las tablas y volver a crearlas o no hacer nada.
Recomendamos en este proyecto utilizar la opción: “Create”
    
Librería de Persistencia
Se debe seleccionar para este proyecto la librería “EclipseLink”.
    
------------------------------------------------------------             
c) Servicios
AutorServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar autores (consulta, creación, modificación y eliminación).
    
EditorialServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar editoriales (consulta, creación, modificación y eliminación)
    
LibroServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar libros (consulta, creación, modificación y eliminación).
    
------------------------------------------------------------             
    d) Main
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
interactuar con el usuario. En esta clase se muestra el menú de opciones con las operaciones
disponibles que podrá realizar el usuario.
    
------------------------------------------------------------   
e) Tareas a realizar
Al alumno le toca desarrollar, las siguientes funcionalidades:
1) Crear base de datos Librería
2) Crear unidad de persistencia
3) Crear entidades previamente mencionadas (excepto Préstamo)
4) Generar las tablas con JPA
5) Crear servicios previamente mencionados.
6) Crear los métodos para persistir entidades en la base de datos librería
7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.
     */
    static Random rand = new Random();
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) throws Exception {
        LibroService ls = new LibroService();
        AutorService as = new AutorService();
        EditorialService es = new EditorialService();

        try {
            int opc;
            do {
                mostrarMenu();
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println(" Ingrese el nombre del Autor : ");
                        as.crearAutor(leer.next());
                        break;
                    case 2:
                        System.out.println(" Ingrese el nombre del Editorial : ");
                        es.crearEditorial(leer.next());
                        break;
                    case 3:
                        System.out.println(" Ingrese el isbn del Libro : ");
                        Long isbn = leer.nextLong();

                        System.out.println(" Ingrese el nombre del Libro : ");
                        String nombreLibro = leer.next();

                        System.out.println(" Ingrese el nombre del Autor : ");
                        String nombreAutor2 = leer.next();

                        System.out.println(" Ingrese el nombre del Editorial : ");
                        String nombreEditorial2 = leer.next();

                        System.out.println(" Ingrese el Año : ");
                        int anio = leer.nextInt();

                        System.out.println(" Ingrese Cantidad Ejemplares : ");
                        int ejm = leer.nextInt();

                        ls.crearLibro(isbn, nombreLibro, anio, ejm, as.buscarAutor(nombreAutor2), es.buscarEditorial(nombreEditorial2));
                        break;
                    case 4:
                        System.out.println(" Ingrese el ID de Autor");
                        Integer id = leer.nextInt();

                        System.out.println(" Ingrese el NUEVO nombre del Autor : ");
                        String nombreAutor3 = leer.next();

                        as.editarAutor(id, nombreAutor3);
                        break;
                    case 5:
                        System.out.println(" Ingrese el ID de Editorial");
                        Integer id2 = leer.nextInt();

                        System.out.println(" Ingrese el NUEVO nombre del Editorial : ");
                        String nombreAutor4 = leer.next();

                        es.editarEditorial(id2, nombreAutor4);
                        break;
                    case 6:
                        System.out.println(" Ingrese el ID del Libro");
                        Long id3 = leer.nextLong();

                        System.out.println(" Ingrese el nombre del Libro : ");
                        String nombreLibro2 = leer.next();

                        System.out.println(" Ingrese el nombre del Autor : ");
                        String nombreAutor5 = leer.next();

                        System.out.println(" Ingrese el nombre del Editorial : ");
                        String nombreEditorial5 = leer.next();

                        System.out.println(" Ingrese el Año : ");
                        int anio2 = leer.nextInt();

                        System.out.println(" Ingrese Cantidad Ejemplares : ");
                        int ejm2 = leer.nextInt();

                        ls.editarLibro(id3, nombreLibro2, anio2, ejm2, as.buscarAutor(nombreAutor5), es.buscarEditorial(nombreEditorial5));
                        break;
                    case 7:
                        System.out.println("Ingrese el ID : ");
                        int idas = leer.nextInt();

                        System.out.println(" Que desea dar de alta ?\n"
                                + "1- LIBRO.\n"
                                + "2- EDITORIAL.\n"
                                + "3- AUTOR.");
                        int resp = leer.nextInt();

                        switch (resp) {
                            case 1:
                                ls.darDeAltaLibro(Long.valueOf(idas));
                                break;
                            case 2:
                                es.darDeAltaEditorial(idas);
                                break;
                            case 3:
                                as.darDeAltaAutor(idas);
                                break;
                            default:
                                System.out.println("ERROR! Opcion incorrecta.");
                        }
                        break;
                    case 8:
                        System.out.println("Ingrese el ID : ");
                        int idas2 = leer.nextInt();

                        System.out.println(" Que desea dar de baja ?\n"
                                + "1- LIBRO.\n"
                                + "2- EDITORIAL.\n"
                                + "3- AUTOR.");
                        int resp2 = leer.nextInt();

                        switch (resp2) {
                            case 1:
                                ls.darDeBajaLibro(Long.valueOf(idas2));
                                break;
                            case 2:
                                es.darDeBajaEditorial(idas2);
                                break;
                            case 3:
                                as.darDeBajaAutor(idas2);
                                break;
                            default:
                                System.out.println("ERROR! Opcion incorrecta.");
                        }
                        break;
                    case 9:
                        System.out.println("Ingrese el nombre del Autor : ");

                        as.buscarAutor(leer.next());
                        break;
                    case 10:
                        System.out.println("Ingrese el nombre de la Editorial : ");

                        es.buscarEditorial(leer.next());
                        break;
                    case 11:
                        String var;
                        do {
                            mostrarMenuBuscar();
                            
                            var = leer.next();
                            switch (var) {
                                case "a":
                                    System.out.println("Ingrese el ISBN : ");
                                    ls.buscarLibroPorId(leer.nextLong());
                                    break;
                                case "b":
                                    System.out.println("Ingrese el nombre del libro: ");
                                    ls.buscarLibroPorNombre(leer.next());
                                    break;
                                case "c":
                                    System.out.println("Ingrese el nombre : ");
                                    ls.buscarLibroPorNombreAutor(leer.next());
                                    break;
                                case "d":
                                    System.out.println("Ingrese el nombre : ");
                                    ls.buscarLibroPorNombreEditorial(leer.next());
                                    break;
                                case "f":
                                    System.out.println(" Saliendo de Buscar Libro \n");
                                    break;
                                default:
                                    System.out.println("Ingreso mal la opcion");
                            }
                        } while (!"f".equals(var));
                    case 0:
                        System.out.println("Gracias por usar la app.");
                        break;
                    default:
                        System.out.println(" Ingreso mal la OPCION vuelva a ingresar :");
                        opc = leer.nextInt();
                }
            } while (opc != 0);

        } catch (Exception e) {
            System.out.println("ERROR 404");
            System.out.println(e);
        }
    }

    public static void mostrarMenuBuscar() {
        System.out.println("\n Ingrese la OPCION de Busqueda : "
                + "\n a) Por ISBN "
                + "\n b) Por Nombre "
                + "\n c) Por Nombre de Autor "
                + "\n d) Por Nombre de Editorial"
                + "\n f) Salir ");
    }

    public static void mostrarMenu() {

        System.out.println("\n ---- MENU ----");
        System.out.println("\n 1 - Crear Autor "
                + "\n 2 - Crear Editorial "
                + "\n 3 - Crear Libro "
                + "\n 4 - Editar Autor "
                + "\n 5 - Editar Editorial "
                + "\n 6 - Editar Libro "
                + "\n 7 - Dar de Alta "
                + "\n 8 - Dar de Baja "
                + "\n 9 - Buscar Autor "
                + "\n 10 - Buscar Editorial "
                + "\n 11 - Buscar Libro "
                // + "\n 11 - Eliminar Autor/Libro/Editorial"
                + "\n 0 - Salir "
                + "\n Ingrese la OPCION : ");
    }

}
