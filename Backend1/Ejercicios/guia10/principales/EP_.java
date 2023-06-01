package guia10.principales;

import guia10.entidades.EP1_Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;
import java.util.TreeSet;

public class EP_ {

    /*
        
     */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //DETECCION DE ERRORES 1.
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> numeros = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();

        //Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        final String[] gente = {"nadia", "julio", "pablo", "rodolfo", "exequiel"};
        for (int i = 0; i < 5; i++) {
            listado.add(i);
            numeros.add(String.valueOf(i));
            personas.put(i, gente[i]);
        }

        //Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        //cada forma que aprendiste arriba.
        listado.remove(2);
        numeros.remove("1");
        personas.remove(4);

        System.out.println("ARRAYLIST LISTADO");
        for (Integer ele : listado) {
            System.out.println(ele);
        }
        System.out.println("----------------");
        System.out.println("TREESET NUMEROS");
        for (String numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("----------------");
        System.out.println("HASHMAP PERSONAS");
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            System.out.printf("Llave: %d - Valor: %s %n", entry.getKey(), entry.getValue());
        }

        //DETECCION DE ERRORES 2.
        HashMap<Integer, String> personas2 = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas2.put(1, n1);
        personas2.put(2, n2);

        System.out.println("----------------");
        System.out.println("HASHMAP PERSONAS2");
        for (Map.Entry<Integer, String> entry : personas2.entrySet()) {
            System.out.printf("Llave: %d - Valor: %s %n", entry.getKey(), entry.getValue());
        }

        //DETECCION DE ERRORES 3.
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }

        System.out.println("----------------");
        System.out.println("ARRAYLIST BEBIDAS");
        for (String bebida : bebidas) {
            System.out.println(bebida);
        }

        //¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
        ArrayList<EP1_Libro> libros = new ArrayList();
        libros.add(new EP1_Libro("assd"));
        libros.add(new EP1_Libro("zzzzz"));
        libros.add(new EP1_Libro("boquita"));
        libros.add(new EP1_Libro("coquita"));
        libros.add(new EP1_Libro("poquita"));

        System.out.println("----------------");
        System.out.println("ARRAYLIST LIBROS");
        libros.sort(EP1_Libro.compararTitulo);
        for (EP1_Libro libro : libros) {
            System.out.println(libro);
        }
        
        
       
    }
}
