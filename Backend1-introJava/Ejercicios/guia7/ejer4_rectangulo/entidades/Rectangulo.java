package guia7.ejer4_.entidades;

import java.util.Scanner;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
    La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
    También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
    Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
    Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
public class Rectangulo {
    static Scanner leer = new Scanner(System.in);

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static Rectangulo crearRectangulo(){
        double base, altura;
        
        System.out.println("Ingresa base");
        base = leer.nextDouble();
        System.out.println("Ingresa altura");
        altura = leer.nextDouble();
        
        return new Rectangulo(base, altura);
    }
    
    public double superficie(){
        return getBase() * getAltura();
    }
    
    public double perimetro(){
        return (getBase() + getAltura()) * 2;
    }
    
    public void dibujar(){
        base = getBase();
        altura = getAltura();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura -1 || j == 0 || j == base -1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
