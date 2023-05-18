package guia9.servicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
1-Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    
2-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    
3-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    
4-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
*/
public class E3_ArregloService {
    public void inicializarA(Integer a[], Random rand){
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10)+1;
        }
    }
    
    public void mostrar(Integer a[]){
        System.out.println(Arrays.toString(a)); 
    }
//    3-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(Integer a[]){
        Arrays.sort(a, Comparator.reverseOrder()); 
    }
    
//4-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(Integer a[], Integer b[]){
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b, 10, 20, 0.5);
    }
}
