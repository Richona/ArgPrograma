package guia5;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra3_llenarMostrarVector {
    /*
        Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
    Después haremos otra función o procedimiento que imprima el vector.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);
    

    public static void main(String[] args) {
        int vector[] = new int[6];
        
        llenarVector(vector);
        
        mostrarVector(vector);

    }

    private static void llenarVector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            vector[i] = rand.nextInt(10)+1;
        }
    }

    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            System.out.println(vector[i]);
        }
    }

}
