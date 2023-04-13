/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia3;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class ejer8_cuadradoAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
            Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
            * * * *
            *     *
            *     *
            * * * *
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del cuadrado");
        int lado = leer.nextInt();
        
        /*
            cuadrado
        */
//        for (int i = 0; i < lado; i++) {
//            for (int j = 0; j < lado; j++) {
//                if (i > 0 && i < lado-1 && j > 0 && j < lado-1) {
//                    System.out.print("  ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println("");
//        }
        
        /*
            cuadrado con cruz
        */
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1 || i == j || i + j == lado-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
        
    }

}
