package guia7.ejerExtra6_rectangulo2;

import guia7.ejerExtra6_.entidades.Rectangulo;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra6 {
    /*
        Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule 
    y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" 
    con lados de 4 y 6 y imprime el área del rectángulo.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4, 6);

        System.out.println("Area del rectangulo: "+rectangulo1.calcularArea());
    }

}
