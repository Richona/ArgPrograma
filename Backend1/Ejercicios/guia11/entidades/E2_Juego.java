package guia11.entidades;

import java.util.ArrayList;

/*
***Clase Juego:*** 
esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver

*/
public class E2_Juego {
    private ArrayList<E2_Jugador> jugadores;
    private E2_Revolver revolver;

    public E2_Juego() {
    }

    public E2_Juego(ArrayList<E2_Jugador> jugadores, E2_Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<E2_Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<E2_Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public E2_Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(E2_Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "E2_Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    
}
