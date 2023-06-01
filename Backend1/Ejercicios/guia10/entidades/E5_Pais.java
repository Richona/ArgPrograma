package guia10.entidades;

import java.util.Comparator;
import java.util.Objects;

/*

*/
public class E5_Pais {
    private String nombre;
    
    public E5_Pais() {
    }
    
    public E5_Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final E5_Pais other = (E5_Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    public static Comparator<E5_Pais> ordenarPorNombrePais = (E5_Pais c1, E5_Pais c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre());
    
    @Override
    public String toString() {
        return "E5_Pais{" + "nombre=" + nombre + '}';
    }
    
    
    
}
