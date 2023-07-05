package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public final class Velero extends Barco {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, int eslora, int anioFabricacion, double precio) {
        super(matricula, eslora, anioFabricacion, precio);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles= " + numMastiles + ", " + super.toString();
    }

    public void crearVelero() {
        super.crearBarco();

        System.out.println("Cantidad de mastiles:");
        this.numMastiles = leer.nextInt();
    }

    public Velero crearVeleroAuto() {
        super.crearBarcoAuto();

        this.numMastiles = rand.nextInt(4) + 1;
        
        return new Velero(numMastiles, matricula, eslora, anioFabricacion, numMastiles);
    }

}
