package guia8.entidades;

import java.util.Scanner;

/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
    numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.

Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:

1-Método para crear cuenta pidiéndole los datos al usuario.
    
2-Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    
3-Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
   Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
4-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    
5-Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    
6-Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
public class E1_CuentaBancaria {
    static Scanner leer = new Scanner(System.in);

    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public E1_CuentaBancaria() {
    }

    public E1_CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "E1_CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
        
}
