package entidades;

import java.util.Random;
import java.util.Scanner;

public abstract class Edificio {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();
    
    protected double ancho, alto, largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
 
/*
 Crear una superclase llamada Edificio con los siguientes 
    atributos: ancho, alto y largo. 
    
        La clase edificio tendrá como métodos:
• Método calcularSuperficie(): 
    calcula la superficie del edificio.
    
• Método calcularVolumen(): 
    calcula el volumen del edifico.

*/
    
    public abstract double calcularSuperficie();
    
    public abstract double calcularVolumen();
    
}
