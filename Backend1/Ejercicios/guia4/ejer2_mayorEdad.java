package guia4;
import java.util.Scanner;

public class ejer2_mayorEdad {
    /*
        Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado 
    e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    */
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        do {
            personas();
            System.out.println("\nQuieres seguir mostrando personas? Si/No");
        } while (!leer.next().equalsIgnoreCase("no"));
        
    }
    
    public static void personas(){
        String nom;
        int edad;
        
        System.out.println("\nIngresa el nombre de la persona:");
        nom = leer.next();
        
        System.out.println("Ingresa la edad:");
        edad = leer.nextInt();
        
        if (edad >= 18) {
            System.out.println(nom + " con la edad de " + edad + " años es mayor de edad");
        }else{
            System.out.println(nom + " con la edad de " + edad + " años es menor de edad");
        }
    }

}
