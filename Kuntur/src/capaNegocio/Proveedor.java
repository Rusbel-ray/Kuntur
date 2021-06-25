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
public class Proveedor {
    
     //Atributos
    private String producto;
    private String codPedido ;
    private String cantidadPedido;
    private String fechaHoraPedido;
    //Implementar la multiplicidad

    public Proveedor() {
        this.producto= "";
        this.codPedido="";
        this.cantidadPedido="";
        this.fechaHoraPedido="";
       
        
    }

    public Proveedor(String producto, String codPedido, String cantidadPedido, String fechaHoraPedido) {
        this.producto = producto;
        this.codPedido = codPedido;
        this.cantidadPedido = cantidadPedido;
        this.fechaHoraPedido = fechaHoraPedido;
    }
    
//
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
//
    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }
//
    public String getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(String cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }
//
    public String getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(String fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }
    
}
