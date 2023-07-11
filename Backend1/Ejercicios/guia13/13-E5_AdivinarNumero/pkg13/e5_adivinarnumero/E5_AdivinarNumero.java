package pkg13.e5_adivinarnumero;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E5_AdivinarNumero {
    /*
        Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
    */
    static Random rand = new Random();
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        int numAlea = rand.nextInt(500) +1, intentos = 0, numIng;

        do {            
            try {
                System.out.println("Intenta adivinar el numero secreto...");
                numIng = leer.nextInt();
                
                if (numIng == numAlea) {
                    break;
                }
                
                System.out.println(numIng > numAlea ? "Mas chico" : "Mas grande");
                
            } catch (Exception e) {
                leer.next();
                System.out.println("Por favor, ingresa numeros.");
            }finally{
                      intentos++;      
            }
        } while (true);
        
        System.out.printf("Adivinaste el numero %d en %d intentos.%n", numAlea, intentos);
    }

}
