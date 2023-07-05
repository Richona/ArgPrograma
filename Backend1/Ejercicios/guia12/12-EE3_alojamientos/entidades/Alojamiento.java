package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public abstract class Alojamiento {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    protected String nombre, direccion, localidad, gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }

    public void crearAlomientoAuto() {
        String[] nombres = {"Las acasias", "Tortorichi", "Jonson", "La fragua", "Martineli"};
        nombre = nombres[rand.nextInt(nombres.length)] + rand.nextInt(100);

        String[] direcciones = {"Olascoaga", "Mendoza", "Entre rios", "Roca", "Independencia"};
        direccion = direcciones[rand.nextInt(direcciones.length)] + " " + rand.nextInt(1000);

        String[] localidades = {"Alumine", "Neuquen", "Plottier", "Plaza Huincul", "San Martin de los Andes"};
        localidad = localidades[rand.nextInt(localidades.length)];

        String[] gerentes = {"Richard", "Marcelo", "Agus", "Tiger", "Daniel", "Nadia", "Lucas", "Dominic", "Pizza", "Liliana", "Jesica", "Marcela", "Miguel", "Messi", "Dibu", "Luli", "Biza", "Scaloni", "Osito", "Bagucha", "Priscila", "Vezir", "Night", "Catriel", "Pedro", "Ian", "Aldana", "David", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1a", "2b", "3c", "4d", "5e", "6f", "7g", "8h", "9i", "10j", "11k", "12l", "13m", "14n"};
        gerente = gerentes[rand.nextInt(gerentes.length)];
    }
}
