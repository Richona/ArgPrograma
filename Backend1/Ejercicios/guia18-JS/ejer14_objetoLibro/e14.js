/* 14. Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */
function Libro (ISBN, titulo, autor, numeroPaginas){
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
}

function crearLibro(){
    let ISBN = prompt("ISBN del libro");

    let titulo = prompt("Titulo del libro");

    let autor = prompt("Autor del libro");

    let numeroPaginas = prompt("Numero de paginas del libro");

    return new Libro(ISBN, titulo, autor, numeroPaginas);
}

function mostrarLibro({ISBN, titulo, autor, numeroPaginas}) {
    alert(`Libro:
    ISBN: ${ISBN}
    Titulo: ${titulo}
    Autor: ${autor}
    Numero de paginas: ${numeroPaginas}`);
}

let libro = crearLibro();

mostrarLibro(libro);