package guia7.entidades;

import java.util.Scanner;

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
    A continuación, se deben crear los siguientes métodos:
a- Método constructor que inicialice el radio pasado como parámetro.
b- Métodos get y set para el atributo radio de la clase Circunferencia.
c- Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d- Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e- Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class E2_Circunferencia {
    static Scanner leer = new Scanner(System.in);
    
    private double radio;

    public E2_Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public static E2_Circunferencia crearCircunferencia(){
        System.out.println("Ingresa radio");
        return new E2_Circunferencia(leer.nextDouble());
    }
    
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return Math.PI * 2 * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}
