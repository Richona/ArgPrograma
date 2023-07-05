package entidades;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public abstract class Hotel extends Alojamiento {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    protected int cantHabitaciones, cantCamas, cantPisos;
    protected Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int cantCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public static Comparator<Hotel> ordenarPorPrecio = (Hotel c1, Hotel c2) -> c2.getPrecioHabitacion().compareTo(c1.getPrecioHabitacion());

    @Override
    public String toString() {
        return super.toString() + "Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", cantCamas=" + cantCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

    public void crearHotelAuto() {
        super.crearAlomientoAuto();

        cantHabitaciones = rand.nextInt(10) + 1;
        cantCamas = rand.nextInt(5) + 1;
        cantPisos = rand.nextInt(20) + 1;
    }

    /*
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
     */
    
    public void calcularPrecio() {
        this.precioHabitacion = Double.valueOf(50 + this.cantCamas * this.cantHabitaciones);
    }

}
