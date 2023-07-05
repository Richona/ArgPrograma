package entidades;

import constantes.Constantes;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*

*/
public abstract class Persona {
        private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        private final Random rand = new Random();
    
    protected String nombre, apellido, estadoCivil;
    protected int dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String estadoCivil, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", dni=" + dni + '}';
    }
    
    public void crearPersonaAuto(){
        nombre = Constantes.NOMBRES[rand.nextInt(Constantes.NOMBRES.length)];
        
        apellido = Constantes.APELLIDOS[rand.nextInt(Constantes.APELLIDOS.length)];
        
        estadoCivil = Constantes.ESTADOSCIVILES[rand.nextInt(Constantes.ESTADOSCIVILES.length)];
        
        do {
            dni = rand.nextInt(40000000) + 1;
        } while (Constantes.DNIS.contains(dni));
        
        Constantes.DNIS.add(dni);
    }
    
    //• Cambio del estado civil de una persona.
    public void cambiarEstadoCivil(){
        String msg = "*** CAMBIAR ESTADO CIVIL ***\n";
        int opc;
        
        for (int i = 0; i < Constantes.ESTADOSCIVILES.length; i++) {
            msg += (i +1) + "- " + Constantes.ESTADOSCIVILES[i] + "\n";
        }
        
        msg += "Elija una opcion...";
        
        do {
            System.out.println(msg);
            opc = leer.nextInt();
        } while (opc < 1 || opc > Constantes.ESTADOSCIVILES.length);
        
        this.estadoCivil = Constantes.ESTADOSCIVILES[opc -1];
    }
}
