/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard
 */
public class ejer1_sumaDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
            El programa deberá después mostrar el resultado de la suma
        */
        
//       Scanner entra = new Scanner(System.in);
//        System.out.println("Ingresa dos numeros");
//        int num1 = entra.nextInt();
//        int num2 = entra.nextInt();

// System.out.println("La suma de los numeros " + num1 + " y " + num2 + " es: " + (num1 + num2));

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrasa un numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrasa otro numero"));
        
       JOptionPane.showMessageDialog(null, "La suma de los numeros " + num1 + " y " + num2 + " es: " + (num1+num2));
    }
    
}
