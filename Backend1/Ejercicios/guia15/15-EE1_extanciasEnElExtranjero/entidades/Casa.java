package entidades;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/*

*/
public class Casa {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();
    private int id_casa, numero, tiempo_minimo, tiempo_maximo;
    private String calle, codigo_postal, ciudad, pais, tipo_vivienda;
    private Date fecha_desde, fecha_hasta;
    private double precio_habitacion;

    public Casa() {
    }

    public Casa(int id_casa, int numero, int tiempo_minimo, int tiempo_maximo, String calle, String codigo_postal, String ciudad, String pais, String tipo_vivienda, Date fecha_desde, Date fecha_hasta, double precio_habitacion) {
        this.id_casa = id_casa;
        this.numero = numero;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.calle = calle;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.tipo_vivienda = tipo_vivienda;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.precio_habitacion = precio_habitacion;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(int tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public int getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(int tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    @Override
    public String toString() {
        return "Casa{" + "id_casa=" + id_casa + ", numero=" + numero + ", tiempo_minimo=" + tiempo_minimo + ", tiempo_maximo=" + tiempo_maximo + ", calle=" + calle + ", codigo_postal=" + codigo_postal + ", ciudad=" + ciudad + ", pais=" + pais + ", tipo_vivienda=" + tipo_vivienda + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + ", precio_habitacion=" + precio_habitacion + '}';
    }
    
    
}
