package entidades;

import java.util.Random;
import java.util.Scanner;

/*
Se debe crear también una subclase llamada Televisor con los 
    siguientes atributos: resolución (en pulgadas) y sintonizador TDT 
    (booleano), además de los atributos heredados.
    
*** Los constructores que se implementarán serán: ***
• Un constructor vacío.
    
• Un constructor con la resolución, sintonizador TDT y el resto de los 
    atributos heredados. Recuerda que debes llamar al constructor de la 
    clase padre.
    
*** Los métodos que se implementara serán: ***
• Método get y set de los atributos resolución y sintonizador TDT.
    
• Método crearTelevisor(): 
    este método llama a crearElectrodomestico() de la clase padre, lo 
    utilizamos para llenar los atributos heredados del padre y después 
    llenamos los atributos del televisor.
    
• Método precioFinal(): 
    este método será heredado y se le sumará la siguiente funcionalidad. 
    Si el televisor tiene una resolución mayor de 40 pulgadas, se 
    incrementará el precio un 30% y si tiene un sintonizador TDT 
    incorporado, aumentará $500. Recuerda que las condiciones que hemos 
    visto en la clase Electrodomestico también deben afectar al precio.
*/
public final class Televisor extends Electrodomestico{
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoElectrico, int peso) {
        super(precio, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        System.out.println("*** Televisor ***");
        super.crearElectrodomestico();
        
        System.out.println("Resolucion:");
        this.resolucion = leer.nextInt();
        
        System.out.println("Tiene sincronizador TDT? S/N");
        this.sintonizadorTDT = leer.next().equalsIgnoreCase("s");
        
        this.precioFinal();
    }
    
    public void crearTelevisorAuto(){
        super.crearElectrodomesticoAuto();
        
        this.resolucion = rand.nextInt(100)+1;

        this.sintonizadorTDT = rand.nextBoolean();
        
        this.precioFinal();
    }
    
    /*
    • Método precioFinal(): 
    este método será heredado y se le sumará la siguiente funcionalidad. 
    Si el televisor tiene una resolución mayor de 40 pulgadas, se 
    incrementará el precio un 30% y si tiene un sintonizador TDT 
    incorporado, aumentará $500. Recuerda que las condiciones que hemos 
    visto en la clase Electrodomestico también deben afectar al precio.
    */
    
    public void precioFinal(){
        super.precioFinal();
        
        if (this.resolucion > 40) {
            this.precio *= 1.3;
        }
        
        if (sintonizadorTDT) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "resoluci\u00f3n=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + super.toString();
    }
    
    
}
