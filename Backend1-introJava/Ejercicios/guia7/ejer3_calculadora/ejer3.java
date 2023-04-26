package guia7.ejer3_calculadora;
import guia7.ejer3_.entidades.Operacion;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejer3 {
    /*
        Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
a- Método constructor con todos los atributos pasados por parámetro.
b- Método constructor sin los atributos pasados por parámetro.
c- Métodos get y set.
d- Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e- Método sumar(): calcular la suma de los números y devolver el resultado al main.
f- Método restar(): calcular la resta de los números y devolver el resultado al main
g- Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 
    y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
h- Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
    el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Operacion ope1 = Operacion.crearOperacion();

        System.out.println(ope1);
        System.out.println("Suma: " + ope1.sumar());
        System.out.println("Restar: " + ope1.restar());
        System.out.println("Multiplicar: " + ope1.multiplicar());
        System.out.println("Dividir: " + ope1.dividir());
        
    }

}
