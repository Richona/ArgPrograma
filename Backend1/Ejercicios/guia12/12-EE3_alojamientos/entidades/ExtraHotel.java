package entidades;

import java.util.Random;
import java.util.Scanner;

/*

*/
public abstract class ExtraHotel extends Alojamiento{
        private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        private final Random rand = new Random();
    
    protected boolean privado;
    protected int cantMetrosCuadrado;

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, int cantMetrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetrosCuadrado = cantMetrosCuadrado;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getCantMetrosCuadrado() {
        return cantMetrosCuadrado;
    }

    public void setCantMetrosCuadrado(int cantMetrosCuadrado) {
        this.cantMetrosCuadrado = cantMetrosCuadrado;
    }

    @Override
    public String toString() {
        return super.toString() + "ExtraHotel{" + "privado=" + privado + ", cantMetrosCuadrado=" + cantMetrosCuadrado + '}';
    }
    
    public void crearExtraHotelAuto(){
        super.crearAlomientoAuto();
        
        privado = rand.nextBoolean();
        cantMetrosCuadrado = rand.nextInt(2000)+1;
    }
}
