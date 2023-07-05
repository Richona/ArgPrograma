package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public class Barco {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    protected String matricula;
    protected int eslora, anioFabricacion;
    protected double precio;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion, double precio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "matricula= " + matricula + ", eslora= " + eslora + ", anioFabricacion= " + anioFabricacion + ", precio= " + precio +'}';
    }     

    protected void crearBarco() {
        System.out.println("Matricula:");
        this.matricula = leer.next();
        
        System.out.println("Eslora:");
        this.eslora = leer.nextInt();
        
        System.out.println("Año de fabricación");
        this.anioFabricacion = leer.nextInt();
    }
    
    protected void crearBarcoAuto() {
        String[] matriculas = {"ABC 321", "AB 432", "ASD 1234", "AV 2312", "AH 342", "YT 342"};
        this.matricula = matriculas[rand.nextInt(matriculas.length)];
        
        this.eslora = rand.nextInt(10)+1;

        this.anioFabricacion = rand.nextInt(2023)+1;
    }
}
