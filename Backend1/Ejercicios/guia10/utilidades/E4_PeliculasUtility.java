package guia10.utilidades;

import guia10.entidades.E4_Pelicula;
import java.util.Comparator;

/*
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
public class E4_PeliculasUtility {
    public static Comparator<E4_Pelicula> compararDuracionDesc = new Comparator<E4_Pelicula>() {
        @Override
        public int compare(E4_Pelicula p1, E4_Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<E4_Pelicula> compararDuracionAsc = new Comparator<E4_Pelicula>() {
        @Override
        public int compare(E4_Pelicula p1, E4_Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
    
    public static Comparator<E4_Pelicula> compararTituloAlfa = new Comparator<E4_Pelicula>() {
        @Override
        public int compare(E4_Pelicula p1, E4_Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<E4_Pelicula> compararDirectorAlfa = new Comparator<E4_Pelicula>() {
        @Override
        public int compare(E4_Pelicula p1, E4_Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
