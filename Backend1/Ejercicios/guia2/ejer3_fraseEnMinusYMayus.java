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
public class ejer3_fraseEnMinusYMayus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
            Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
       
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa una frase");
       String frase = leer.nextLine();
       
       System.out.println("Tu frase en minuscula es: " + frase.toLowerCase());
       System.out.println("Tu frase en mayuscula es: " + frase.toUpperCase());
       
 
//       String frase = JOptionPane.showInputDialog("Ingresa una frase");
//       
//       JOptionPane.showMessageDialog(null, "Tu frase en minuscula es: " + frase.toLowerCase() + "\nTu frase en mayuscula es: " + frase.toUpperCase());
    }
    
}
