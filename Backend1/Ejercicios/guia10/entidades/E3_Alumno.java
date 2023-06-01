package guia10.entidades;

import java.util.ArrayList;

/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
*/
public class E3_Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    public E3_Alumno() {
    }

    public E3_Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "E3_Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    
}
