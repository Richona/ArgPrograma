package ejercicios.guia3;
import java.util.Random;
import java.util.Scanner;

public class ejerExtra10_adivinarNumeroRandom {
    /*
        Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
    El programa debe indicar al usuario si su respuesta es o no correcta. 
    En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
    Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        int sec, n;
        
        sec = rand.nextInt(11) * rand.nextInt(11);

        do {
            System.out.println("Ingresa un numero para adivinar");
            n = leer.nextInt();
            
            if (n == sec) {
                System.out.println("CORRECTO!");
                break;
            }else{
                System.out.println("INCORRECTO!!");
            }
            
        } while (true);
        
    }

}
