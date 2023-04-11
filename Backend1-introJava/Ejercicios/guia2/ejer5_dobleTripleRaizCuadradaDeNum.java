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
public class ejer5_dobleTripleRaizCuadradaDeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
            Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
            Nota: investigar la función Math.sqrt().
        */
       
//       Scanner entra = new Scanner(System.in);
//        System.out.println("ingresa un numero");
//        double num = entra.nextDouble();
//        System.out.println("El doble de " + num + " es: " + (num *2));
//        System.out.println("El triple de " + num + " es: " + (num *3));
//        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));

        double num = Double.parseDouble(JOptionPane.showInputDialog("ingresa un numero"));
        
        JOptionPane.showMessageDialog(null, 
                "El doble de " + num + " es: " + (num *2) + 
                "\nEl triple de " + num + " es: " + (num *3) + 
                "\nLa raiz cuadrada de " + num + " es: " + Math.sqrt(num)
        );
    }
    
}
