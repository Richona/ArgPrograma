package entidades;

import java.util.Random;
import java.util.Scanner;

/*

*/
public final class Motor extends Barco{
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();
    
    private double potenciaCV;

    public Motor() {
    }

    public Motor(double potenciaCV, String matricula, int eslora, int anioFabricacion, double precio) {
        super(matricula, eslora, anioFabricacion, precio);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "Motor{" + "potenciaCV=" + potenciaCV + ", " + super.toString();
    }
    
    
    
    public void crearMotor() {
        super.crearBarco();

        System.out.println("Potencia CV:");
        this.potenciaCV = leer.nextDouble();
    }
    
    public Motor crearMotorAuto(){
        super.crearBarcoAuto();

        this.potenciaCV = rand.nextInt(10)+1;
        
        return new Motor(potenciaCV, matricula, eslora, anioFabricacion, potenciaCV);
    }
    
    
}
