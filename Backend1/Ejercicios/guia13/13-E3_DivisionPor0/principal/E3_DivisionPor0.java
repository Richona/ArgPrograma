package principal;


import java.util.InputMismatchException;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;
import servicios.DivisionNumero;

public class E3_DivisionPor0 {

    /*
        Defina una clase llamada DivisionNumero. 
    En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice 
    el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas 
    en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
    
    *** EJERCICIO 4 ***
    Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
     */
    static Random rand = new Random();
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static DivisionNumero dn = new DivisionNumero();

    public static void main(String[] args) {

        try {
            System.out.println("Ingrese un numero");
            int num1Ingresado = leer.nextInt();

            System.out.println("Ingrese otro numero");
            int num2Ingresado = leer.nextInt();
            
            String num1Cadena = String.valueOf(num1Ingresado);
            String num2Cadena = String.valueOf(num2Ingresado);
            
            int num1 = Integer.parseInt(num1Cadena);
            int num2 = Integer.parseInt(num2Cadena);

            System.out.println(dn.divisionNumero(num1, num2));
        } catch (NumberFormatException | InputMismatchException e ) {
            System.out.println("Ingrese numeros verdaderos.");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Hiciste una buena division");
        }

    }

}
