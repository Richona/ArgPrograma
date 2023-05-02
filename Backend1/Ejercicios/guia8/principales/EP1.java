package guia8.principales;

import guia8.entidades.EP1_Persona;
import guia8.servicios.EP1_PersonaService;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EP1 {
    /*
        
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        EP1_PersonaService pService = new EP1_PersonaService();
        
        EP1_Persona persona = pService.crearPersona();
       
        pService.mostrarPersona(persona);
    }

}
