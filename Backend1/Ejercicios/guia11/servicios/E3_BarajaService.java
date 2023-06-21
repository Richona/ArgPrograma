package guia11.servicios;

import guia11.entidades.E3_Baraja;
import guia11.entidades.E3_Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un 
número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas).
Esta clase debe contener un método toString() que retorne el número de carta y el palo. 
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
    
Las operaciones que podrá realizar la baraja son:
• barajar(): 
    cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): 
    devuelve la siguiente carta que está en la baraja, cuando no haya más o
    se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): 
    indica el número de cartas que aún se puede repartir.
• darCartas(): 
    dado un número de cartas que nos pidan, le devolveremos ese número de
    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    debemos indicárselo al usuario.
• cartasMonton(): 
    mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    indicárselo al usuario
• mostrarBaraja(): 
    muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    luego se llama al método, este no mostrara esa primera carta.
 */
public class E3_BarajaService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public E3_Baraja crearBaraja() {
        ArrayList<E3_Carta> b = new ArrayList();

        String[] tipos = {"Espada", "Copa", "Oro", "Basto"};
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String tipo : tipos) {
            for (Integer num : nums) {
                b.add(new E3_Carta(tipo, num));
            }
        }

        return new E3_Baraja(b);
    }

    public void barajar(E3_Baraja b) {
        Collections.shuffle(b.getCartasDisponibles());
    }

    public E3_Carta siguienteCarta(E3_Baraja b) {
        if (b.getCartasDisponibles().isEmpty()) {
            System.out.println("No hay cartas");
            return null;
        }

        E3_Carta carta = b.getCartasDisponibles().get(0);
        System.out.println(carta);
        
        b.getCartasDisponibles().remove(0);
        b.getCartasMonton().add(carta);

        return carta;
    }

    public void cartasDisponibles(E3_Baraja b) {
        System.out.println("Numero de cartas disponibles: " + b.getCartasDisponibles().size());
    }

    public boolean darCartas(E3_Baraja b) {
        System.out.println("Cantidad a pedir:");
        int cant = leer.nextInt();

        if (b.getCartasDisponibles().size() < cant) {
            System.out.println("No hay tantas cartas.");
            return false;
        }

        for (int i = 0; i < cant; i++) {
            siguienteCarta(b);
        }

        return true;
    }

    public boolean mostrarMonton(E3_Baraja b) {
        if (b.getCartasMonton().isEmpty()) {
            System.out.println("No hay cartas.");
            return false;
        }

        for (E3_Carta cartaMonton : b.getCartasMonton()) {
            System.out.println(cartaMonton);
        }

        return true;
    }

    public boolean mostrarBaraja(E3_Baraja b) {
        if (b.getCartasDisponibles().isEmpty()) {
            System.out.println("No hay cartas.");
            return false;
        }

        for (E3_Carta cartaDisponible : b.getCartasDisponibles()) {
            System.out.println(cartaDisponible);
        }

        return true;
    }

    private int subMenu() {
        System.out.println("Quiere continuar? s/n");

        if (leer.next().equalsIgnoreCase("s")) {
            return 0;
        }

        return 7;
    }

    public void juego() {
        E3_Baraja b = crearBaraja();

        int opc;

        do {
            System.out.println("*** MENU CARTAS ***"
                    + "\n1- Barajar."
                    + "\n2- Pedir carta."
                    + "\n3- Cantidad cartas disponibles."
                    + "\n4- Pedir cartas."
                    + "\n5- Mostrar cartas usadas."
                    + "\n6- Mostrar cartas disponibles."
                    + "\n7- Salir."
                    + "\nElija una opcion...");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    barajar(b);
                    
                    subMenu();
                    break;
                case 2:
                    siguienteCarta(b);
                    
                    subMenu();
                    break;
                case 3:
                    cartasDisponibles(b);
                    
                    subMenu();
                    break;
                case 4:
                    darCartas(b);
                    
                    subMenu();
                    break;
                case 5:
                    mostrarMonton(b);
                    
                    subMenu();
                    break;
                case 6:
                    mostrarBaraja(b);
                    
                    subMenu();
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestra app.");
                    break;    
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (opc != 7);

    }
}
