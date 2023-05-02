package guia7.entidades;

import java.io.Console;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
    El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
    El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
    El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
    Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class EE3_Juego {

    static Scanner leer = new Scanner(System.in);
    JPasswordField pwd = new JPasswordField();
    
    
    private int num1;
    private int num2;
    private int intentos = 5;
    private int ganadosJug1;
    private int ganadosJug2;

    public EE3_Juego() {
    }

    public EE3_Juego(int num2) {
        this.num2 = num2;
    }

    public EE3_Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getGanadosJug1() {
        return ganadosJug1;
    }

    public int getGanadosJug2() {
        return ganadosJug2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setGanadosJug1(int ganadosJug1) {
        this.ganadosJug1 = ganadosJug1;
    }

    public void setGanadosJug2(int ganadosJug2) {
        this.ganadosJug2 = ganadosJug2;
    }

    public void iniciarJuego() {
        System.out.println("Comenzando juego...");
        setGanadosJug1(0);
        setGanadosJug2(0);
    }

    public void ingresarNumeros() {
        do {
            JOptionPane.showConfirmDialog(null, pwd, "Jugador 1 ingrese el numero a adivinar",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);  
            
            setNum1(Integer.parseInt(String.valueOf(pwd.getPassword())));
        } while (getNum1() < 1 || getNum1() > 20);
        
        ingresarNum2();
        
        do {
            if (validarNums()) {
                setIntentos(5);
                
                System.out.println("***********************************");
                System.out.printf("***   Puntuacion jugador 1: %d   *** %n***   Puntuncion jugador 2: %d   *** %n", getGanadosJug1(), getGanadosJug2());
                System.out.println("***********************************");
                
                System.out.println("Quieres seguir jugando? s/n");
                
                if (leer.next().equalsIgnoreCase("s")) {
                    ingresarNumeros();
                } else {
                    System.out.println("Gracias por usar nuestro juego.");
                    break;
                }
            } 
            
        } while (true);

    }

    private boolean validarNums() {
        if (getNum1() == getNum2()) {
            System.out.println("Genial! Adivinaste. \nGano el jugador 2.");
            setGanadosJug2(getGanadosJug2() + 1);
            return true;
        } else if (getIntentos() == 1) {
            System.out.println("Te quedaste sin intentos :C. \nGano el jugador 1.");
            setGanadosJug1(getGanadosJug1() + 1);
            return true;
        } else {
            setIntentos(getIntentos() - 1);
            System.out.println("Error! Intentalo nuevamente... " + (getNum1() > getNum2() ? "mas alto." : "mas bajo."));
            ingresarNum2();
            return false;
        }
    }

    private void ingresarNum2() {
        System.out.println("Jugador 2 adivina el numero entre 1 y 20. \n" + getIntentos() + (getIntentos() == 1 ? " intento." : " intentos."));
        setNum2(leer.nextInt());
    }

    @Override
    public String toString() {
        return "Juego{" + "num1=" + num1 + ", num2=" + num2 + ", intentos=" + intentos + ", ganadosJug1=" + ganadosJug1 + ", ganadosJug2=" + ganadosJug2 + '}';
    }

}
