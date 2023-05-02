package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra1_minutosADiaHora {
    /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa cantidad en minutos");
        int min = leer.nextInt();
        int horas = 0, dias = 0;
        
        for (int i = 0; i < min / 60; i++) {
            horas++;
            if (horas == 24) {
                dias++;
                horas = 0;
            }
        }
        
        System.out.print(dias == 1 ? dias + " dia, " : dias + " dias, ");
        System.out.println(horas == 1 ? + horas + " hora." : horas + " horas.");
        
    }

}
