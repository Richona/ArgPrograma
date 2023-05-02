package guia5;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra4_cantidadAprobDesap {
    /*
        Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
    Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
    Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
    Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
    teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int notasAlum[][], notasFin[], aprob, desap;
        
        notasAlum = new int[10][4];
        notasFin = new int[10];
        aprob = 0;
        desap = 0;
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 4; j++) {
                notasAlum[i][j] = rand.nextInt(10)+1;
            }
            
            notasFin[i] = (int)(notasAlum[i][0] * .1 + notasAlum[i][1] * .15 + notasAlum[i][2] * .25 + notasAlum[i][3] * .5);
            
            if (notasFin[i] >= 7) {
                aprob++;
            }else{
                desap++;
            }
        }     
        System.out.println("La cantidad de desaprobados es: " + desap);
        System.out.println("La cantidad de aprobados es: " + aprob);
    }

}
