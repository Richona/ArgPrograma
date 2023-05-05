package guia8.entidades;

import java.util.Scanner;

/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos 
    capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y 
    cantidadActual (la cantidad actual de café que hay en la cafetera). 
    Agregar constructor vacío y con parámetros así como setters y getters.

    Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

1-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    
2-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
    simula la acción de servir la taza con la capacidad indicada. 
    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
    El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    
3-Método vaciarCafetera(): pone la cantidad de café actual en cero.
    
4-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
*/
public class E2_Cafetera {
    static Scanner leerCaf = new Scanner(System.in);

    private final int capacidadMaxima = 10;
    private int cantidadActual;

    public E2_Cafetera() {
    }
    
    public E2_Cafetera(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "E2_Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
