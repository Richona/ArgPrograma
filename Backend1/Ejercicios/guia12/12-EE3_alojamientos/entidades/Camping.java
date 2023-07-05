package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public final class Camping extends ExtraHotel {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private int cantMaxCarpas, cantBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int cantMaxCarpas, int cantBanios, boolean restaurante, boolean privado, int cantMetrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetrosCuadrado, nombre, direccion, localidad, gerente);
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(int cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "Camping{" + "cantMaxCarpas=" + cantMaxCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }

    public void crearCampingAuto() {
        super.crearExtraHotelAuto();

        cantMaxCarpas = rand.nextInt(100) + 1;
        cantBanios = rand.nextInt(10) + 1;
        restaurante = rand.nextBoolean();
    }

    public void mostrarCamping() {
        System.out.println("*** CAMPING *** \n"
                + "Nombre: " + nombre + "\n"
                + "Direccion: " + direccion + "\n"
                + "Localidad: " + localidad + "\n"
                + "Gerente: " + gerente + "\n"
                + "Privado: " + (privado ? "Si" : "No") + "\n"
                + "Cantidad de metros cuadrados: " + cantMetrosCuadrado + "\n"
                + "Cantidad maxima de carpas: " + cantMaxCarpas + "\n"
                + "Cantidad de baños: " + cantBanios + "\n"
                + "Restaurante: " + (restaurante ? "Si" : "No") + "\n");
    }

}
