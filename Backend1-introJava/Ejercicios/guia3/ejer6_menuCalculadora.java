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
public class ejer6_menuCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
        El programa deberá ejecutarse hasta que se elija la opción 5. 
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
        Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 2 numeros");
        int n1, n2, opc;
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        
        do {
            System.out.println("*************************");
            System.out.println("MENU: \n1. Sumar \n2. restar \n3. Multiplicar \n4. Dividir \n5. Salir \n6. Elegir otros numeros \nElija opcion:");
            System.out.println("*************************");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("La suma es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("ERROR! No se puede dividir por 0");
                    }else{
                        System.out.println("La division es: " + (n1 / n2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String res = leer.next();
                    
                    if (!res.toLowerCase().equals("s")) {
                        opc = 1;
                    }
                    
                    break;
                case 6:
                    System.out.println("Ingresa 2 numeros");
                    n1 = leer.nextInt();
                    n2 = leer.nextInt();
                    break;
                default:
                    System.out.println("Error! Opcion no permitida.");
            }
        } while (opc != 5);
    }
    
}
