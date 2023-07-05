package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public final class Hotel5E extends Hotel4E {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private int cantSalonesConfe, cantSuites, cantLimosinas;

    public Hotel5E() {
    }

    public Hotel5E(int cantSalonesConfe, int cantSuites, int cantLimosinas, boolean gimnasioA, int capacidadRestaurante, String nombreRestaurante, int cantHabitaciones, int cantCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasioA, capacidadRestaurante, nombreRestaurante, cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonesConfe = cantSalonesConfe;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesConfe() {
        return cantSalonesConfe;
    }

    public void setCantSalonesConfe(int cantSalonesConfe) {
        this.cantSalonesConfe = cantSalonesConfe;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel5E{" + "cantSalonesConfe=" + cantSalonesConfe + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

    public void crearHotel5EAuto() {
        super.crearHotel4EAuto();

        cantSalonesConfe = rand.nextInt(5) + 1;
        cantSuites = rand.nextInt(10) + 1;
        cantLimosinas = rand.nextInt(20) + 1;
    }

    public void mostrarHotel5EAuto() {
        System.out.println("*** HOTEL 5 ESTRELLES *** \n"
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
                + "Cantidad de salones: " + cantSalonesConfe + "\n"
                + "Cantidad de suites: " + cantSuites + "\n"
                + "Cantidad de limosinas: " + cantLimosinas + "\n"
                + "Precio de la habitacion: " + precioHabitacion + "\n");
    }

    /*
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
    
    Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
     */
    @Override
    public void calcularPrecio() {
        super.calcularPrecio();

        this.precioHabitacion += 15 * cantLimosinas;
    }

}
