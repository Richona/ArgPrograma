package entidades;

import java.util.Random;
import java.util.Scanner;

/*

 */
public final class EdificioDeOficinas extends Edificio {
        private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        private final Random rand = new Random();

    private int cantOficinas, cantPersonasOficina, cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantOficinas, int cantPersonasOficina, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonasOficina = cantPersonasOficina;
        this.cantPisos = cantPisos;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonasOficina() {
        return cantPersonasOficina;
    }

    public void setCantPersonasOficina(int cantPersonasOficina) {
        this.cantPersonasOficina = cantPersonasOficina;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "cantOficinas=" + cantOficinas + ", cantPersonasOficina=" + cantPersonasOficina + ", cantPisos=" + cantPisos + super.toString() + '}';
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
     */
    
    public void cantPersonas(){
        System.out.println("Cuantas personas entran en cada oficina?");
        cantPersonasOficina = leer.nextInt();
        
        System.out.println("Cuantas oficinas?");
        cantOficinas = leer.nextInt();

        cantPisos = cantOficinas;
        
        System.out.println("Cantidad de personas por piso/oficina: " + cantPersonasOficina);
        System.out.println("Cantidad de personas en todo el edificio: " + (cantPersonasOficina * cantPisos));
    }
    
    public void cantPersonasAuto(){
        
        cantPersonasOficina = rand.nextInt(10)+1;
        System.out.println("Cuantas personas entran en cada oficina: " + cantPersonasOficina);
        
        
        cantOficinas = rand.nextInt(189)+1;
        System.out.println("Cuantas oficinas: " + cantOficinas);

        cantPisos = cantOficinas;
        
        System.out.println("Cantidad de personas por piso/oficina: " + cantPersonasOficina);
        System.out.println("Cantidad de personas en todo el edificio: " + (cantPersonasOficina * cantPisos));
    }
    
}
