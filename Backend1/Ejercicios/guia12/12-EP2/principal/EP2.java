package principal;
import entidades.ApartePrueba;
import interfaces.PruebaInterfaz;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EP2 {
    /*
        Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz
    */
    static Random rand = new Random();
    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        //PruebaInterfaz pi = new PruebaInterfaz();

        //PruebaInterfaz.class;
        
        
        /*
        Asi se deberia utilizar una interfaz. No lo pide la consigna
        */
        ApartePrueba ap = new ApartePrueba();
        
        ap.caminar();
        ap.comer();
        ap.hablar();
    }

}
