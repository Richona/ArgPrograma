package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra9_divisionResiduoCociente {
    /*
        Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
    realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
    Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
    este resultado es el residuo, y el número de restas realizadas es el cociente.
    
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
    
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, residuo, cociente = 0; 
        do {
            System.out.println("Dividendo: ");
            n1 = leer.nextInt();
            System.out.println("Divisor: ");
            n2 = leer.nextInt();
        } while (n1 < 1 || n2 < 1);
        
        do {
            n1 = n1 - n2;
            cociente++;
        } while (n1 > n2);
        
        System.out.println("El residuo es " + n1 + " y el cociente es " + cociente);
    }

}
