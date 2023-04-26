package guia7.ejerExtra4_cuentaBancaria;
import guia7.ejerExtra4_.entidades.Cuenta;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra4 {
    /*
        Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
    Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
    Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(100000, "Richard");

        System.out.println(cuenta.retirar_dinero());
    }

}
