/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.entidades;

import java.util.Scanner;

/**
 *
 * @author Richard
 */

/*
        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
    y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
    Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro 
    método el número de ISBN, el título, el autor del libro y el número de páginas.

 */
public class E1_Libro {

    static Scanner leer = new Scanner(System.in);

    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public E1_Libro() {
    }

    public E1_Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public static E1_Libro cargarLibro() {
        int isbn, paginas;
        String titulo, autor;

        System.out.println("Datos del libro:");
        System.out.print("Ingresar ISBN:");
        isbn = Integer.parseInt(leer.nextLine());

        System.out.print("Ingresar titulo:");
        titulo = leer.nextLine();

        System.out.print("Ingresar autor:");
        autor = leer.nextLine();

        System.out.print("Ingresar paginas:");
        paginas = Integer.parseInt(leer.nextLine());

        return new E1_Libro(isbn, titulo, autor, paginas);
    }

    public void mostrarLibro() {
        System.out.printf("\nISBN: %d\nTitle: %-15s\nAutor: %-15s\nPáginas: %d\n", this.getIsbn(), this.getTitulo(), this.getAutor(), this.getPaginas());
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }

}
