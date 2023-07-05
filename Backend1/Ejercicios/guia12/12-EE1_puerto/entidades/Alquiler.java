package entidades;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Alquiler {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private String nombre;
    private int dni, posAmarre;
    private LocalDate fechaAlquiler, fechaDevolucion;
    private Barco barco;

    public Alquiler() {
        this.barco = new Barco();
    }

    public Alquiler(String nombre, int dni, int posAmarre, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.posAmarre = posAmarre;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void tipoBarco() {
        int opc;
        Velero v = new Velero();
        Motor m = new Motor();
        Yate y = new Yate();

        System.out.println("Que tipo de barco tienes?\n"
                + "1- Velero.\n"
                + "              |    |    |                 \n"
                + "             )_)  )_)  )_)              \n"
                + "            )___))___))___)\\            \n"
                + "           )____)____)_____)\\\\\n"
                + "         _____|____|____|____\\\\\\__\n"
                + "---------\\                   /---------\n"
                + "  ^^^^^ ^^^^^^^^^^^^^^^^^^^^^\n"
                + "    ^^^^      ^^^^     ^^^    ^^\n"
                + "         ^^^^      ^^^ \n"
                + "2- Barco a motor.\n"
                + "                          (_)\n"
                + "           --\"\"-------   0/      W\n"
                + " .___...../ /__| |__\\ \\_/H__,      W\n"
                + "  \\                        /\n"
                + "#####^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~\\O/~~\\Q/~^~^~rr\n"
                + "3- Yate de lujo.\n"
                + "                __/___            \n"
                + "          _____/______|           \n"
                + "  _______/_____\\_______\\_____     \n"
                + "  \\              < < <       |    \n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                barco = v.crearVeleroAuto();
                break;
            case 2:
                barco = m.crearMotorAuto();
                break;
            case 3:
                barco = y.crearYateAuto();
                break;
        }

    }

    public void crearAlquiler() {
        System.out.println("*** ALQUILER ***");

        nombre = "Horacio";

        dni = 43;

        posAmarre = rand.nextInt(100) + 1;
        System.out.println("Posicion del amarre: " + posAmarre);

        //System.out.println("Ingresar AAAA-MM-DD de alquiler: Ej: 2023-06-29");
        fechaAlquiler = LocalDate.parse("2023-06-29");

        //System.out.println("Ingresar AAAA-MM-DD de devolucion: Ej: 2023-07-06");
        fechaDevolucion = LocalDate.parse("2023-07-06");

        tipoBarco();

    }

    /*
Un alquiler se calcula multiplicando el número de días de 
    ocupación (calculado con la fecha de alquiler y devolución), por 
    un valor módulo de cada barco (obtenido simplemente multiplicando 
    por 10 los metros de eslora).
    
        En los barcos de tipo especial el módulo de cada barco se 
    calcula sacando el módulo normal y sumándole el atributo particular 
    de cada barco. En los veleros se suma el número de mástiles, en los 
    barcos a motor se le suma la potencia en CV y en los yates se suma 
    la potencia en CV y el número de camarotes.
    
        Utilizando la herencia de forma apropiada, deberemos programar 
    en Java, las clases y los métodos necesarios que permitan al usuario 
    elegir el barco que quiera alquilar y mostrarle el precio final de 
    su alquiler.
     */
    public void calcularAlquiler() {
        double precio;

        System.out.println("Precio del barco: " + barco.precio);
        precio = barco.precio;

        Duration dd = Duration.between(fechaAlquiler.atStartOfDay(), fechaDevolucion.atStartOfDay());
        System.out.println("Dias transcurrido: " + dd.toDays());

        precio += dd.toDays() * (barco.eslora * 10);
        System.out.println("Dimension eslora: " + (barco.eslora * 10));

        System.out.println("Precio final: " + precio);

    }

    public void clubNaval() {
        do {
            crearAlquiler();

            calcularAlquiler();
            
            System.out.println("Quieres agregar otro barco? s/n");
        } while (leer.next().equalsIgnoreCase("s"));

    }
}
