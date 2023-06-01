package guia10.entidades;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
*/
public class E4_Pelicula {
    private String titulo;
    private String director;
    private Double duracion;

    public E4_Pelicula() {
    }

    public E4_Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
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

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "E4_Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
}
