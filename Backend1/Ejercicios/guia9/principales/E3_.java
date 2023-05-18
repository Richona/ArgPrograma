package guia9.principales;
import guia9.servicios.E3_ArregloService;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E3_ {
    /*
        Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B 
    de 20 números reales. 
    
    Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
1-Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    
2-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    
3-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    
4-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E3_ArregloService as = new E3_ArregloService();
        
        Integer arrayA[] = new Integer[10];
        Integer arrayB[] = new Integer[10];

        as.inicializarA(arrayA, rand);
        
        as.mostrar(arrayA);
        as.ordenar(arrayA);
        as.mostrar(arrayA);
//        as.inicializarB(arrayA, arrayB);
//        as.mostrar(arrayA);
//        as.mostrar(arrayB);
    }

}
