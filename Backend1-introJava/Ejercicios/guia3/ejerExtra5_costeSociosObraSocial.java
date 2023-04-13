package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra5_costeSociosObraSocial {
    /*
        Una obra social tiene tres clases de socios:
* Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
    
* Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
    
* Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
    
*Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tipos de socios. \nA \nB \nC \nIngrese su tipo:");
        String tipo = leer.next();
        System.out.println("Valor real del coste del tratamiento.");
        int costo = leer.nextInt();
        
        switch (tipo.toLowerCase()) {
            case "a":
                System.out.println("Recibe un 50% de descuento por ser tipo A. \nEl valor a pagar es: " + (costo - (costo*0.50)));
                break;
            case "b":
                System.out.println("Recibe un 35% de descuento por ser tipo B. \nEl valor a pagar es: " + (costo - (costo*0.35)));
                break;
            case "c":
                System.out.println("No recibe descuento por ser tipo C. \nEl valor a pagar es: " + costo);
                break;
            default:
                System.out.println("ERROR! No existe ese tipo de socio");
        }
    }

}
