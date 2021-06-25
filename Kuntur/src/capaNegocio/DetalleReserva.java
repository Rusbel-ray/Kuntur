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
public class DetalleReserva {
    
    //Atributos
    private String codDetallePedido;
    private int cantidadDetallePedido;
    //Implementar la multiplicidad
    public PaqueteTuristico consignaPaqueteTuristico;
    public Reserva perteneceaReserva;

    
    //Sin parámetros
    public DetalleReserva() {
        
        this.codDetallePedido = "";
        this.cantidadDetallePedido = 0;
        
    }
    //Constructor con parámetros
    public DetalleReserva(String codDetallePedido, int cantidadDetallePedido) {
        this.codDetallePedido = codDetallePedido;
        this.cantidadDetallePedido = cantidadDetallePedido;
    }

       
    //
    public String getCodDetallePedido() {
        return codDetallePedido;
    }

    public void setCodDetallePedido(String codDetallePedido) {
        this.codDetallePedido = codDetallePedido;
    }
//
    public int getCantidadDetallePedido() {
        return cantidadDetallePedido;
    }

    public void setCantidadDetallePedido(int cantidadDetallePedido) {
        this.cantidadDetallePedido = cantidadDetallePedido;
    }
    
    
    
}
