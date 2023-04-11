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
public class ejer1_parOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Crear un programa que dado un número determine si es par o impar.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero para saber si es par o impar");
        int n = leer.nextInt();
        if (n % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    
}
