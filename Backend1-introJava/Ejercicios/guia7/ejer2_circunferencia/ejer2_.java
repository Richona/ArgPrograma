package guia7.ejer2_circunferencia;
import guia7.ejer2_.entidades.Circunferencia;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejer2_ {
    /*
        Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
    A continuación, se deben crear los siguientes métodos:
a- Método constructor que inicialice el radio pasado como parámetro.
b- Métodos get y set para el atributo radio de la clase Circunferencia.
c- Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d- Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e- Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        Circunferencia circu = Circunferencia.crearCircunferencia();
        
        System.out.println(circu);
        System.out.printf("Area: %.2f. %n", circu.area());
        System.out.printf("Perimetro: %.2f. %n", circu.perimetro());
    }

}
