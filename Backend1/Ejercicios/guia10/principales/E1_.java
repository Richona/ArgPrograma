package guia10.principales;
import guia10.entidades.E1_Perro;
import guia10.servicios.E1_PerroService;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E1_ {
    /*
        Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E1_PerroService ps = new E1_PerroService();
        
        ArrayList<E1_Perro> razas = ps.crearRazas();
        
        ps.aniquilarPerro(razas);
    }

}
