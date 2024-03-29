package guia8.entidades;

import java.util.Scanner;

/*
    Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
    Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
    Hay que insertar estos 3 valores para instanciar el objeto a través de un método constructor. 
*/
public class EE1_Raices {
    static Scanner leer = new Scanner(System.in);

    private double a, b, c;

    public EE1_Raices() {
    }

    public EE1_Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "EE1_Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
