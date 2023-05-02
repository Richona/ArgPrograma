package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra11_cantidadDigitos {
    /*
        Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
    Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
    Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
    Nota: recordar que las variables de tipo entero truncan los números o resultados.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, cont;
        
        System.out.println("Ingresa un numero");
        n = leer.nextInt();
        cont = 1;
        
        while (n > 9) {
            n = n / 10;
            cont++;
        }

        System.out.println("La cantidad de digitos es: " + cont);
    }

}
