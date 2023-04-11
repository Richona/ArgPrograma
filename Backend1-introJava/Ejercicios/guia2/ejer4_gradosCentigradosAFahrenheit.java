package ejercicios.guia2;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richard
 */
public class ejer4_gradosCentigradosAFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
            La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
//      Scanner entra = new Scanner(System.in);
//       System.out.println("ingresa los grados centigrados");
//       int grados = entra.nextInt();
//       
//        System.out.println("El equivalente de los centigrados " + grados + " a Fahrenheit es: " + (32 + (9 * grados / 5)));

        int grados = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los grados centigrados"));
        
        JOptionPane.showMessageDialog(null, "El equivalente de los centigrados " + grados + " a Fahrenheit es: " + (32 + (9 * grados / 5)));
    }
    
}
