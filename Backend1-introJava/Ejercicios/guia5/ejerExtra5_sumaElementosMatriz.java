package guia5;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra5_sumaElementosMatriz {
    /*
        Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int matriz[][], n, m, suma;
        
        do {
            System.out.println("Tamaño de filas y columnas:");
            n = leer.nextInt();
            m = leer.nextInt();
        } while (n < 1 || m < 1);
        
        matriz = new int[n][m];
        suma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rand.nextInt(10) +1;

                suma += matriz[i][j];
            }
        }
        
        System.out.println("La suma es: " + suma);
    }

}
