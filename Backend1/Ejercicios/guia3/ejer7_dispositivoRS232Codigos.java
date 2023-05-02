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
public class ejer7_dispositivoRS232Codigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        este tipo de dispositivo lee cadenas enviadas por el usuario. 
        Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
        el primer carácter tiene que ser X y el último tiene que ser una O.
        
            Las secuencias leídas que respeten el formato se consideran correctas, 
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
        y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        
            Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
        Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

        */
        
        Scanner leer = new Scanner(System.in);
        String pal;
        int correctas = 0, incorrectas = 0;
        
        do {
            System.out.println("Ingresa una palabra de max 5 caracteres. Primer caracter X y el ultimo O. \nPara finalizar ingrese &&&&&");
            pal = leer.nextLine();

            if (pal.length() < 6 && pal.substring(0, 1).equals("X") && pal.substring(pal.length() -1, pal.length()).equals("O")) {
                correctas++;
            }else if(!pal.equals("&&&&&")){
                incorrectas++;
            }
            
        } while (!pal.equals("&&&&&"));
        
        System.out.println("La cantidad de correctas es: " + correctas);
        System.out.println("La cantidad de incorrectas es: " + incorrectas);
        
    }
    
}
