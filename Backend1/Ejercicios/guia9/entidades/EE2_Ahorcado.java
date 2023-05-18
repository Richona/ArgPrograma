package guia9.entidades;

import java.util.Arrays;

/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
    contener como atributos, un vector con la palabra a buscar, la cantidad de 
    letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
 */
public class EE2_Ahorcado {
    private final String[] fases = {
        "                  +-------+\n"
        + "                    |         |\n"
        + "                   O        |\n"
        + "                              |\n"
        + "                   /|\\        |\n"
        + "                   / \\        |\n"
        + "            _________|",
        "                  +-------+\n"
        + "                    |         |\n"
        + "                   O        |\n"
        + "                   /|\\        |\n"
        + "                   / \\        |\n"
        + "                              |\n"
        + "            _________|",
        "                  +-------+\n"
        + "                    |         |\n"
        + "                   O        |\n"
        + "                   /|\\        |\n"
        + "                   /          |\n"
        + "                              |\n"
        + "            _________|",
        "                  +-------+\n"
        + "                    |         |\n"
        + "                   O        |\n"
        + "                   /|\\        |\n"
        + "                              |\n"
        + "                              |\n"
        + "            _________|",
        "                  +-------+\n"
        + "                    |         |\n"
        + "                   O        |\n"
        + "                   /|         |\n"
        + "                              |\n"
        + "                              |\n"
        + "            _________|",
        "                  +-------+\n"
        + "                    |         |\n"
        + "                   O        |\n"
        + "                    |         |\n"
        + "                              |\n"
        + "                              |\n"
        + "            _________|",
        "                  +-------+\n"
        + "                    |         |\n"
        + "                   O        |\n"
        + "                              |\n"
        + "                              |\n"
        + "                              |\n"
        + "            _________|",
        "                  +-------+\n"
        + "                    |         |\n"
        + "                              |\n"
        + "                              |\n"
        + "                              |\n"
        + "                              |\n"
        + "            _________|",
    };
    private char palabraABuscar[];
    private int cantLetrasEncon, cantJugadasMaximas = fases.length;

    public EE2_Ahorcado() {
    }

    public EE2_Ahorcado(char[] palabraABuscar, int cantLetrasEncon) {
        this.palabraABuscar = palabraABuscar;
        this.cantLetrasEncon = cantLetrasEncon;
    }

    public char[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(char[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantLetrasEncon() {
        return cantLetrasEncon;
    }

    public void setCantLetrasEncon(int cantLetrasEncon) {
        this.cantLetrasEncon = cantLetrasEncon;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String getFases(int f) {
        return fases[f];
    }

    @Override
    public String toString() {
        return "EE2_Ahorcado{" + "palabraABuscar=" + Arrays.toString(palabraABuscar) + ", cantLetrasEncon=" + cantLetrasEncon + ", cantJugadasMaximas=" + cantJugadasMaximas + '}';
    }

}
