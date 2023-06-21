package guia11.entidades;

/*

*/
public class EE2_Pelicula {
    private String titulo, director;
    private int duracion, edadMinima;

    public EE2_Pelicula() {
    }

    public EE2_Pelicula(String titulo, String director, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edadMinima=" + edadMinima;
    }
    
    
}
