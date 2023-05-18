package guia9.entidades;

import java.util.Random;

/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos 
    números reales con los cuales se realizarán diferentes operaciones matemáticas. 
    La clase debe tener un constructor vacío, getters y setters.  
    En el constructor vacío se usará el Math.random para generar los dos números. 
*/
public class E2_ParDeNumeros {
    private double n1, n2;

    public E2_ParDeNumeros(Random rand) {
        n1 = rand.nextInt(20)+1;
        n2 = rand.nextInt(20)+1;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "E2_ParDeNumeros{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    
}
