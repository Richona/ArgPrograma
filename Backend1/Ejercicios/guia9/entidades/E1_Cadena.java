package guia9.entidades;

/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
    atributos una frase (String) y su longitud. Agregar constructor vacío y con
    atributo frase solamente. Agregar getters y setters. El constructor con frase
    como atributo debe setear la longitud de la frase de manera automática.
*/
public class E1_Cadena {
    private String frase;
    private final int longitud = 10;

    public E1_Cadena() {
    }

    public E1_Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "E1_Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    } 
}
