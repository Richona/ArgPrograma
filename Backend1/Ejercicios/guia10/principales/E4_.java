package guia10.principales;
import guia10.entidades.E4_Pelicula;
import guia10.servicios.E4_PeliculaService;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E4_ {
    /*
        Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
    
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
    
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
    
Después de ese bucle realizaremos las siguientes acciones:
    • Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        E4_PeliculaService ps = new E4_PeliculaService();
        ArrayList<E4_Pelicula> pelis = ps.crearPeliculas(leer);
        
        ps.menuPeliculas(leer, pelis);
        
    }

}
