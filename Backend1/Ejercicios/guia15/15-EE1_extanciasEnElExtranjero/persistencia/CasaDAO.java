package persistencia;

import entidades.Casa;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
2020 y el 31 de agosto de 2020 en Reino Unido.
 select * from casas where pais like 'Reino Unido' and fecha_desde >= '2020-08-01' AND fecha_hasta <= '2020-08-31';

d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
y un número de días específico.
select * from casas where fecha_desde >= '?' AND fecha_hasta <= '?' AND tiempo_minimo_dias >= '?' AND tiempo_maximo_dias <= '?';

g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
actualizados.
UPDATE casas SET precio_habitacion = precio_habitacion * 1.05 WHERE pais = 'Reino Unido' LIMIT 100;

h) Obtener el número de casas que existen para cada uno de los países diferentes.
SELECT pais, COUNT(*) AS numero_casas FROM casas GROUP BY pais;

i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’.
SELECT c.*, co.comentario FROM casas c INNER JOIN comentarios co ON c.id_casa = co.id_casa WHERE c.pais = 'Reino Unido' AND co.comentario LIKE '%limpia%' ;
 */
public class CasaDAO extends DAO {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    public ArrayList<Casa> listarCasas(String opc) throws Exception {
        String sql = "";

        switch (opc) {
            case "b":
                sql = "select * from casas where pais like 'Reino Unido' and fecha_desde >= '2020-08-01' AND fecha_hasta <= '2020-08-31' ";
                break;
            case "g":
                sql = "UPDATE casas SET precio_habitacion = precio_habitacion * 1.05 WHERE pais = 'Reino Unido' LIMIT 100 ";
                break;
            case "h":
                sql = "SELECT pais, COUNT(*) FROM casas GROUP BY pais";
                break;
            case "i":
                sql = " SELECT DISTINCT c.* FROM casas c INNER JOIN comentarios co ON c.id_casa = co.id_casa WHERE c.pais = 'Reino Unido' AND co.comentario LIKE '%limpia%' ";
                break;
            case "d":
                System.out.println(" Ingrese desde que fecha en formato 2020-08-01: ");
                String fd = leer.nextLine();
                System.out.println(" Ingrese hasta que fecha en formato 2020-08-01: ");
                String fh = leer.nextLine();
                System.out.println(" Ingrese Tiempo minimo de dias: ");
                String dmin = leer.nextLine();
                System.out.println(" Ingrese Tiempo maximo de dias: ");
                String dmax = leer.nextLine();

                sql = " select * from casas where fecha_desde >= '" + fd + "' AND fecha_hasta <= '" + fh + "' AND tiempo_minimo >= '" + dmin + "' AND tiempo_maximo <= '" + dmax + "' ";
                break;
            default:
                throw new AssertionError();
        }

        ArrayList<Casa> listarCasas = new ArrayList();
        Casa c;
        try {
            if ("g".equals(opc)) {
                insertarModificarEliminar(sql);
                System.out.println(" BASE DE DATOS ACTUALIZADA ");
                sql = "SELECT * FROM casas WHERE pais LIKE 'Reino Unido'";
            }

            consultarBase(sql);

            while (resultado.next()) {
                c = new Casa();

                if ("h".equals(opc)) {
                    c.setPais(resultado.getString(1));
                    c.setNumero(resultado.getInt(2));
                } else {
                    c.setId_casa(resultado.getInt(1));
                    c.setCalle(resultado.getString(2));
                    c.setNumero(resultado.getInt(3));
                    c.setCodigo_postal(resultado.getString(4));
                    c.setCiudad(resultado.getString(5));
                    c.setPais(resultado.getString(6));
                    c.setFecha_desde(resultado.getDate(7));
                    c.setFecha_hasta(resultado.getDate(8));
                    c.setTiempo_minimo(resultado.getInt(9));
                    c.setTiempo_maximo(resultado.getInt(10));
                    c.setPrecio_habitacion(resultado.getInt(11));
                    c.setTipo_vivienda(resultado.getString(12));
                }

                listarCasas.add(c);

            }
        } catch (Exception exc) {
            System.out.println("ERROR en listaCasas ");
            System.out.println(exc);
        } finally {
            desconectarBase();
        }
        return listarCasas;
    }

}
