package guia5;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra6_sopaDeLetras {
    /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
    construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
    en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no 
    utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
    
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String pal; 
        char matriz[][];
        boolean espDisp[];
        int posAlea, colAlea, acu;
        
        matriz = new char [20][20];
        espDisp = new boolean[20];
        
        for (int i = 0; i < 5; i++) {
            
            do {
                System.out.printf("Ingresa la %d palabra:%n", i+1);
                pal = leer.next();
                
                System.out.println(pal.length() < 3 || pal.length() > 5 ? "ERROR!" : "Muy bien!");
            } while (pal.length() < 3 || pal.length() > 5);
            
           
            do {
                posAlea = rand.nextInt(20);
            } while (espDisp[posAlea]);
            espDisp[posAlea] = true;
            
            
            colAlea = rand.nextInt(15);
            acu = 0;
            for (int j = colAlea; j < colAlea + pal.length(); j++) {
                matriz[posAlea][j] = pal.charAt(acu);
                acu++;
            }
        }
        

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == 0) {
                    matriz[i][j] = Integer.toString(rand.nextInt(10)).charAt(0);
                }
            }
        }
        
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }

}
