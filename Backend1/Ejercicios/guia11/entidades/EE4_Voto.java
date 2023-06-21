package guia11.entidades;

import java.util.HashSet;

/*

*/
public class EE4_Voto {
    private EE4_Alumno alumno;
    private HashSet<EE4_Alumno> listaVotos;

    public EE4_Voto() {
        this.alumno = new EE4_Alumno();
        this.listaVotos = new HashSet();
    }

    public EE4_Voto(EE4_Alumno alumno, HashSet<EE4_Alumno> listaVotos) {
        this.alumno = alumno;
        this.listaVotos = listaVotos;
    }

    public EE4_Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(EE4_Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<EE4_Alumno> getListaVotos() {
        return listaVotos;
    }

    public void setListaVotos(HashSet<EE4_Alumno> listaVotos) {
        this.listaVotos = listaVotos;
    }

    @Override
    public String toString() {

        return "votante=[" + alumno + "], listaVotos=" + listaVotos;
    }
    
    
    
}