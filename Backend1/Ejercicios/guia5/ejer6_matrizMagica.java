package guia5;

import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejer6_matrizMagica {

    /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
    sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
    y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, 
    es decir, están entre el 1 y el 9.

     */
    /*
            2 7 6 
            9 5 1 
            4 3 8
         */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int matriz[][];
        

        matriz = new int[3][3];
        
        llenarMatriz(matriz);
        
        mostrarMatriz(matriz);
          
        if (validarMagia(matriz)) {
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }

    }
    
    public static void llenarMatriz(int[][] matriz){
        int num;
        boolean numDisp[] = new boolean[9];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.printf("Numero para la posicion [%d][%d]:\n", i, j);
                do {
                    num = leer.nextInt();
                } while (!(num > 0 && num < 10 && !numDisp[num - 1]));

                numDisp[num - 1] = true;
                matriz[i][j] = num;
            }
        }
    }

    private static boolean validarMagia(int[][] matriz) {
        int cols[], rows[], diag1, diag2;
        
        cols = new int[3];
        rows = new int[3];
        
        diag1 = 0;
        diag2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (i == j) {
                    diag1 += matriz[i][j];
                }

                if (i + j == 2) {
                    diag2 += matriz[i][j];
                }

                rows[i] += matriz[i][j];
                cols[j] += matriz[i][j];

            }
        }
        
        if (diag1 != diag2) {
            return false;
        } else {
            for (int i = 0; i < 3; i++) {
                if (rows[i] != cols[i] || diag1 != rows[i]) {
                    return false;
                }
            }
        }
        
        return true;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
    }

}
