package guia8.servicios;

import guia8.entidades.EP1_Persona;
import java.util.Scanner;

/*

*/
public class EP1_PersonaService {
    static Scanner leer = new Scanner(System.in);

    public EP1_Persona crearPersona(){
        
        EP1_Persona persona = new EP1_Persona();
        
        System.out.println("Ingresar nombre:");
        persona.setNombre(leer.nextLine());
        
        System.out.println("Ingresar edad:");
        persona.setEdad(leer.nextInt());
        
        return persona;
    }
    
    public void mostrarPersona(EP1_Persona persona){
        System.out.printf("Nombre: %s | Edad: %d. %n", persona.getNombre(), persona.getEdad());  
    }
}
