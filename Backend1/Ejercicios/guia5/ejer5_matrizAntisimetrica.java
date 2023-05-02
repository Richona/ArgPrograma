package guia5;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejer5_matrizAntisimetrica {
    /*
        Realice un programa que compruebe si una matriz dada es antisimétrica. 
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
    pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int [][]matriz = new int[3][3];
        boolean b;
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingresa los datos de la fila %d:\n", i+1);
            for (int j = 0; j < 3; j++) {  
                matriz[i][j] = leer.nextInt();//rand.nextInt(9)+1;
            }   
        }
        
        b = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    b = false;
                }
            }   
        }
        
        System.out.println("*** Matriz ***    *** Matriz traspuesta ***");
        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matriz[i][j] );
            }   
            System.out.print("                ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }  
            System.out.println("");
        }
        System.out.println("");
        
        if (b) {
            System.out.println("La matriz es antisimétrica.");
        }else{
            System.out.println("La matriz no es antisimétrica");
        }

    }

}
