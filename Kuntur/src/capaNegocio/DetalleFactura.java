/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

/**
 *
 * @author Eva Luz
 */
public class DetalleFactura {
    
    private String codDetalleFactura;
    private double precioRealDetalleFactura;
    private double subTotalDetalleFactura;
    private int cantidadDetalleFactura;
    
    //Multiplicidad
    private Factura perteneceFactura;
    private PaqueteTuristico contienenPaqueteTuristico;

    
    public DetalleFactura() {
        this.codDetalleFactura = "";
        this.precioRealDetalleFactura = 0 ;
        this.subTotalDetalleFactura = 0;
        this.cantidadDetalleFactura = 0;
    }
    
    public DetalleFactura(String codDetalleFactura, double precioRealDetalleFactura, double subTotalDetalleFactura, int cantidadDetalleFactura, Factura perteneceFactura, PaqueteTuristico contienenPaqueteTuristico) {
        this.codDetalleFactura = codDetalleFactura;
        this.precioRealDetalleFactura = precioRealDetalleFactura;
        this.subTotalDetalleFactura = subTotalDetalleFactura;
        this.cantidadDetalleFactura = cantidadDetalleFactura;

    }

       
    public String getCodDetalleFactura() {
        return codDetalleFactura;
    }

    public void setCodDetalleFactura(String codDetalleFactura) {
        this.codDetalleFactura = codDetalleFactura;
    }

    public double getPrecioRealDetalleFactura() {
        return precioRealDetalleFactura;
    }

    public void setPrecioRealDetalleFactura(double precioRealDetalleFactura) {
        this.precioRealDetalleFactura = precioRealDetalleFactura;
    }

    public double getSubTotalDetalleFactura() {
        return subTotalDetalleFactura;
    }

    public void setSubTotalDetalleFactura(double subTotalDetalleFactura) {
        this.subTotalDetalleFactura = subTotalDetalleFactura;
    }

    public int getCantidadDetalleFactura() {
        return cantidadDetalleFactura;
    }

    public void setCantidadDetalleFactura(int cantidadDetalleFactura) {
        this.cantidadDetalleFactura = cantidadDetalleFactura;
    }

    public Factura getPerteneceFactura() {
        return perteneceFactura;
    }

    public void setPerteneceFactura(Factura perteneceFactura) {
        this.perteneceFactura = perteneceFactura;
    }

    public PaqueteTuristico getContienenPaqueteTuristico() {
        return contienenPaqueteTuristico;
    }

    public void setContienenPaqueteTuristico(PaqueteTuristico contienenPaqueteTuristico) {
        this.contienenPaqueteTuristico = contienenPaqueteTuristico;
    }
    
}
