package guia11.principales;
import guia11.servicios.EE1_GrupoService;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EE1 {
    /*
        Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
    */
    static Random rand = new Random();
    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        EE1_GrupoService gs = new EE1_GrupoService();
        
        gs.adopcion();
    }

}
