package guia7.ejerPractico1;

import guia7.ejerPractico1.entidad.Persona;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerPractico1 {
    /*
        
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        Persona seg = new Persona();
        seg.setNombre("Richard");
        seg.setEdad(24);
        seg.setDni(41232132);
        seg.setApodo("Richona");
        
        String nombre = seg.getNombre();
        int edad = seg.getEdad();
        int dni = seg.getDni();
        String apodo = seg.getApodo();
        
        System.out.println("apodo: "+ seg.getApodo());
        System.out.println(seg);
        
        seg.estres(20);
        seg.estres(50);
        
        System.out.println(seg);
    }

}
