package guia8.principales;
import guia8.entidades.E1_CuentaBancaria;
import guia8.servicios.E1_CuentaBancariaServicio;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E1_cuentaBancaria {
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
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        E1_CuentaBancariaServicio cs = new E1_CuentaBancariaServicio();
        
        E1_CuentaBancaria cuenta = cs.crearCuenta();
        
        cs.ingresar(cuenta, 200);
        cs.consultarSaldo(cuenta);
        
        cs.retirar(cuenta, 100);
        cs.consultarSaldo(cuenta);
        
        cs.extraccionRapida(cuenta);
        cs.consultarSaldo(cuenta);
        
        cs.consultarDatos(cuenta);
    }

}
