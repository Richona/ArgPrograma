package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra7_maxMinPromWhileDowhile {
    /*
        Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
    El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
    Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        do {
            System.out.println("Cuantos numeros ingresaras?");
            n = leer.nextInt();
        } while (n < 1);
        
        int i=0, maxI = 0, minI = 0, sumaI = 0, contI = 0;
        while (i < n) {
            System.out.println("Ingresa el numero " + (i+1));
            int num = leer.nextInt();
            
            if (num > maxI) {
                maxI = num;
            }
            
            if (num < minI) {
                minI = num;
            }
            
            contI++;
            sumaI += num;
            
            i++;
        }
        
        System.out.println("El valor maximo usando WHILE es: " + maxI);
        System.out.println("El valor minumo usando WHILE es: " + minI);
        System.out.println("El promedio usando WHILE es: " + (sumaI / contI));
        
        int j=0, maxJ = 0, minJ = 0, sumaJ = 0, contJ = 0;
        
        do {
            System.out.println("Ingresa el numero " + (j+1));
            int num = leer.nextInt();
            
            if (num > maxJ) {
                maxJ = num;
            }
            
            if (num < minJ) {
                minJ = num;
            }
            
            contJ++;
            sumaJ += num;
            
            j++;
        } while (j < n);
        

        
        System.out.println("El valor maximo usando DO-WHILE es: " + maxJ);
        System.out.println("El valor minumo usando DO-WHILE es: " + minJ);
        System.out.println("El promedio usando DO-WHILE es: " + (sumaJ / contJ));
    }

}
