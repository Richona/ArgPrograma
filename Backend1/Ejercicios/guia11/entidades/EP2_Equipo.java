package guia11.entidades;

import java.util.ArrayList;

/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
*/
public class EP2_Equipo {
    private ArrayList<EP2_Jugador> jugadores;

    public EP2_Equipo() {
    }

    public EP2_Equipo(ArrayList<EP2_Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<EP2_Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<EP2_Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "EP2_Equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
}
