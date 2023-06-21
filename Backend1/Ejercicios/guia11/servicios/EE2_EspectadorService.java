package guia11.servicios;

import guia11.entidades.EE2_Espectador;
import java.util.ArrayList;
import java.util.Random;

/*

*/
public class EE2_EspectadorService {
    private final Random rand = new Random();
    
    public ArrayList<EE2_Espectador> crearEspectadoresAuto(){
        ArrayList<EE2_Espectador> espectadores = new ArrayList();
        
        String[] nombres = {"Richard", "Marcelo", "Agus", "Tiger", "Daniel", "Nadia", "Lucas", "Dominic", "Pizza", "Liliana", "Jesica", "Marcela", "Miguel", "Messi", "Dibu", "Luli", "Biza", "Scaloni", "Osito", "Bagucha", "Priscila", "Vezir", "Night", "Catriel", "Pedro", "Ian", "Aldana", "David", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1a", "2b", "3c", "4d", "5e", "6f", "7g", "8h", "9i", "10j", "11k", "12l", "13m", "14n"};
        
        for (int i = 0; i < nombres.length; i++) {
            espectadores.add(new EE2_Espectador(nombres[i], rand.nextInt(100)+1, rand.nextInt(1001)));
        }
        
        return espectadores;
    }
    
    public void mostrarEspectores(ArrayList<EE2_Espectador> espectadores){
        for (int i = 0; i < espectadores.size(); i++) {
            System.out.printf("Espectador n°%d: %s.%n", i+1, espectadores.get(i));
        }

    }
}
