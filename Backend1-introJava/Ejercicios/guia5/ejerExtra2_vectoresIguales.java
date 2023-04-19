package guia5;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra2_vectoresIguales {
    /*
        Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int tam, vector1[], vector2[];
        boolean b;
        
        do {
            System.out.println("Tamaño vector:");
            tam = leer.nextInt();
        } while (tam < 1);
        
        vector1 = new int[tam];
        vector2 = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vector1[i] = rand.nextInt(3)+1;
            vector2[i] = rand.nextInt(3)+1;    
        }
        
        mostrarVectores(vector1, vector2, tam);
        
        b = true;
        for (int i = 0; i < tam; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores no son iguales");
                b = false;
                break;
            }
        }
        
        if (b) {
            System.out.println("Los vectores son iguales");
        }
        
    }

    private static void mostrarVectores(int[] vector1, int[] vector2, int tam) {
        System.out.println(" *** Vector 1 ***    *** Vector 2***");
        for (int i = 0; i < tam; i++) {
            System.out.print("\t" + vector1[i] + "\t\t   " + vector2[i]);
            System.out.println("");
        }
        
    }
    
    

}
