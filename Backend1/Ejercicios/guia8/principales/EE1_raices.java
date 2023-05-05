package guia8.principales;
import guia8.entidades.EE1_Raices;
import guia8.servicios.EE1_RaicesServicio;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EE1_raices {
    /*
        Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
    Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
    Hay que insertar estos 3 valores para instanciar el objeto a través de un método constructor. 
    
    Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:

1-Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2) - 4 * a * c
    
2-Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones reales distintas. Para que esto ocurra, el discriminante debe ser mayor que 0.
    
3-Método tieneRaiz(): devuelve un booleano indicando si ambas soluciones son iguales. Para que esto ocurra, el discriminante debe ser igual que 0.
    
4-Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles soluciones.
    
5-Método obtenerRaiz(): llama a tieneRaiz(). Si este retorna true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    
6-Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles 
    soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
    según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    
Nota: Fórmula ecuación 2o grado: (-b ± √((b^2) - (4 * a * c))) / (2 * a) Solo varía el signo luego de -b
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        EE1_RaicesServicio r = new EE1_RaicesServicio();
        
        EE1_Raices raiz = r.crearCalculo();
        
        r.calcular(raiz);
    }

}
