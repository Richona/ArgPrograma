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
public class ejer2_mostrarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
            Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        */
        
//        Scanner entra = new Scanner(System.in);
//        System.out.println("Ingresa tu nombre");
//        String nombre = entra.next();
//        
//        System.out.println("Tu nombre es: " + nombre);
        
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre);
    }
    
}
