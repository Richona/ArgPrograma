package guia5;
import java.util.Random;
import java.util.Scanner;

public class ejer3_contadorDigitos {
    /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
    */
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int tam, vector[], acu[];
        
        do {
            System.out.println("tamaño del vector");
            tam = leer.nextInt();
        } while (tam < 1);
        
        vector = new int[tam];

        for (int i = 0; i < tam; i++) {
            vector[i] = rand.nextInt(99999)+1;
        }
        
        acu = new int[5];
        for (int i = 0; i < tam; i++) {
            if (vector[i] > 0 && vector[i] < 10) {
                acu[0]++; 
            }else if(vector[i] > 9 && vector[i] < 100){
                acu[1]++;
            }else if(vector[i] > 99 && vector[i] < 1000){
                acu[2]++;
            }else if(vector[i] > 999 && vector[i] < 10000){
                acu[3]++;
            }else if(vector[i] > 9999 && vector[i] < 100000){
                acu[4]++;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("La cantidad de numeros con 1 digito es " + acu[i]);
                    break;
                case 1:
                    System.out.println("La cantidad de numeros con 2 digito es " + acu[i]);
                    break;
                case 2:
                    System.out.println("La cantidad de numeros con 3 digito es " + acu[i]);
                    break;
                case 3:
                    System.out.println("La cantidad de numeros con 4 digito es " + acu[i]);
                    break;
                case 4:
                    System.out.println("La cantidad de numeros con 5 digito es " + acu[i]);
                    break;
            }
        }
    }

}
