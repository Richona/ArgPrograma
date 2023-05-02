package guia7.entidades;

import java.util.Scanner;

/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
    El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/
public class EE5_Empleado {
    static Scanner leer = new Scanner(System.in);

    private String nombre;
    private int edad;
    private double salario;

    public EE5_Empleado() {
    }

    public EE5_Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularAumento(){
        System.out.println("*** DATOS DEL EMPLEADO ***");
        System.out.println("Nombre:");
        setNombre(leer.next());
        
        System.out.println("Edad:");
        setEdad(leer.nextInt());
        
        System.out.println("Salario:");
        setSalario(leer.nextDouble());
        
        if (getEdad() > 30) {
            System.out.println("Aumento del 10%");
            return getSalario() * 1.10;
        }
        
        System.out.println("Aumento del 5%");
        return getSalario() * 1.05;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
    
}
