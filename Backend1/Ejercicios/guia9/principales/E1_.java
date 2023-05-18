package guia9.principales;
import guia9.entidades.E1_Cadena;
import guia9.servicios.E1_CadenaServicio;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E1_ {
    /*
        Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
    atributos una frase (String) y su longitud. Agregar constructor vacío y con
    atributo frase solamente. Agregar getters y setters. El constructor con frase
    como atributo debe setear la longitud de la frase de manera automática.

Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:

1-Método mostrarVocales(): deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
2-Método invertirFrase(): deberá invertir la frase ingresada y mostrarla por pantalla. 
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
3-Método vecesRepetido(): recibirá un carácter ingresado por el usuario y contabilizar 
    cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
4-Método compararLongitud(): deberá comparar la longitud de la frase que compone la 
    clase con otra nueva frase ingresada por el usuario.
    
5-Método unirFrases(): deberá unir la frase contenida en la clase Cadena con una 
    nueva frase ingresada por el usuario y mostrar la frase resultante.
    
6-Método reemplazar(): deberá reemplazar todas las letras “a” que se encuentren en la frase, 
    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    
7-Método contiene(): deberá comprobar si la frase contiene una letra que ingresa el 
    usuario y devuelve verdadero si la contiene y falso si no.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        E1_CadenaServicio cs = new E1_CadenaServicio();
        E1_Cadena f = cs.crearFrase(leer);
        
        System.out.println("***Cantidad vocales***\n" + cs.mostrarVocales(f));
        
        cs.invertirFrase(f);
        
         System.out.println("***Cantidad repetido*** \n" + cs.vecesRepetido(f, 'x'));
//       System.out.println("Caracter a buscar...");
//       System.out.println("***Cantidad repetido*** \n" + cs.vecesRepetido(f, leer.nextLine().charAt(0)));
        
        System.out.println("***Tienen la misma longitud?*** \n" + cs.compararLongitud(f, "hola"));
//        System.out.println("Ingresa otra frase para comparar la longitud...");
//        System.out.println("***Tienen la misma longitud?*** \n" + cs.compararLongitud(f, leer.nextLine()));
        
        cs.unirFrases(f, "chau");
//        System.out.println("Ingresa frase para unir a la original...");
//        cs.unirFrases(f, leer.nextLine());
        
        cs.reemplazar(f, 'c');
//        System.out.println("Ingresa caracter para remplazar todas las a...");
//        cs.reemplazar(f, leer.nextLine().charAt(0));

        System.out.println("Ingresa caracter para buscar...");
        System.out.println("***Contiene el caracter la frase?***\n"+ cs.contiene(f, leer.nextLine().charAt(0)));
    }

}
