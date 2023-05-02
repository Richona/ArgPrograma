package guia7.principales;
import guia7.entidades.EE2_Puntos;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra2_distanciaEntrePuntos {
    /*
        Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
    sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
    Generar un objeto puntos usando un método crearPuntos() que le pide al 
    usuario los dos números y los ingresa en los atributos del objeto. 
    Después, a través de otro método calcular y devolver la distancia que existe 
    entre los dos puntos que existen en la clase Puntos. 
    Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        EE2_Puntos punt = EE2_Puntos.crearPuntos();
        
        System.out.printf("La distancia entre A (%d, %d) y B (%d, %d) es: %.2f %n", punt.getX1(), punt.getY1(), punt.getX2(), punt.getY2(), punt.calcularDistancia());
	}
}




