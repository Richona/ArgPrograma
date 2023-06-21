package guia11.servicios;

import guia11.entidades.E2_Jugador;
import guia11.entidades.E2_Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/*
El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
*/
public class E2_JugadorService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ArrayList<Integer> IDsDisponibles = new ArrayList<>();
    
    public E2_Jugador crearJugador(){
        E2_Jugador j = new E2_Jugador();
        
        int id;
        do {
            System.out.println("Ingrese su id");
            id = leer.nextInt();
        } while (id < 1 || id > 6 || IDsDisponibles.contains(id));
        
        IDsDisponibles.add(id);
        
        System.out.println("Ingrese su nombre:");
        j.setNombre(leer.next() + id);
        
        return j;
    }
    
    public boolean disparo(E2_Revolver r, E2_Jugador j){
        E2_RevolverService rs = new E2_RevolverService();
        
        boolean seMojo = rs.mojar(r);
        
        if (seMojo) {
            j.setMojado(true);
        }
        
        rs.siguienteChorro(r);
        
        return seMojo;
    }
    
}
