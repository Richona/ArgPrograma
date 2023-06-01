package guia10.entidades;

import java.util.Comparator;

/*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/
public class E1_Perro {
    private String raza;

    public E1_Perro() {
    }

    public E1_Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public static Comparator<E1_Perro> ordenarRazaAsc = new Comparator<E1_Perro>() {
        @Override
        public int compare(E1_Perro p1, E1_Perro p2) {
            return p1.getRaza().compareTo(p2.getRaza());
        }
    };
    
    public static Comparator<E1_Perro> ordenarRazaDesc = new Comparator<E1_Perro>() {
        @Override
        public int compare(E1_Perro p1, E1_Perro p2) {
            return p2.getRaza().compareTo(p1.getRaza());
        }
    };

    @Override
    public String toString() {
        return "E1_Perro{" + "raza=" + raza + '}';
    }
    
    
    
}
