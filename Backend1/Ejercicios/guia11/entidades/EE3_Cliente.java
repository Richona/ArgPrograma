package guia11.entidades;

/*

*/
public class EE3_Cliente {
    private String nombre, apellido, mail, domicilio;
    private long documento, telefono;

    public EE3_Cliente() {
    }

    public EE3_Cliente(String nombre, String apellido, String mail, String domicilio, long documento, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefono = telefono;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", domicilio=" + domicilio + ", documento=" + documento + ", telefono=" + telefono;
    }
    
    
    
}
