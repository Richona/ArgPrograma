package guia10.principales;
import guia10.entidades.E2_Perro;
import guia10.servicios.E2_PerroService;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E2_ {
    /*
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E2_PerroService ps = new E2_PerroService();
        
        ArrayList<E2_Perro> razas = ps.crearRazas(leer);
        
        ps.eliminarRaza(leer, razas);
    }

}
