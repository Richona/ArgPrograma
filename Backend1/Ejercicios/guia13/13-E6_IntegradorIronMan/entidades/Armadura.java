package entidades;

import constantes.Const;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*

 */
public class Armadura {

    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private String colorPrimario, colorSecundario;
    private boolean propulsorIzq, propulsorDer, repulsorIzq, repulsorDer, consola, sintetizador;
    private int resistencia, salud;
    private double bateria;
    private ArrayList<ObjetosRadar> radar;

    public Armadura() {
        this.radar = new ArrayList();
        propulsorIzq = true;
        propulsorDer = true;
        repulsorIzq = true;
        repulsorDer = true;
        consola = true;
        sintetizador = true;
        salud = Const.SALUDMAX;
        bateria = Const.BATERIAMAX;
    }

    public Armadura(String colorPrimario, String colorSecundario, boolean propulsorIzq, boolean propulsorDer, boolean repulsorIzq, boolean repulsorDer, boolean consola, boolean sintetizador, int resistencia, int salud, double bateria, ArrayList<ObjetosRadar> radar) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.propulsorIzq = propulsorIzq;
        this.propulsorDer = propulsorDer;
        this.repulsorIzq = repulsorIzq;
        this.repulsorDer = repulsorDer;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.resistencia = resistencia;
        this.salud = salud;
        this.bateria = bateria;
        this.radar = radar;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public boolean isPropulsorIzq() {
        return propulsorIzq;
    }

    public void setPropulsorIzq(boolean propulsorIzq) {
        this.propulsorIzq = propulsorIzq;
    }

    public boolean isPropulsorDer() {
        return propulsorDer;
    }

    public void setPropulsorDer(boolean propulsorDer) {
        this.propulsorDer = propulsorDer;
    }

    public boolean isRepulsorIzq() {
        return repulsorIzq;
    }

    public void setRepulsorIzq(boolean repulsorIzq) {
        this.repulsorIzq = repulsorIzq;
    }

    public boolean isRepulsorDer() {
        return repulsorDer;
    }

    public void setRepulsorDer(boolean repulsorDer) {
        this.repulsorDer = repulsorDer;
    }

    public boolean isConsola() {
        return consola;
    }

    public void setConsola(boolean consola) {
        this.consola = consola;
    }

    public boolean isSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(boolean sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public ArrayList<ObjetosRadar> getRadar() {
        return radar;
    }

    public void setRadar(ArrayList<ObjetosRadar> radar) {
        this.radar = radar;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", propulsorIzq=" + propulsorIzq + ", propulsorDer=" + propulsorDer + ", repulsorIzq=" + repulsorIzq + ", repulsorDer=" + repulsorDer + ", consola=" + consola + ", sintetizador=" + sintetizador + ", resistencia=" + resistencia + ", salud=" + salud + ", bateria=" + bateria + ", radar=" + radar + '}';
    }

    public void crearArmaduraAuto() {
        colorPrimario = Const.COLORES[rand.nextInt(Const.COLORES.length)];

        do {
            colorSecundario = Const.COLORES[rand.nextInt(Const.COLORES.length)];
        } while (colorPrimario.equalsIgnoreCase(colorSecundario));

        resistencia = rand.nextInt(Const.RESISTENCIAMAX);
    }

    /*
    • Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
establecida como consumo en la bota por el tiempo en el que se camine.
     */
    public double caminar(int segundos) {
        if (probabilidad(3)) {
            propulsorDer = rand.nextInt(3) + 1 != 1;
            propulsorIzq = false;
        }
        
        bateria -= Const.CONSUMOMINIMO * segundos;
        
        if (!propulsorIzq || !propulsorDer) {
            return 0;
        }

        return Const.CONSUMOMINIMO * segundos;
    }

    /*
    • Al correr la armadura hará un uso normal de las botas y se consumirá el doble de 
la energía establecida como consumo en la bota por el tiempo en el que se corra.
     */
    public double correr(int segundos) {
        return caminar(segundos) + caminar(segundos);
    }

    /*
    • Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple 
de la energía por el tiempo que dure la propulsión.
     */
    public double propulsarse(int segundos) {
        return correr(segundos) + caminar(segundos);
    }

    /*
    • Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso 
normal consumiendo el triple de la energía establecida para las botas y el doble 
para los guantes.
     */
    public double volar(int segundos) {
        if (probabilidad(3)) {
            repulsorDer = rand.nextInt(3) + 1 != 1;
            repulsorIzq = false;
        }

        if (!repulsorIzq || !repulsorDer) {
            return 0;
        }

        return propulsarse(segundos) + correr(segundos);
    }

    /*
    • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del 
disparo.
     */
    public double disparar(String accion, int segundos) {
        double resultado = 0;
        
        if (probabilidad(3)) {
            repulsorDer = rand.nextInt(3) + 1 != 1;
            repulsorIzq = false;
        }
        
        if (!repulsorIzq || !repulsorDer) {
            return 0;
        }

        switch (accion) {
            case "caminar":
                resultado = caminar(segundos);
                break;
            case "correr":
                resultado = correr(segundos);
                break;
            case "propulsarse":
                resultado = propulsarse(segundos);
                break;
            case "volar":
                resultado = volar(segundos);
                break;
        }
        
        bateria -= resultado * 3;
        bateria += resultado;
        
        return resultado * 3;
    }

    /*
    • Cada vez que se escribe en la consola o se habla a través del sintetizador se 
consume lo establecido en estos dispositivos. Solo se usa en nivel básico.
     */
    public double escribir() {
        if (probabilidad(3)) {
            consola = rand.nextInt(3) + 1 != 1;
            sintetizador = false;
        }

        if (!consola || !sintetizador) {
            return 0;
        }

        bateria -= Const.CONSUMOMINIMO;
        return Const.CONSUMOMINIMO;
    }

    public boolean probabilidad(int limite) {
        int numAlea = rand.nextInt(10) + 1;
        return numAlea >= 1 && numAlea <= limite;
    }
}
