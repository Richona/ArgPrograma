package guia8.entidades;

import java.util.Scanner;

/*

*/
public class EP1_Persona {
    static Scanner leer = new Scanner(System.in);

    private String nombre;
    private int edad;

    public EP1_Persona() {
    }

    public EP1_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "EP1_Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
