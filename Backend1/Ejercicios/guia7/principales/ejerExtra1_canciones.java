package guia7.principales;
import guia7.entidades.EE1_Cancion;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra1_canciones {
    /*
        Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
    Se deberá definir además dos constructores: uno vacío que inicializa el título 
    y el autor a cadenas vacías y otro que reciba como parámetros el título 
    y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        EE1_Cancion canc1 = new EE1_Cancion();
        EE1_Cancion canc2 = new EE1_Cancion("Mañana", "Dev");

        System.out.println(canc1);
        System.out.println(canc2);
    }

}
