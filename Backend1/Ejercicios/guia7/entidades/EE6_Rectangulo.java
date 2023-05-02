package guia7.entidades;

import java.util.Scanner;

/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule 
    y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" 
    con lados de 4 y 6 y imprime el área del rectángulo.
*/
public class EE6_Rectangulo {
    static Scanner leer = new Scanner(System.in);

    private double lado1, lado2;

    public EE6_Rectangulo() {
    }

    public EE6_Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double calcularArea(){
        return getLado1() * getLado2();
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
    
}
