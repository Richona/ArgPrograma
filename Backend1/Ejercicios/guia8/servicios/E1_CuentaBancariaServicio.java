package guia8.servicios;

import guia8.entidades.E1_CuentaBancaria;
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
public class E1_CuentaBancariaServicio {
    static Scanner leer = new Scanner(System.in);

    E1_CuentaBancaria cuenta = new E1_CuentaBancaria();
    
    public void crearCuenta(){
        System.out.println("*** DATOS DE LA CUENTA ***");
        System.out.println("Numero de cuenta:");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Numero de dni:");
        cuenta.setDniCliente(leer.nextLong());
//        System.out.println("Saldo actual:");
//        cuenta.setSaldoActual(leer.nextDouble());
    }
    
    public void ingresar(double dinero){
        if (dinero >= 0) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() + dinero);
        }else{
            System.out.println("Ingresa valores positivos.");
        }
    }
    
    public void retirar(double dinero){
        if (dinero <= cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - dinero);
        }else{
            System.out.println("No tiene los fondos suficientes. \nSe retirara el total del saldo actaul.");
            System.out.println("Saldo retirado: " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }
    }
    
    public void extraccionRapida(){
        if (cuenta.getSaldoActual() > 0) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
        }else{
            System.out.println("Eres pobre.");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta() + " | Numero de dni: " + cuenta.getDniCliente());
    }
    
}
