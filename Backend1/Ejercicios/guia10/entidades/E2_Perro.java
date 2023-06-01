package guia10.entidades;

import java.util.Comparator;



/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
public class E2_Perro {
    private String raza;

    public E2_Perro() {
    }

    public E2_Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public static Comparator<E2_Perro> compararRazaAsc = new Comparator<E2_Perro>() {
        @Override
        public int compare(E2_Perro p1, E2_Perro p2) {
            return p1.getRaza().compareTo(p2.getRaza());
        }
    };
    
    public static Comparator<E2_Perro> compararRazaDesc = new Comparator<E2_Perro>() {
        @Override
        public int compare(E2_Perro p1, E2_Perro p2) {
            return p2.getRaza().compareTo(p1.getRaza());
        }
    };

    @Override
    public String toString() {
        return "E1_Perro{" + "raza=" + raza + '}';
    }
    
}
