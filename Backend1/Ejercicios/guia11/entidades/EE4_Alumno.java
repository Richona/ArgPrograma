package guia11.entidades;

import java.util.Comparator;
import static java.util.Comparator.comparingDouble;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

/*

*/
public class EE4_Alumno {
    private String nombreCompleto;
    private Integer dni;
    private Integer cantVotos;

    public EE4_Alumno() {
        this.cantVotos = 0;
    }

    public EE4_Alumno(String nombreCompleto, Integer dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }
    
    
     public static Comparator<EE4_Alumno> ordenarCantVotosDesc = (EE4_Alumno c1, EE4_Alumno c2) -> c2.getCantVotos().compareTo(c1.getCantVotos());
   

    @Override
    public String toString() {
        return "nombreCompleto= " + nombreCompleto + ", dni= " + dni + ", cantVotos= " + cantVotos + '.';
    }
    
    
    
}
