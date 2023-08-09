package entidades;


import java.io.Serializable;
import javax.persistence.*;
/*
Entidad Libro
La entidad libro modela los libros que están disponibles en la biblioteca para ser prestados. En
esta entidad, el atributo “ejemplares” contiene la cantidad total de ejemplares de ese libro,
mientras que el atributo “ejemplaresPrestados” contiene cuántos de esos ejemplares se
encuentran prestados en este momento y el atributo “ejemplaresRestantes” contiene cuántos
de esos ejemplares quedan para prestar.
*/

@Entity
public class Libro implements Serializable {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();
    @Id
    private Long isbn;
    
    private String titulo;
    private Integer anio;
    private Integer Ejemplares;
    private Integer EjemplaresPrestados;
    private Integer EjemplaresRestantes;
    private Boolean alta;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;

    public Libro() {
        this.alta = true;
    }
    
    

    public Libro(Long isbn, String titulo, Integer anio, Integer Ejemplares, Integer EjemplaresPrestados, Integer EjemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.Ejemplares = Ejemplares;
        this.EjemplaresPrestados = EjemplaresPrestados;
        this.EjemplaresRestantes = EjemplaresRestantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return Ejemplares;
    }

    public void setEjemplares(Integer Ejemplares) {
        this.Ejemplares = Ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return EjemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer EjemplaresPrestados) {
        this.EjemplaresPrestados = EjemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return EjemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer EjemplaresRestantes) {
        this.EjemplaresRestantes = EjemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", Ejemplares=" + Ejemplares + ", EjemplaresPrestados=" + EjemplaresPrestados + ", EjemplaresRestantes=" + EjemplaresRestantes + ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
}
