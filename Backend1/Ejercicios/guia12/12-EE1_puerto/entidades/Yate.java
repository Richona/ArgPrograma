package entidades;

import java.util.Random;
import java.util.Scanner;

/*

*/
public final class Yate extends Barco{
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();
    
    private double potenciaCV;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(double potenciaCV, int numCamarotes, String matricula, int eslora, int anioFabricacion, double precio) {
        super(matricula, eslora, anioFabricacion, precio);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "potenciaCV=" + potenciaCV + ", numCamarotes=" + numCamarotes + ", " + super.toString();
    }
    
    
    
    public void crearYate() {
        super.crearBarco();

        System.out.println("Potencia CV:");
        this.potenciaCV = leer.nextDouble();
        
        System.out.println("Cantidad de camarotes:");
        this.numCamarotes = leer.nextInt();
    }
    
    public Yate crearYateAuto(){
        super.crearBarcoAuto();

        this.potenciaCV = rand.nextInt(20)+1;
        
        this.numCamarotes = rand.nextInt(50)+1;
        
        return new Yate(potenciaCV, numCamarotes, matricula, eslora, anioFabricacion, (potenciaCV + numCamarotes));
    }
    
}
