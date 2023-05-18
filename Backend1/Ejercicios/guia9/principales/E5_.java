package guia9.principales;
import guia9.entidades.E5_Persona;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;
import guia9.servicios.E5_PersonaService;

public class E5_ {
    /*
        Implemente la clase Persona en el paquete entidades. 
    Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
    constructor vacío, constructor parametrizado, get y set. 
    
    Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
    
1- Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.

2-Método calcularEdad que calcule la edad del usuario utilizando el atributo 
    de fecha de nacimiento y la fecha actual.

3-Método menorQue recibe como parámetro una Persona y una edad. 
    Retorna true si la persona es menor que la edad consultada o false en caso contrario.

4-Método mostrarPersona que muestra la información de la persona deseada.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E5_PersonaService ps = new E5_PersonaService();
        E5_Persona p = ps.crearPersona(leer);
        
//      System.out.println("Ingrese una edad a comparar");
//      System.out.println("Es menor a esa edad? " + ps.menorQue(p, leer.nextInt()));
        
        System.out.println("Es menor de edad? "+ps.menorQue(p, 18));
        
        System.out.println("Informacion de la persona:");
        ps.mostrarPersona(p);
    }

}
