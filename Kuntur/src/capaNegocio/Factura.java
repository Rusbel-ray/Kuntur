/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import java.util.ArrayList;

/**
 *
 * @author Eva Luz
 */
public class Factura {
    
    //Constructor con inicializacion de parametros

    public Factura() {
        this.codRegistroVenta = "";
        this.tipoPagoRegistroVenta = "";
        this.montoRegistroVenta = 0;
    }
//constructor con parametros 
    public Factura(String codRegistroVenta, String tipoPagoRegistroVenta, Double montoRegistroVenta) {
        this.codRegistroVenta = codRegistroVenta;
        this.tipoPagoRegistroVenta = tipoPagoRegistroVenta;
        this.montoRegistroVenta = montoRegistroVenta;
    }
    
    //Atributos
    private String codRegistroVenta;
    private String tipoPagoRegistroVenta;
    private double montoRegistroVenta;
    //implemtanción de multiplicidad
    private Cliente correspondeCliente;
    public ArrayList<DetalleFactura> tieneDetalleFactura = new ArrayList();
    
//
    public String getCodRegistroVenta() {
        return codRegistroVenta;
    }

    public void setCodRegistroVenta(String codRegistroVenta) {
        this.codRegistroVenta = codRegistroVenta;
    }
//
    public String getTipoPagoRegistroVenta() {
        return tipoPagoRegistroVenta;
    }

    public void setTipoPagoRegistroVenta(String tipoPagoRegistroVenta) {
        this.tipoPagoRegistroVenta = tipoPagoRegistroVenta;
    }
//
    public Double getMontoRegistroVenta() {
        return montoRegistroVenta;
    }

    public void setMontoRegistroVenta(Double montoRegistroVenta) {
        this.montoRegistroVenta = montoRegistroVenta;
    }
    
}
