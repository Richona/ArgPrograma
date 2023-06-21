package guia11.servicios;

import guia11.entidades.E2_Juego;
import guia11.entidades.E2_Jugador;
import guia11.entidades.E2_Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/*
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
 */
public class E2_JuegoService {

    private final E2_RevolverService rs = new E2_RevolverService();
    private final E2_JugadorService js = new E2_JugadorService();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego(ArrayList<E2_Jugador> jugadores, E2_Revolver r) {
        System.out.println("Inicia el juego...");
        rs.llenarRevolver(r);

        int cant = 6;

        System.out.println("Quieres elegir la cantidad de jugadores? s/n");
        if (leer.next().equalsIgnoreCase("s")) {
            do {
                System.out.println("Cantidad de jugadores:");
                cant = leer.nextInt();
            } while (cant < 1 || cant > 6);
        }

        for (int i = 0; i < cant; i++) {
            System.out.printf("Jugador %d || Total %d %n", i + 1, cant - i);
            jugadores.add(js.crearJugador());
        }
    }

    public boolean ronda(E2_Jugador j, E2_Revolver r) {
        if (js.disparo(r, j)) {
            System.out.printf("Jugado %s mojado %n", j.getNombre());
            return false;
        }

        System.out.printf("Jugado %s Salvado %n", j.getNombre());
        return true;
    }

    public void juego() {
        E2_Juego juego = new E2_Juego(new ArrayList(), new E2_Revolver());

        llenarJuego(juego.getJugadores(), juego.getRevolver());

        do {
            E2_Jugador jugador;
            int indiceJugador = 0;
            
            for (int i = 0; i < juego.getJugadores().size(); i++) {
                juego.getJugadores().get(i).setMojado(false);
            }
            
            rs.llenarRevolver(juego.getRevolver());
            
            do {
                jugador = juego.getJugadores().get(indiceJugador);
                indiceJugador++;

                if (indiceJugador >= juego.getJugadores().size()) {
                    indiceJugador = 0;
                }

                if (jugador.isMojado()) {
                    break;
                }

                System.out.println("Apreta cualquier tecla para continuar.");
                leer.next();
            } while (ronda(jugador, juego.getRevolver()));

            System.out.println("Quieres seguir jugando? s/n");
        } while (leer.next().equalsIgnoreCase("s"));

    }

}
