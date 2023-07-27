package persistencia;

import entidades.Estancia;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/*
f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
la anterior

SELECT e.*, cl.nombre AS Nombre, cl.pais AS Pais, cl.ciudad AS Ciudad, c.*
FROM estancias e 
JOIN clientes cl ON e.id_cliente = cl.id_cliente
JOIN casas c ON e.id_casa = c.id_casa;


j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
INSERT INTO estancias (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) VALUES ();

 */
public class EstanciaDAO extends DAO {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();

    public void ingresarEstancia(Estancia e) throws Exception {

        try {
            //VALIDAMOS ID DEL CLIENTE
            boolean b = false;
            consultarBase("select id_cliente from clientes");
            while (resultado.next()) {
                if (e.getId_cliente() == resultado.getInt(1)) {
                    b = true;
                }
            }
            if (!b) {
                throw new Exception("Error! El id del cliente no se encuentra.");
            }

            //VALIDAMOS ID DE LA CASA
            b = false;
            consultarBase("select id_casa from casas");
            while (resultado.next()) {
                if (e.getId_casa() == resultado.getInt(1)) {
                    b = true;
                }
            }
            if (!b) {
                throw new Exception("Error! El id de la casa no se encuentra.");
            }

            // VALIDAMOS LAS FECHAS
            b = false;
            consultarBase("select fecha_desde, fecha_hasta from casas where id_casa = " + e.getId_casa());
            while (resultado.next()) {
                System.out.println(resultado.getDate(1));
                System.out.println(resultado.getDate(2));
                if (e.getFecha_desde().after(resultado.getDate(1)) && e.getFecha_hasta().before(resultado.getDate(2))) {
                    b = true;
                }
            }
            if (!b) {
                throw new Exception("Error! No hay lugar para las fechas indicadas.");
            }

            //UNA VEZ VALIDADO TODO, GUARDAMOS.
            
            insertarModificarEliminar("INSERT INTO estancias (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) "
                    + "VALUES (" + e.getId_cliente() + ", " + e.getId_casa() + ", '" + e.getNombre_huesped() + "', '"
                    + (e.getFecha_desde().getYear() + 1900) + "-" + (e.getFecha_desde().getMonth() + 1) + "-" + e.getFecha_desde().getDay() + "', '"
                    + (e.getFecha_hasta().getYear() + 1900) + "-" + (e.getFecha_hasta().getMonth() + 1) + "-" + e.getFecha_hasta().getDay() + "')");

            System.out.println("ESTANCIA AGREGADA CON EXITO");
        } catch (Exception err) {
            System.out.println("ERROR! ingresarEstancia DAO");
            System.out.println(err);
        }

    }

    public ArrayList<String> listarEstancias(String opc) throws Exception {
        String sql = "";

        if ("f".equalsIgnoreCase(opc)) {
            sql = "SELECT e.id_estancia, cl.nombre AS Nombre, cl.pais AS Pais, cl.ciudad AS Ciudad, c.*\n"
                    + "FROM estancias e \n"
                    + "JOIN clientes cl ON e.id_cliente = cl.id_cliente\n"
                    + "JOIN casas c ON e.id_casa = c.id_casa;";
        }

        ArrayList<String> listarEstancias = new ArrayList();

        try {
            consultarBase(sql);

            while (resultado.next()) {
                String estancia = "Codigo estancia: " + resultado.getInt(1)
                        + "\nDATOS HUESPED"
                        + "\nNombre: " + resultado.getString(2)
                        + "\nPais: " + resultado.getString(3)
                        + "\nCiudad: " + resultado.getString(4)
                        + "\nDATOS CASA"
                        + "\nCodigo: " + resultado.getInt(5)
                        + "\nCalle : " + resultado.getString(6)
                        + "\nNumero: " + resultado.getInt(7)
                        + "\nCodigo postal: " + resultado.getString(8)
                        + "\nCiudad: " + resultado.getString(9)
                        + "\nPais: " + resultado.getString(10)
                        + "\nFecha inicio: " + resultado.getDate(11)
                        + "\nFecha final: " + resultado.getDate(12)
                        + "\nTiempo minimo: " + resultado.getInt(13)
                        + "\nTiempo maximo: " + resultado.getInt(14)
                        + "\nPrecio habitacion: " + resultado.getDouble(15)
                        + "\nTipo de vivienda: " + resultado.getString(16)
                        + "\n";

                listarEstancias.add(estancia);
            }
        } catch (Exception e) {
            System.out.println("ERROR! listarEstancias DAO");
            System.out.println(e);
        } finally {
            desconectarBase();
        }

        return listarEstancias;
    }

}
