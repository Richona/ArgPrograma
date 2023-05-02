package guia5;

import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra7_fibonacci {

    /*
        Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
    Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
    La sucesión del número 2 se calcula sumando (1+1)
    Análogamente, la sucesión del número 3 es (1+2),
    Y la del 5 es (2+3),
    Y así sucesivamente…
    
    La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
    Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
    Fibonaccin = 1 para todo n<=1
    
        Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y 
    que calcule la serie hasta llegar a ese valor.
    Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quantdare.com/numeros-de-fibonacci/

     */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int fibonacci[], tam, n1, n2;
        
        
        System.out.println("Indique el nivel de la secuencia Fibonacci a calcular: ");
        tam = leer.nextInt();
        fibonacci = new int[tam <= 1 ? 1 : tam]; 
        
        n1 = 0;
        n2 = 1;
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = n2;
            
            n2 += n1;
            n1 = n2 - n1;
        }
        
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.printf(fibonacci[i] + (i != fibonacci.length -1 ? ", " : ".%n"));
        }
       
    }

}
