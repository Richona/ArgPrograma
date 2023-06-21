package guia11.principales;
import guia11.entidades.EP1_Dni;
import guia11.entidades.EP1_Persona;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EP1 {
    /*
        Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        EP1_Persona p = new EP1_Persona("Richard", "Cuevas", new EP1_Dni('v', 45));
        
        System.out.println(p);

    }

}
