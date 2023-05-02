package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra14_mediaEdadHijos {
    /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
    Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
    para averiguar la media de edad de los hijos de todas las familias.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias, hijos, cont = 0, suma = 0;
        
        System.out.println("Cantidad de familias:");
        familias = leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.println("*** FAMILIA NUMERO " + (i +1) + " ***");
            System.out.println("Cantidad de hijos de la familia " + (i +1));
            hijos = leer.nextInt();
            
            for (int j = 0; j < hijos; j++) {
                System.out.println("Edad del hijo " + (j +1) + " de la familia " + (i + 1));
                suma += leer.nextInt();
                cont++;
            }
        }
        
        System.out.println("La media de edad de todos los hijos de todas las familias es: " + (suma/cont));
    }

}
