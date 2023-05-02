package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra8_cantidadesParImpar {
    /*
        Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura
    y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
    Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, cantNum = 0, cantPar = 0, cantImp = 0;
        
        do {
            System.out.println("ingresa un numero");
            n = leer.nextInt();
            
            if (n % 5 == 0) {
                break;
            }
            
            if (n > 0) {
                
                if (n % 2 == 0) {
                    cantPar++;
                }else{
                     cantImp++;
                }
                
                cantNum++;
            }
            
        } while (n % 5 != 0);
        
        System.out.println("La cantidad de numeros leidos es: " + cantNum);
        System.out.println("La cantidad de numeros pares es: " + cantPar);
        System.out.println("La cantidad de numeros impares es: " + cantImp);
    }

}
