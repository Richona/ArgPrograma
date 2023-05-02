package guia5;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra1_sumaElementosVector {
    /*
        Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
    con los valores ingresados por el usuario
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int tam, vector[], suma;
        
        do {
            System.out.println("Tamaño del vector:");
            tam = leer.nextInt();
        } while (tam < 1);
        
        vector = new int[tam];
        suma = 0;
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Dato de la posicion " + (i+1));
            vector[i] = leer.nextInt();
            
            suma += vector[i];
        }
        
        System.out.println("La suma de todos los elementos es: " + suma);
    }

}
