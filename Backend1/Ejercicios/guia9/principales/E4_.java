package guia9.principales;
import guia9.servicios.E4_FechaService;
import java.util.Date;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E4_ {
    /*
        Vamos a usar la clase Date que ya existe en Java. 
    Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
    
1-Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
    Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    
2-Método fechaActual que cree un objeto fecha con el día actual. 
    Para esto usaremos el constructor vacío de la clase Date. 
    Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
    
3-Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E4_FechaService fs = new E4_FechaService();
        
        Date fn = fs.fechaNacimiento(leer);
        Date fa = fs.fechaActual();
        
        System.out.printf("La diferencia es: %d años.%n", fs.diferencia(fa, fn));

    }

}
