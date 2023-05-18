package guia9.servicios;

import java.util.Date;
import java.util.Scanner;

/*
Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
    
1-Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
    Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    
2-Método fechaActual que cree un objeto fecha con el día actual. 
    Para esto usaremos el constructor vacío de la clase Date. 
    Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
    
3-Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
*/
public class E4_FechaService {
    public Date fechaNacimiento(Scanner leer){
        System.out.println("Ingresar año, mes y dia de su fecha de nacimiento");
        return new Date(leer.nextInt() -1900, leer.nextInt() -1, leer.nextInt());
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public long diferencia(Date fa, Date fn){
        return fa.getYear() - fn.getYear();
    }
}
