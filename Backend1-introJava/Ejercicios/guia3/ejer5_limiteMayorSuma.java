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
public class ejer5_limiteMayorSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario 
        hasta que la suma de los números introducidos supere el límite inicial.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un valor positivo");
        int limit = leer.nextInt();
        while (limit < 1) {
            System.out.println("Error!! ingresa un valor positivo");
            limit = leer.nextInt();
        }
        
        int suma = 0;
        
        while (limit >= suma) {
            System.out.println("Numero a sumar");
            int n = leer.nextInt();
            suma += n;
        }
        
    }
    
}
