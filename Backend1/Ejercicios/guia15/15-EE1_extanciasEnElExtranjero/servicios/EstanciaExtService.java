package servicios;

import entidades.*;
import persistencia.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/*

 */
public class EstanciaExtService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();
    private final CasaDAO casaDAO = new CasaDAO();
    private final FamiliaDAO familiaDAO = new FamiliaDAO();
    private final ClienteDAO clienteDAO = new ClienteDAO();
    private final EstanciaDAO estanciaDAO = new EstanciaDAO();

    public void listarCasas(String opc) throws Exception {
        ArrayList<Casa> casas = new ArrayList();

        casas = casaDAO.listarCasas(opc);

        for (Casa casa : casas) {
            if ("h".equals(opc)) {
                System.out.println("Pais: " + casa.getPais() + " | Cantidad de casas: " + casa.getNumero());
            } else {
                System.out.println(casa);
            }
        }
    }

    public void listarFamilias(String opc) throws Exception {
        ArrayList<Familia> familias = new ArrayList();

        familias = familiaDAO.listarfamilia(opc);

        for (Familia familia : familias) {

            System.out.println(familia);

        }
    }

    public void listarClientes(String opc) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList();

        clientes = clienteDAO.listarClientes(opc);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarEstancias(String opc) throws Exception {
        ArrayList<String> estancias = new ArrayList();

        estancias = estanciaDAO.listarEstancias(opc);

        for (String estancia : estancias) {
            System.out.println(estancia);
        }
    }

    public void ingresarEstancia() throws Exception {
        Estancia e = new Estancia();

        try {
            System.out.println("INGRESAR ESTANCIA");
//            System.out.println("id del cliente: ");
//            e.setId_cliente(leer.nextInt());
//
//            System.out.println("id de la casa: ");
//            e.setId_casa(leer.nextInt());
//
//            System.out.println("Nombre del huesped: ");
//            e.setNombre_huesped(leer.next());
//
//            System.out.println("Fecha inicio: Ingresar año, mes y dia");
//            e.setFecha_desde(new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt()));
//            
//            System.out.println("Fecha final: Ingresar año, mes y dia");
//            e.setFecha_hasta(new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt()));

              e.setId_cliente(1);
              e.setId_casa(1);
              e.setNombre_huesped("coca");
              e.setFecha_desde(new Date(2020 - 1900, 6 - 1, 2));
              e.setFecha_hasta(new Date(2021 - 1900, 5 - 1, 31));

            estanciaDAO.ingresarEstancia(e);
        } catch (Exception ext) {
            System.out.println(ext);
            System.out.println("ERROR! ingresarEstancia Service");
        }

    }

    public void menu() {
        try {
            String opc;

            do {
                System.out.println("\n a) Familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años."
                        + "\n b) Casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido."
                        + "\n c) Familias cuya dirección de mail sea de Hotmail."
                        + "\n d) Casas disponibles a partir de una fecha dada y un número de días específico."
                        + "\n e) Datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron"
                        + "\n f) Mostrar las estancias que han sido reservadas por un cliente, información de la casa que reservó."
                        + "\n g) Incrementar el precio por día en un 5% de todas las casas del Reino Unido."
                        + "\n h) Obtener el número de casas que existen para cada uno de los países diferentes."
                        + "\n i) Casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’."
                        + "\n j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas."
                        + "\n k) Salir"
                        + "\n Elija una opcion: ");
                opc = leer.next().toLowerCase();

                switch (opc) {
                    case "a":
                    case "c":
                        System.out.println("FAMILIAS");
                        listarFamilias(opc);
                        subMenu();
                        break;
                    case "b":
                    case "d":
                    case "g":
                    case "h":
                    case "i":
                        System.out.println("CASAS");
                        listarCasas(opc);
                        subMenu();
                        break;
                    case "e":
                        System.out.println("CLIENTES");
                        listarClientes(opc);
                        subMenu();
                        break;
                    case "f":
                        System.out.println("ESTANCIAS");
                        listarEstancias(opc);
                        subMenu();
                        break;
                    case "j":
                        ingresarEstancia();
                        subMenu();
                        break;
                    case "k":
                        System.out.println("Gracias por venir, gracias por estar");
                        break;
                    default:
                        System.out.println("ERROR! Opcion incorrecta");
                }
            } while (!"k".equals(opc));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void subMenu() {
        System.out.println("Apreta enter para continuar...");
        leer.next();
    }
}
