package guia11.entidades;

import java.util.ArrayList;
import java.util.Date;

/*

*/
public class EE3_Poliza {
    private EE3_Cliente cliente;
    private EE3_Vehiculo vehiculo;
    private ArrayList<EE3_Cuota> cuotas;
    private int numPoliza;
    private Date fechaInicio, fechaFin;
    private String formaPago, tipoCobertura;
    private double montoTotalAsegurado, montoMaxGranizo;
    private boolean incluyeGranizo;

    public EE3_Poliza() {
        this.cliente = new EE3_Cliente();
        this.vehiculo = new EE3_Vehiculo();
        this.cuotas = new ArrayList();
    }

    public EE3_Poliza(EE3_Cliente cliente, EE3_Vehiculo vehiculo, ArrayList<EE3_Cuota> cuotas, int numPoliza, Date fechaInicio, Date fechaFin, String formaPago, String tipoCobertura, double montoTotalAsegurado, double montoMaxGranizo, boolean incluyeGranizo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuotas = cuotas;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.formaPago = formaPago;
        this.tipoCobertura = tipoCobertura;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoMaxGranizo = montoMaxGranizo;
        this.incluyeGranizo = incluyeGranizo;
    }

    public EE3_Cliente getCliente() {
        return cliente;
    }

    public void setCliente(EE3_Cliente cliente) {
        this.cliente = cliente;
    }

    public EE3_Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(EE3_Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<EE3_Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<EE3_Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    @Override
    public String toString() {
        return "Cliente=" + cliente
                + "\n Vehiculo=" + vehiculo
                + "\nCuotas=" + cuotas
                + "\nNumPoliza=" + numPoliza
                + "\nFechaInicio=" + fechaInicio
                + "\nFechaFin=" + fechaFin 
                + "\nFormaPago=" + formaPago 
                + "\nTipoCobertura=" + tipoCobertura 
                + "\nMontoTotalAsegurado=" + montoTotalAsegurado 
                + "\nMontoMaxGranizo=" + montoMaxGranizo 
                + "\nIncluyeGranizo=" + incluyeGranizo;
    }
    
    
    
}
