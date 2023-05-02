package guia7.principales;
import guia7.entidades.EE5_Empleado;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra5_empleados {
    /*
        Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
    El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        EE5_Empleado empleado = new EE5_Empleado();

        empleado.setNombre("Richard");
        
        empleado.setEdad(24);
        
        
        String respuesta;
        
        do {
            System.out.println(empleado.calcularAumento());
            System.out.println("Desea continuar? s/n");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s"));
        
        System.out.println("Gracias por usar nuestra app.");
    }

}
