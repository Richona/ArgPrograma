package guia7.entidades;

import java.util.Scanner;

/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
    Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
    Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
*/
public class EE4_Cuenta {
    static Scanner leer = new Scanner(System.in);
    
    private double saldo;
    private String titular;

    public EE4_Cuenta() {
    }

    public EE4_Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String retirar_dinero(){
        double saldoIng;
        String titularIng;
        
        System.out.println("Titular:");
        titularIng = leer.nextLine();
        
        System.out.println("Saldo a retirar:");
        saldoIng = leer.nextDouble();
        
        if (!titularIng.equalsIgnoreCase(getTitular())) {
            return "Error! Titular incorrecto";
        }
        
        if (saldoIng < 0) {
            return "Error! Ingresa saldo positivo.";
        }
        
        if (getSaldo() - saldoIng < 0) {
            return "Error! No tienes los fondos sufientes.";
        }
        
        setSaldo(getSaldo() - saldoIng);
        
        return "Saldo retirado: "+ saldoIng +".\nTu saldo queda en " + getSaldo();
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    
    
}
