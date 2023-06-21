package guia11.principales;

import guia11.entidades.EP2_Equipo;
import guia11.entidades.EP2_Jugador;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EP2 {

    /*
        Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
     */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nombres = {"Lionel", "Lautaro", "Julian", "Emiliano", "Cristian", "Nicolas", "Marcos", "Enzo", "Leandro", "Alexis", "Angel"};
        String[] apellidos = {"Messi", "Martinez", "Alvarez", "Martinez", "Romero", "Otamendi", "Acuña", "Fernandez", "Paredes", "Mac Allister", "Di Maria"};
        String[] posicion = {"Delantero", "Delantero", "Delantero", "Arquero", "Defensor", "Defensor", "Defensor", "Medio Campista", "Medio Campista", "Medio Campista", "Delantero"};
        int[] numeros = {10, 22, 9, 23, 13, 19, 8, 24, 5, 20, 11};

        ArrayList<EP2_Jugador> seleccion = new ArrayList();

        for (int i = 0; i < nombres.length; i++) {
            seleccion.add(new EP2_Jugador(nombres[i], apellidos[i], posicion[i], numeros[i]));
        }

        EP2_Equipo e = new EP2_Equipo(seleccion);
        for (EP2_Jugador jugador : seleccion) {
            System.out.println(jugador);
        }
    }

}
