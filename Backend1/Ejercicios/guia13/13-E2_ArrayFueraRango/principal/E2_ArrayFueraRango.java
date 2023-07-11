package principal;

import java.util.Arrays;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E2_ArrayFueraRango {

    /*
        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
     */
    static Random rand = new Random();
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int[] nums = new int[6];

        try {
            for (int i = 0; i < 7; i++) {
                nums[i] = i;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
