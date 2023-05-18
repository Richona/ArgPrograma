package guia9.principales;
import guia9.entidades.E6_Curso;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E6_ {
    /*
        Un profesor particular está dando cursos para grupos de cinco alumnos 
    y necesita un programa para organizar la información de cada curso. 
    Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: 
    nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
    precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
    dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. 
    A continuación, se implementarán los siguientes métodos:
    
1-Un constructor por defecto.
    
2-Un constructor con todos los atributos como parámetro.
    
3-Métodos getters y setters de cada atributo.
    
4-Método cargarAlumnos(): este método le permitirá al usuario ingresar 
    los alumnos que asisten a las clases. Nosotros nos encargaremos de 
    almacenar esta información en un arreglo e iterar con un bucle, 
    solicitando en cada repetición que se ingrese el nombre de cada alumno.
    
5-Método crearCurso(): el método crear curso, le pide los valores 
    de los atributos al usuario y después se le asignan a sus respectivos 
    atributos para llenar el objeto Curso. En este método invocamos 
    al método cargarAlumnos() para asignarle valor al atributo alumnos
    
6-Método calcularGananciaSemanal(): este método se encarga de calcular la 
    ganancia en una semana por curso. Para ello, se deben multiplicar la 
    cantidad de horas por día, el precio por hora, la cantidad de alumnos 
    y la cantidad de días a la semana que se repite el encuentro.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        E6_Curso c1 = new E6_Curso().crearCurso(leer);
        
        System.out.println("Las ganancias son: " + c1.calcularGananciaSemanal(c1));

    }

}
