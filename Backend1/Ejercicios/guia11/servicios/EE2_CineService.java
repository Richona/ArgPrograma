package guia11.servicios;

import guia11.constantes.EE2_Constantes;
import guia11.entidades.EE2_Asiento;
import guia11.entidades.EE2_Cine;
import guia11.entidades.EE2_Espectador;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
    
    Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
    
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
public class EE2_CineService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final EE2_PeliculaService pServ = new EE2_PeliculaService();
    private final EE2_EspectadorService eServ = new EE2_EspectadorService();
    private final EE2_AsientoService aServ = new EE2_AsientoService();
    private final Random rand = new Random();

    public EE2_Cine crearCine() {
        EE2_Cine c = new EE2_Cine();

        c.setEspectadores(eServ.crearEspectadoresAuto());
        c.setPelicula(pServ.crearPelicula());

        System.out.println("Precio de la pelicula: 200 pe");
        c.setPrecio(200);

        c.setSala(aServ.crearSala());

        return c;
    }

    public void llenarSala(EE2_Cine c) {
        int acu = 0;
        for (EE2_Espectador espectador : c.getEspectadores()) {
            acu++;
            
            if (espectador.getDinero() < c.getPrecio()) {
                System.out.printf("%s no tiene el dinero suficiente (%.2f).%n", espectador.getNombre(), espectador.getDinero());
                continue;
            }
            
            if (c.getAsientosDisponibles() == 0) {
                System.out.printf("No queda mas espacio. %d personas quedaron sin chequear. %n", (c.getEspectadores().size() - acu));
                break;
            }

            if (espectador.getEdad() < c.getPelicula().getEdadMinima()) {
                System.out.printf("%s no tiene la edad suficiente (%d).%n", espectador.getNombre(), espectador.getEdad());
                continue;
            }

            boolean b = true;
            do {
                EE2_Asiento asiento = c.getSala()[rand.nextInt(EE2_Constantes.FILAS)][rand.nextInt(EE2_Constantes.COLUMNAS)];

                if (asiento.isOcupado()) {
                    continue;
                }

                asiento.setOcupado(true);
                c.setAsientosDisponibles(c.getAsientosDisponibles() - 1);
                b = false;

            } while (b);

        }

    }

    public void cine() {
        EE2_Cine c = crearCine();

        System.out.println("************************************************ \nCache:");
        llenarSala(c);
        System.out.println("************************************************");
        mostrarCine(c);
    }

    public void mostrarCine(EE2_Cine c) {
        System.out.println("Cantidad espectadores en fila: " + c.getEspectadores().size());
        System.out.println("+-----------------------------------------+");
        aServ.mostrarSala(c.getSala());
        System.out.println("+-----------------------------------------+");

        System.out.println("Espectadores en sala: " + (EE2_Constantes.ASIENTOS - c.getAsientosDisponibles()));
        System.out.println("Espectadores rechazados: " + (c.getEspectadores().size() - (EE2_Constantes.ASIENTOS - c.getAsientosDisponibles())));
        System.out.println("Asientos libres: " + c.getAsientosDisponibles());
    }

}
