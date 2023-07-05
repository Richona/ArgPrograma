package principal;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EP1 {

    /*
        Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. 
    
    Luego, en el main vamos a crear un ArrayList de animales y los siguientes animales
    
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
    
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
     */
    static Random rand = new Random();
    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Gato());
        
        for (Animal animale : animales) {
            animale.hacerRuido();
        }
    }

}
