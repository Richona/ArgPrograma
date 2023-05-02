package guia8.servicios;

import guia8.entidades.E2_Cafetera;
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
public class E2_CafeteraServicio {
    static Scanner leer = new Scanner(System.in);
    E2_Cafetera caf = new E2_Cafetera();
    
    public void llenarCafetera(){
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }
    
    public void servirTaza(int taza){
        if (taza <= caf.getCantidadActual()) {
            System.out.println("Se lleno la taza :D");
            caf.setCantidadActual(caf.getCantidadActual() - taza);
        }else{
            System.out.println("No se pudo llenar la taza, quedo en " + caf.getCantidadActual());
            caf.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(){
        caf.setCantidadActual(0);
    }
    
    public void agregarCafe(int cant){
        if ((caf.getCantidadActual() + cant) > caf.getCapacidadMaxima()) {
            System.out.println("Limite excedido");
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }else{
            caf.setCantidadActual(caf.getCantidadActual() + cant);
        }
        
    }
}
