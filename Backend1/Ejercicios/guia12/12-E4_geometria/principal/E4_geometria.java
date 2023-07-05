package principal;
import entidades.Circulo;
import entidades.Rectangulo;
import java.io.PrintStream;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E4_geometria {
    /*
        Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    */
    static Random rand = new Random();
    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(10, 5);

        System.out.printf("Area circulo: %f / Perimetro circulo: %f. \n", circulo.calcularArea(), circulo.calcularPerimetro());
        
        System.out.printf("Area rectángulo: %f / Perimetro rectángulo: %f. %n", rectangulo.calcularArea(), rectangulo.calcularPerimetro());
    }

}
