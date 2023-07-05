package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public final class Residencia extends ExtraHotel {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private int cantHabitaciones;
    private boolean descuentoGremio, campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privado, int cantMetrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetrosCuadrado, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", descuentoGremio=" + descuentoGremio + ", campoDeportivo=" + campoDeportivo + '}';
    }

    public void crearResidenciaAuto() {
        super.crearExtraHotelAuto();

        cantHabitaciones = rand.nextInt(100) + 1;
        descuentoGremio = rand.nextBoolean();
        campoDeportivo = rand.nextBoolean();
    }

    public void mostrarResidencia() {
        System.out.println("*** Residencia *** \n"
                + "Nombre: " + nombre + "\n"
                + "Direccion: " + direccion + "\n"
                + "Localidad: " + localidad + "\n"
                + "Gerente: " + gerente + "\n"
                + "Privado: " + (privado ? "Si" : "No") + "\n"
                + "Cantidad de metros cuadrados: " + cantMetrosCuadrado + "\n"
                + "Cantidad habitaciones: " + cantHabitaciones + "\n"
                + "Descuento para gremios: " + (descuentoGremio ? "Si" : "No") + "\n"
                + "Campo deportivo: " + (campoDeportivo ? "Si" : "No") + "\n");
    }
}
