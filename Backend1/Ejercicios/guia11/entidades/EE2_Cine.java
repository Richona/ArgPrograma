package guia11.entidades;

import guia11.constantes.EE2_Constantes;
import java.util.ArrayList;
import java.util.Arrays;

/*

*/
public class EE2_Cine {
    private EE2_Pelicula pelicula;
    private EE2_Asiento[][] sala;
    private int asientosDisponibles;
    private double precio;
    private ArrayList<EE2_Espectador> espectadores;

    public EE2_Cine() {
        this.sala = new EE2_Asiento [EE2_Constantes.FILAS][EE2_Constantes.COLUMNAS];
        this.espectadores = new ArrayList();
        this.asientosDisponibles = EE2_Constantes.ASIENTOS;
    }

    public EE2_Cine(EE2_Pelicula pelicula, EE2_Asiento[][] sala, double precio, ArrayList<EE2_Espectador> espectadores) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.espectadores = espectadores;
        this.asientosDisponibles = EE2_Constantes.ASIENTOS;
    }

    public EE2_Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(EE2_Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public EE2_Asiento[][] getSala() {
        return sala;
    }

    public void setSala(EE2_Asiento[][] sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<EE2_Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<EE2_Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    @Override
    public String toString() {
        return "EE2_Cine{" + "pelicula=" + pelicula + ", sala=" + Arrays.toString(sala) + ", asientosDisponibles=" + asientosDisponibles + ", precio=" + precio + ", espectadores=" + espectadores + '}';
    }

    
}
