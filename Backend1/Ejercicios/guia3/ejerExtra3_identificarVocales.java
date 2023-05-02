package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra3_identificarVocales {
    /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una vocal");
        String letra = leer.next();
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("CORRECTO!");
        }else{
            System.out.println("INCORRECTO!!");
        }
    }

}
