package guia11.principales;
import guia11.entidades.E1_Perro;
import guia11.entidades.E1_Persona;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E1 {
    /*
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E1_Perro perro1 = new E1_Perro("Bagucha", "pichichu", 3, 80);
        
        E1_Persona persona1 = new E1_Persona("Richard", "Cuevas", 25, 183, perro1);
        
        System.out.println("PERSONA 1: \n" + persona1);
        
        E1_Persona persona2 = new E1_Persona("Lili", "Loncopan", 58, 153, new E1_Perro("Osito", "caniche", 5, 30));
        
        System.out.println("PERSONA 2: \n" + persona2);
        

        System.out.println("PERSONA 3: \n" + new E1_Persona("Nadia", "Cuevas", 20, 163, new E1_Perro("Prisci", "pichichu", 8, 30)));
    }

}
