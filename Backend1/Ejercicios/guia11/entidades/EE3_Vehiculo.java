package guia11.entidades;

/*

*/
public class EE3_Vehiculo {
    private String marca, modelo, color, tipo;
    private int anio, numMotor, numChasis;

    public EE3_Vehiculo() {
    }

    public EE3_Vehiculo(String marca, String modelo, String color, String tipo, int anio, int numMotor, int numChasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(int numChasis) {
        this.numChasis = numChasis;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", anio=" + anio + ", numMotor=" + numMotor + ", numChasis=" + numChasis;
    }
    
    
    
}
