package guia10.principales;
import guia10.entidades.E3_Alumno;
import guia10.servicios.E3_AlumnoService;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E3_ {
    /*
        Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E3_AlumnoService as = new E3_AlumnoService();
        
        ArrayList<E3_Alumno> alumnos = as.crearAlumnos(leer, rand);
        
        as.mostrarAlumnos(alumnos, 1);
        System.out.println("Nota final: " + as.notaFinal(leer, alumnos));
    }

}
