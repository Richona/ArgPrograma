package guia11.entidades;

/*
*** Clase Revolver de agua: ***
esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
*/
public class E2_Revolver {
    private int posActual, posAgua;

    public E2_Revolver() {
    }

    public E2_Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "E2_Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
}
