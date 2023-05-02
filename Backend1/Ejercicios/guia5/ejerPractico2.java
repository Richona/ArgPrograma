package guia5;
import java.util.Scanner;

public class ejerPractico2 {
    /*
        Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo

    */
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        String [] equipo = new String[11];
        
        for (int i = 0; i < 11; i++) {
                equipo[i] = leer.nextLine();
        }
        
        for (int i = 0; i < 11; i++) {
                System.out.println(equipo[i]);
        }

    }

}
