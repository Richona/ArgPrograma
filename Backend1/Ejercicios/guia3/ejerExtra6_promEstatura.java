package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra6_promEstatura {
    /*
        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
    y el promedio de estaturas en general.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas personas ingresaras?");
        int cant = leer.nextInt(), contdeb160 = 0,  contGen = 0;
        double sumadeb160 = 0, sumaGen = 0;
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Cuanto mide la persona " + (i+1));
            double pers = leer.nextDouble();

            
            if (pers < 1.60) {
                contdeb160++;
                sumadeb160 += pers;
            }
            
            contGen++;
            sumaGen += pers;
        }
        
        System.out.println("El promedio de la estatura por debajo de 1.60 es: " + (sumadeb160 / contdeb160));
        System.out.println("El promedio en general es: " + (sumaGen / contGen));
    }

}
