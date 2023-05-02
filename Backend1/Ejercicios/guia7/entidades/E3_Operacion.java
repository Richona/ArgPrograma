package guia7.entidades;

import java.util.Scanner;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
a- Método constructor con todos los atributos pasados por parámetro.
b- Método constructor sin los atributos pasados por parámetro.
c- Métodos get y set.
d- Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e- Método sumar(): calcular la suma de los números y devolver el resultado al main.
f- Método restar(): calcular la resta de los números y devolver el resultado al main
g- Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 
    y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
h- Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
    el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/

public class E3_Operacion {
    static Scanner leer = new Scanner(System.in);

    private int num1;
    private int num2;

    public E3_Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public E3_Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public static E3_Operacion crearOperacion(){
        int n1, n2;
        
        System.out.println("Ingresa el primer numero");
        n1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo numero");
        n2 = leer.nextInt();
        
        return new E3_Operacion(n1, n2);
    }
    
    public int sumar(){
        return getNum1() + getNum2();
    }
    
    public int restar(){
        return getNum1() - getNum2();
    }
    
    public int multiplicar(){
        if (getNum2() == 0) {
            System.out.println("No se puede multiplicar por 0");
            return 0;
        }
        
        return getNum1() * getNum2();
    }
    
    public int dividir(){
        if (getNum2() == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        }
        
        return getNum1() / getNum2();
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
