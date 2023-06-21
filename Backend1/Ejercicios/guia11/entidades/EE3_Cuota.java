package guia11.entidades;

import java.util.Date;

/*

*/
public class EE3_Cuota {
    private int numCuota;
    private double montoTotal;
    private boolean pagada;
    private Date fechaVencimiento; 
    private String formaPago;

    public EE3_Cuota() {
    }

    public EE3_Cuota(int numCuota, double montoTotal, boolean pagada, Date fechaVencimiento, String formaPago) {
        this.numCuota = numCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "EE3_Cuota{" + "numCuota=" + numCuota + ", montoTotal=" + montoTotal + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
    
}
