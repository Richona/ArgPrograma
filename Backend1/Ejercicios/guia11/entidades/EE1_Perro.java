package guia11.entidades;

/*

*/
public class EE1_Perro {
    private String nombre, raza;
    private int edad, tamanio;
    private boolean adoptado;
    
    public EE1_Perro() {
    }

    public EE1_Perro(String nombre, String raza, int edad, int tamanio, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    
    

    @Override
    public String toString() {
        return "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", adoptado=" + adoptado;
    }  
    
}
