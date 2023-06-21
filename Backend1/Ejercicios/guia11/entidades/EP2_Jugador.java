package guia11.entidades;

/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
*/
public class EP2_Jugador {
    private String nombre, apellido, posicion;
    private int num;

    public EP2_Jugador() {
    }

    public EP2_Jugador(String nombre, String apellido, String posicion, int num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "EP2_Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", num=" + num + '}';
    }
    
    
    
}
