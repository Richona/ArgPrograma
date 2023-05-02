package guia4;
import java.util.Scanner;

public class ejer1_menuCalculadora {
    /*
        Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
    La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n1, n2, opc;
        System.out.println("Ingresa dos numeros.");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        
        System.out.println("*** MENU *** \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \nSelecciona una...");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println(suma(n1,n2));
                break;
            case 2:
                System.out.println(resta(n1,n2));
                break;
            case 3:
                System.out.println(multi(n1,n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("ERROR! No se puede dividir por 0.");
                }else{
                    System.out.println(divi(n1,n2));
                }
                break;
            default:
                System.out.println("ERROR! Opcion incorrecta.");
        }
    }
    
    public static int suma(int n1, int n2){
        return n1 + n2;
    }
    
    public static int resta(int n1, int n2){
        return n1 - n2;
    }
    
    public static int multi(int n1, int n2){
        return n1 * n2;
    }
    
    public static int divi(int n1, int n2){
        return n1 / n2;
    }
}
