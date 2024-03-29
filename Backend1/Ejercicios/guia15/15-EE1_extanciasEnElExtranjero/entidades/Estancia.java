package entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/*

*/
public class Estancia {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();
    private int id_estancia, id_cliente, id_casa;
    private String nombre_huesped;
    private Date fecha_desde, fecha_hasta;

    public Estancia() {
    }

    public Estancia(int id_estancia, int id_cliente, int id_casa, String nombre_huesped, Date fecha_desde, Date fecha_hasta) {
        this.id_estancia = id_estancia;
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public int getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(int id_estancia) {
        this.id_estancia = id_estancia;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
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

    @Override
    public String toString() {
        return "Estancia{" + "id_estancia=" + id_estancia + ", id_cliente=" + id_cliente + ", id_casa=" + id_casa + ", nombre_huesped=" + nombre_huesped + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + '}';
    }
    
    
}
