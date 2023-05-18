package guia9.entidades;

import java.util.Date;

/*
Implemente la clase Persona en el paquete entidades. 
    Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
    constructor vacío, constructor parametrizado, get y set. 
*/
public class E5_Persona {
    private String nombre;
    private Date fechaNac;

    public E5_Persona() {
    }

    public E5_Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "E5_Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
