package guia10.entidades;

import java.util.Comparator;

/*

 */
public class EP1_Libro {

    private String titulo;

    public EP1_Libro() {
    }

    public EP1_Libro(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static Comparator<EP1_Libro> compararTitulo = new Comparator<EP1_Libro>() {
        @Override
        public int compare(EP1_Libro l1, EP1_Libro l2) {
            return l1.getTitulo().compareTo(l2.getTitulo());
        }
    };

    @Override
    public String toString() {

        return "EP1_Libro{" + "titulo=" + titulo + '}';
    }

}
