package guia7.ejer1_libros;
import guia7.ejer1_.entidades.Libro;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejer1_Libros {
    /*
        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
    y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
    Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro 
    método el número de ISBN, el título, el autor del libro y el número de páginas.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        Libro libro1 = Libro.cargarLibro();
        Libro libro2 = new Libro(12, "Hola pa", "Richona", 45);
        Libro libro3 = new Libro();
        
        libro1.mostrarLibro();
        System.out.println(libro1);
        
        libro2.mostrarLibro();
        System.out.println(libro2);
        
        libro3.mostrarLibro();
        System.out.println(libro3);
    }

}
