package entidades;

import constantes.Const;
import java.util.Random;
import java.util.Scanner;

/*

*/
public class ObjetosRadar {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        private final Random rand = new Random();
    
    private int resistencia, coordenadaX, coordenadaY, coordenadaZ;
    private boolean hostil;
    private double distancia;

    public ObjetosRadar() {
    }

    public ObjetosRadar(int resistencia, int coordenadaX, int coordenadaY, int coordenadaZ, boolean hostil, double distancia) {
        this.resistencia = resistencia;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
        this.hostil = hostil;
        this.distancia = distancia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaZ() {
        return coordenadaZ;
    }

    public void setCoordenadaZ(int coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    

    @Override
    public String toString() {
        return "Objetos{" + "resistencia=" + resistencia + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", coordenadaZ=" + coordenadaZ + ", hostil=" + hostil + ", distancia= " + distancia + '}';
    }

    public void crearObjetoAuto(){
        resistencia = rand.nextInt(Const.RESISTENCIAMAX)+1;
        coordenadaX = rand.nextInt(Const.COORDENADAMAX);
        coordenadaY = rand.nextInt(Const.COORDENADAMAX);
        coordenadaZ = rand.nextInt(Const.COORDENADAMAX);
        hostil = rand.nextBoolean();
        distancia = Math.sqrt(0.0 + Math.pow(coordenadaX - coordenadaY - coordenadaZ, 2));
    }
    
    public void mostrarObjeto(int indice){
        System.out.println("* OBJETO NUMERO " + indice + " *\n"
                    + "Hostil: " + (hostil ? "SI" : "NO") + ".\n"
                    + "Resistencia: " + resistencia + ".\n"
                    + "Distancia: " + distancia + ".\n");
    }
}
