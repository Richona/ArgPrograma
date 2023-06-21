package guia11.entidades;

import java.util.ArrayList;

/*

*/
public class E3_Baraja {
    private ArrayList<E3_Carta> cartasDisponibles, cartasMonton;

    public E3_Baraja() {
        this.cartasDisponibles = new ArrayList();
        this.cartasMonton = new ArrayList();
    }

    public E3_Baraja(ArrayList<E3_Carta> cartasDisponibles) {
        this.cartasDisponibles = cartasDisponibles;
        this.cartasMonton = new ArrayList();
    }


    public ArrayList<E3_Carta> getCartasDisponibles() {
        return cartasDisponibles;
}

    public void setCartasDisponibles(ArrayList<E3_Carta> cartasDisponibles) {
        this.cartasDisponibles = cartasDisponibles;
    }

    public ArrayList<E3_Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<E3_Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }

    @Override
    public String toString() {
        return "cartasDisponibles=" + cartasDisponibles + " \ncartasMonton=" + cartasMonton;
    }
    
    
}
