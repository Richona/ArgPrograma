package guia10.utilidades;

import static java.util.Comparator.comparingDouble;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;
import javax.swing.JOptionPane;

/*
    Validaciones en general.
    Las hice de esta forma ya que se repetian varias veces.
 */
public class E6_TiendaUtility {

    /*
        Validacion para que ingrese algo que no sea solo espacios.
        Recibe un mensaje de titulo y otro de error.
        Pide el dato y valida que no venga nulo, ni vacio, ni con espacios.
        Retorna el dato validado.
     */
    public static String validarNombre(String msg, String msgError) {
        String dato;

        boolean b = false;
        do {
            String message = msg;

            if (b) {
                message += msgError;
            }

            dato = JOptionPane.showInputDialog(null, message);

            b = true;
        } while (dato == null || dato.isEmpty() || dato.trim().equals(""));

        return dato.trim();
    }

    /*
        Validadacion un tanto mas compleja.
        Recibe un mensaje de titulo, mensaje de error general, mensaje de error si contiene, los productos, y si quiere negar el contiene.
        Pide el dato y valida que no venga nulo, ni vacio, ni con espacios 
        y si negar viene true, valida que el dato este en productos, si negar viene false, el dato no tiene que estar.
        Retorna el dato validado.
     */
    public static String validarNombre(String msg, String msgError, String msgErrorContains, HashMap<String, Double> productos, boolean negar) {
        String dato;

        do {
            boolean b = false;
            do {//validacion para que ingrese algo que no sea solo espacios.
                String message = msg;

                if (b) {
                    message += msgError;
                }

                dato = JOptionPane.showInputDialog(null, message);

                b = true;
            } while (dato == null || dato.isEmpty() || dato.trim().equals(""));

            dato = dato.trim();

            if (negar ? !productos.containsKey(dato) : productos.containsKey(dato)) {
                JOptionPane.showMessageDialog(null, msgErrorContains);
            }

        } while (negar ? !productos.containsKey(dato) : productos.containsKey(dato));

        return dato.trim();
    }

    /*
        Validacion de numeros.
        Recibe un mensaje de titulo y otro de error.
        Pide el dato y valida que no sea nulo, ni vacio, ni con espacios, ni numeros negativos, ni letras.
        Solo permite numeros positivos.
        Retorna el dato validado.
     */
    public static Double validarPrecio(String msg, String msgError) {
        Double dato;

        boolean b = false;
        do {//validacion para que no ingrese numeros negativos ni letras.

            String message = msg;

            if (b) {
                message += msgError;
            }

            try {
                dato = Double.valueOf(JOptionPane.showInputDialog(null, message));
            } catch (NullPointerException | NumberFormatException e) {
                dato = -1.1;
            }

            b = true;
        } while (dato <= 0);

        return dato;
    }
    
    /*
        Ordenamiento de mayor a menor (Descendente) del valor, es decir, precio.
    */
    public static Map<String, Double> ordenarValorDesc(Map<String, Double> map) {
        /*
        entrySet() nos va a devolver el mapa en formato de colección, 
    que es lo que necesitamos para permitir su ordenación y stream() 
    lo que nos va a permitir es obtener un punto de entrada a esa colección.
        */
        Map<String, Double> sortedMap = map.entrySet().stream()
                /*
                Este método nos va a permitir realizar la ordenación, comparando 
                los valores de nuestro Map de forma descendente gracias al valor -1. 
                Si quisiéramos hacerlo de forma ascendente debemos reemplazar este valor con un 1. 
                Si quisiesemos ordenar por key simplemente reemplazaríamos e.getValue() por e.getKey().
                */
                .sorted(comparingDouble(e -> -1 * e.getValue()))
                /*
                Por último, este método nos procesa la información y la almacena en un contenedor 
                de resultados mutables, y en este caso le indicamos que realiza un parseo a objeto Map.
                */
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }
    
    /*
        Ordenamiento de menor a mayor (Ascendente) del valor, es decir, precio.
    En ordenarValorDesc() explico como funciona.
    Diferencias al Desc: 1 en lugar de -1.
    */
    public static Map<String, Double> ordenarValorAsc(Map<String, Double> map) {
        Map<String, Double> sortedMap = map.entrySet().stream()
                .sorted(comparingDouble(e -> 1 * e.getValue()))
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }
    
    /*
        Ordenamiento de mayor a menor (Descendente) de la llave, es decir, nombre. 
    Cambian algunas cosas en comparacion al precio, ya que este compara String.
    */
    public static Map<String, Double> ordenarNombreDesc(Map<String, Double> map) {
        /*
        Sobre la instancia de map, se invoca la función entrySet.
        La función devuelve la vista establecida de las entradas del mapa. 
        Sobre estas entradas, se llama al método stream para convertir 
        las entradas en el flujo secuencial, donde se invoca la función sorted.
        */
        Map<String, Double> sortedMap = map.entrySet().stream()
                /*
                Comparator para comparar los elementos de Stream. 
                La función comparingByKey devuelve el comparador 
                Map.Entry con el orden predeterminado en la clave. 
                Función reversed para invertir el orden de los elementos en la colección. 
                */
                .sorted(Map.Entry.<String, Double>comparingByKey().reversed())
                /*
                Finalmente, la función collect se invoca sobre el flujo del mapa, llamando
                a la función toMap para transformar la secuencia en el mapa.
                */
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }
    
    /*
        Ordenamiento de mayor a menor (Descendente) de la llave, es decir, nombre.
    En ordenarNombreDesc explico como funciona.
    Diferencias al Desc: sacamos reversed().
    */
    public static Map<String, Double> ordenarNombreAsc(Map<String, Double> map) {
        Map<String, Double> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByKey())
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }
}
