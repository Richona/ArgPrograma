package guia7.ejer4_rectangulo;
import guia7.ejer4_.entidades.Rectangulo;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejer4 {
    /*
        Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
    La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
    También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
    Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
    Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(20, 10);

        System.out.println(rec);
        System.out.println("Superficie: " + rec.superficie());
        System.out.println("Perimetro: " + rec.perimetro());
        rec.dibujar();
    }

}
