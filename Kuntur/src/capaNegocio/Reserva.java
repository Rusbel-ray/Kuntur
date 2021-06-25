/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Eva Luz
 */
public class Reserva {
    
    public Reserva() {
        this.codReserva = "";
        this.fechaHoraReserva = null;
        this.estadoReserva = "";
    }

    public Reserva(String codReserva, Date fechaHoraReserva, String estadoReserva) {
        this.codReserva = codReserva;
        this.fechaHoraReserva = fechaHoraReserva;
        this.estadoReserva = estadoReserva;
    }
    
    //atributos
    private String codReserva;
    private Date fechaHoraReserva;
    private String estadoReserva;
    //implementacion de multiplicidad
    public ArrayList<DetalleReserva> contieneDetalleReserva = new ArrayList();
    public Trabajador correspondeTrabajador;

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public Date getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(Date fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    
}
