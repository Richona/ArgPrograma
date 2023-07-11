package servicios;

import entidades.E3_Persona;
import java.util.Random;
import java.util.Scanner;

/*

*/
public class E3_PersonaServicio {
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    

    public boolean esMayorDeEdad(E3_Persona pers) throws Exception{
        if (pers.getEdad() < 0) {
            throw new Exception("Por favor, la edad no puede ser menor que 0.");
        }

        return pers.getEdad() >= 18;
    }
    
}
