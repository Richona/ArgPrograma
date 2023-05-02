package guia5;
import java.util.Random;
import java.util.Scanner;

public class ejer2_adivinarNumVector {
    /*
        Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al 
        usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
    */
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        
        int tam, vector[], num;
        boolean b;
        
        do {
            System.out.println("ingresa tamaño del vector:");
            tam = leer.nextInt();
        } while (tam < 1);
        
        vector = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vector[i] = rand.nextInt(10) +1;
        }
        
        System.out.println("Adivina el numero:");
        num = leer.nextInt();
        b = false;
        
        for (int i = 0; i < tam; i++) {
            if (vector[i] == num && !b) {
                System.out.println("El numero se encuentra en la posicion " + i);
                b = true;
            }else if(vector[i] == num && b){
                System.out.println("El numero se encuentra repetido");
            }
        }
        
        if (!b) {
            System.out.println("No se encontro el numero.");
        }

    }

}
