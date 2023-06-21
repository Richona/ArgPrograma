package guia11.entidades;

import java.util.ArrayList;

/*

*/
public class EE1_Grupo {
    private ArrayList<EE1_Persona> personas;

    public EE1_Grupo() {
        this.personas = new ArrayList();
    }

    public EE1_Grupo(ArrayList<EE1_Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<EE1_Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<EE1_Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "EE1_Grupo{" + "personas=" + personas + '}';
    }
    
}
