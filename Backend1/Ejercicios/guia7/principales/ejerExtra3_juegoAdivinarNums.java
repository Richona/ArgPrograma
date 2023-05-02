package guia7.principales;
import guia7.entidades.EE3_Juego;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class ejerExtra3_juegoAdivinarNums {
    /*
        Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
    El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
    El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
    El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
    Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        EE3_Juego juego = new EE3_Juego();
        
        juego.iniciarJuego();
        juego.ingresarNumeros();
    }

}
