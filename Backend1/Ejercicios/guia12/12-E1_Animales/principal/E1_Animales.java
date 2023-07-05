package principal;
import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E1_Animales {
    /*
        Tenemos una clase padre Animal junto con sus 3 clases hijas 
    Perro, Gato, Caballo.
    
    La clase Animal tendrá como atributos el nombre, alimento, edad 
    y raza del Animal.
    
    Crear un método en la clase Animal a través del cual cada clase 
    hija deberá mostrar luego un mensaje por pantalla informando de 
    que se alimenta. 
    
    Generar una clase Main que realice lo siguiente:
    */
    static Random rand = new Random();
    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Animal perro1 = new Perro("Bagucha", "Carne", "Galgo", 4);
        perro1.alimentarse();
        
        Animal perro2 = new Perro("Osito", "Pollito", "Caniche", 7);
        perro2.alimentarse();
        
        Animal gato = new Gato("Tiger", "Galletas", "Siames", 5);
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark", "pasto", "Fino", 25);
        caballo.alimentarse();
    }

}
