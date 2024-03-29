package guia9.principales;
import guia9.servicios.EE1_MesService;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EE1_ {
    /*
        Crea una clase en Java donde declares una variable de tipo array de 
    Strings que contenga los doce meses del año, en minúsculas. A continuación, 
    declara una variable mesSecreto de tipo String, y hazla igual a un 
    elemento del array (por ejemplo, mesSecreto = mes[9]. 
    El programa debe pedir al usuario que adivine el mes secreto. 
    Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva 
    a intentar adivinar el mes secreto.  
    
    Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        EE1_MesService ms = new EE1_MesService();
        
        ms.adivinar(rand, leer);

    }

}
