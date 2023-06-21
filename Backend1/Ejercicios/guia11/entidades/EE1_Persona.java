package guia11.entidades;

/*

*/
public class EE1_Persona {
    private String nombre, apellido;
    private int edad;
    private long documento;
    private EE1_Perro perro;

    public EE1_Persona() {
    }

    public EE1_Persona(String nombre, String apellido, int edad, long documento, EE1_Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public EE1_Perro getPerro() {
        return perro;
    }

    public void setPerro(EE1_Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro;
    }
    
}
