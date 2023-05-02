package guia5;
import java.util.Random;
import java.util.Scanner;

public class ejer4_matrizTraspuesta {
    /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

    */
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        
        int [][]matriz = new int[4][4];
        int [][]matrizTras = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(9)+1;
            }   
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTras[j][i] = matriz[i][j];
            }   
        }
        System.out.println("*** Matriz ***    *** Matriz traspuesta ***");
        for (int i = 0; i < 4; i++) {
            System.out.print("  ");
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+matriz[i][j] );
            }   
            System.out.print("                ");
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizTras[i][j] + " ");
            }  
            System.out.println("");
        }
        System.out.println("");

    }

}
