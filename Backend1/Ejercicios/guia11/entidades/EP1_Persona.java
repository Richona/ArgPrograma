package guia11.entidades;

/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
*/
public class EP1_Persona {
    private String nombre, apellido;
    private EP1_Dni dni;

    public EP1_Persona() {
    }

    public EP1_Persona(String nombre, String apellido, EP1_Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public EP1_Dni getDni() {
        return dni;
    }

    public void setDni(EP1_Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "EP1_Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
}
