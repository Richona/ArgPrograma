package ejercicios.guia3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richard
 */
public class guia3_ejerciciosPracticos_enc4$5$6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
        */
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingresa dos numeros");
//        int num1 = leer.nextInt();
//        int num2 = leer.nextInt();
//       
//        if (num1 > 25 && num2 > 25) {
//            System.out.println("Ambos numeros ingresados son mayores a 25");
//        } else if (num1 > 25 || num2 > 25) {
//            System.out.println("Uno de los numeros ingresados es mayor a 25");
//        } else {
//            System.out.println("Ningun numero es mayor a 25");
//        }


        /*
            Considera que estás desarrollando una web para una empresa que fabrica motores 
            (suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
            Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
            El programa debe mostrar lo siguiente:
        o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        o   	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
        o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
        o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
        o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
        */
        
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingresa una opcion: \n1: Bomba de agua \n2: Bomba de gasolina \n3: Bomba de hormigon \n4: Bomba de pasta alimenticia");
//        int tipoMotor = leer.nextInt();
//        
//        switch (tipoMotor) {
//            case 1:
//                System.out.println("La bomba es una bomba de agua");
//                break;
//            case 2:
//                System.out.println("La bomba es una bomba de gasolina");
//                break;
//            case 3:
//                System.out.println("La bomba es una bomba de hormigón");
//                break;
//            case 4:
//                System.out.println("La bomba es una bomba de pasta alimenticia");
//                break;
//            default:
//                System.out.println("No existe un valor válido para tipo de bomba");
//        }


        /*
            Escriba un programa que valide si una nota está entre 0 y 10, sino está 
            entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
        */
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingresa una nota entre 0 y 10");
//        int n = leer.nextInt();
//        while (!(n >= 0 && n <= 10)) {
//           System.out.println("ERROR! Ingresa una nota entre 0 y 10");
//           n = leer.nextInt();
//        }


        /*
            Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje 
            "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
            pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
        */
        
//        Scanner leer = new Scanner(System.in);
//        
//           int cont = 0, suma = 0;
//           
//        do {
//            System.out.println("Ingresa el numero " +(cont+1)+ ". \n*** 0 Para terminar ***");
//            int n = leer.nextInt();
//            
//            if (n == 0) {
//                System.out.println("Se capturó el numero cero");
//                break;
//            }
//            
//            if (n > 0) {
//                suma += n;
//            }
//            
//            cont++;
//        } while (cont < 20);
//        
//        System.out.println("La suma de todos los numeros positivos es: " + suma);


/*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos 
    como indique su valor. Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **

*/
        Scanner leer = new Scanner(System.in);
        int array[] = new int [4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa el numero " + i + " (entre 1 y 20): ");
            int n = leer.nextInt();
            
            while (n < 1 || n > 20) {
                System.out.println("Error! Ingresa el numero " + i + " (entre 1 y 20): ");
                n = leer.nextInt();
            }
            
            array[i] = n;
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i] + " ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
    
}
