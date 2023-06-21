package guia11.entidades;

import java.util.ArrayList;

/*

*/
public class EE1_Refugio {
    private ArrayList<EE1_Perro> perros;

    public EE1_Refugio() {
        this.perros = new ArrayList();
    }

    public EE1_Refugio(ArrayList<EE1_Perro> perros) {
        this.perros = perros;
    }

    public ArrayList<EE1_Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<EE1_Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return perros + "";
    }
    
    
}
