package principal;
import entidades.E3_Persona;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;
import servicios.E3_PersonaServicio;

public class E1_pruebaTryCatch {
    /*
        
    */
    static Random rand = new Random();
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        E3_PersonaServicio pers = new E3_PersonaServicio();

        try {
            System.out.println("Edad:");
            E3_Persona persona = new E3_Persona();
            
            System.out.println(pers.esMayorDeEdad(persona));
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
