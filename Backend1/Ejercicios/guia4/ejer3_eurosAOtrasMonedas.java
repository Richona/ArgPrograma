package guia4;
import java.util.Scanner;

public class ejer3_eurosAOtrasMonedas {
    /*
        Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
    estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
    que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

    */
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        double euros;
        
        System.out.println("Cantidad euros: ");
        euros = leer.nextDouble();
        
        System.out.println("Convertir a: \n1. Dolares \n2. Yenes \n3. Libras \n Elegi una opcion...");
        conversor(euros, leer.nextInt());
        
    }
    
    public static void conversor(double euros, int convertir){
        switch (convertir) {
            case 1:
                System.out.println(euros + " euros a dolares: " + (euros * 1.28611));
                break;
            case 2:
                System.out.println(euros + " euros a yenes: " + (euros * 129.852));
                break;
            case 3:
                System.out.println(euros + " euros a libras: " + (euros * 0.86));
                break;
            default:
                System.out.println("ERROR! Opcion invalida.");
        }
    }
}
