package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public class Hotel4E extends Hotel {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    protected boolean gimnasioA;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4E() {
    }

    public Hotel4E(boolean gimnasioA, int capacidadRestaurante, String nombreRestaurante, int cantHabitaciones, int cantCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasioA = gimnasioA;
        this.capacidadRestaurante = capacidadRestaurante;
        this.nombreRestaurante = nombreRestaurante;
    }

    public boolean isGimnasioA() {
        return gimnasioA;
    }

    public void setGimnasioA(boolean gimnasioA) {
        this.gimnasioA = gimnasioA;
    }

    public int isCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4E{" + "gimnasioA=" + gimnasioA + ", capacidadRestaurante=" + capacidadRestaurante + ", nombreRestaurante=" + nombreRestaurante + '}';
    }

    public void crearHotel4EAuto() {
        super.crearHotelAuto();

        gimnasioA = rand.nextBoolean();
        capacidadRestaurante = rand.nextInt(50) + 1;

        String[] nombres = {"Contrato", "Bucky", "BGR", "Distrito", "Lo del nacho"};
        nombreRestaurante = nombres[rand.nextInt(nombres.length)] + " " + rand.nextInt(100);
    }

    public void mostrarHotel4EAuto() {
        System.out.println("*** HOTEL 4 ESTRELLES *** \n"
                + "Nombre: " + nombre + "\n"
                + "Direccion: " + direccion + "\n"
                + "Localidad: " + localidad + "\n"
                + "Gerente: " + gerente + "\n"
                + "Cantidad de habitaciones: " + cantHabitaciones + "\n"
                + "Cantidad de camas: " + cantCamas + "\n"
                + "Cantidad de pisos: " + cantPisos + "\n"
                + "Nombre del restaurante: " + nombreRestaurante + "\n"
                + "Capacidad del restaurante: " + capacidadRestaurante + "\n"
                + "Gimnasio: " + (gimnasioA ? "Si" : "No") + "\n"
                + "Precio de la habitacion: " + precioHabitacion + "\n");
    }

    /*
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
    
    Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
     */
    @Override
    public void calcularPrecio() {
        super.calcularPrecio();

        precioHabitacion += gimnasioA ? 50 : 30;

        if (capacidadRestaurante < 30) {
            precioHabitacion += 10;
        }

        if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            precioHabitacion += 30;
        }

        if (capacidadRestaurante > 50) {
            precioHabitacion += 50;
        }
    }
}
