/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejerPractico1.entidad;

/**
 *
 * @author Richard
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private int dni;
    private int paciencia = 100;
    private String apodo;

    public Persona() {
    }
 
    public Persona(String nombre, int edad, int dni, String apodo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String getApodo() {
        return apodo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    } 

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    
    public int estres(int cantEstres){
        paciencia = paciencia - cantEstres;
        paciencia -= cantEstres;
        
        return paciencia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", paciencia=" + paciencia + ", apodo=" + apodo + '}';
    }

    

    
    
    
    
    
}
