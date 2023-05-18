package guia9.servicios;

import guia9.entidades.E5_Persona;
import java.util.Date;
import java.util.Scanner;

/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
    
1- Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.

2-Método calcularEdad que calcule la edad del usuario utilizando el atributo 
    de fecha de nacimiento y la fecha actual.

3-Método menorQue recibe como parámetro una Persona y una edad. 
    Retorna true si la persona es menor que la edad consultada o false en caso contrario.

4-Método mostrarPersona que muestra la información de la persona deseada.
*/
public class E5_PersonaService {
    public E5_Persona crearPersona(Scanner leer){
        E5_Persona p = new E5_Persona();
        System.out.println("Ingrese su nombre:");
        p.setNombre(leer.nextLine());
        System.out.println("Ingresar año, mes y dia de su fecha de nacimiento");
        p.setFechaNac(new Date(leer.nextInt() -1900, leer.nextInt() -1, leer.nextInt()));
        
        return p;
    }
    
    public int calcularEdad(E5_Persona p){
        return new Date().getYear() - p.getFechaNac().getYear();
    }

    public boolean menorQue(E5_Persona p, int e){
        return calcularEdad(p) < e;
    }
    
    public void mostrarPersona(E5_Persona p){
        System.out.println(p);
    }
}
