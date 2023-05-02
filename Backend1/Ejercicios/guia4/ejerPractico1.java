package guia4;
import java.util.Scanner;

public class ejerPractico1 {
    
    
    public static void main(String[] args) {
        /*
            Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
        y luego codifique la palabra o frase ingresada de la siguiente manera: 
        cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
        (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a  e  i  o  u
@  #  $  %  *
Realice un subprograma que reciba una secuencia de caracteres y 
        retorne la codificación correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
         */
        
        Scanner leer = new Scanner(System.in);
        String frase, fraseCod = "", car;
        
        do {
            System.out.println("Ingresa una frase terminada en punto.");
            frase = leer.nextLine();
        } while (!frase.substring(frase.length()-1, frase.length()).equals("."));
        
        System.out.println(codigo(frase));
    }
    public static String codigo(String frase){
        String fraseCod = "", car;
        
        for (int i = 0; i < frase.length(); i++) {
            car = frase.substring(i, i+1);
            switch (car.toLowerCase()) {
                case "a":
                        fraseCod += "@";
                    break;
                case "e":
                        fraseCod += "#";
                    break;
                case "i":
                        fraseCod += "$";
                    break;
                case "o":
                        fraseCod += "%";
                    break;
                case "u":
                        fraseCod += "*";
                    break;
                default:
                    fraseCod += car;
            }
        }
        
        return fraseCod;
    }

}
