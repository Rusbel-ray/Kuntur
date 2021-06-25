package capaNegocio;

import java.util.ArrayList;


public class Trabajador {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String dNI;
    private String nroTelefonico;

    //Multiplicidad
    public ArrayList<Reserva> atiendeReserva = new ArrayList();

    
    public Trabajador() {
        this.nombre = "";
        this.apellido = "";
        this.dNI = "";
        this.nroTelefonico = "";
    }
    
    public Trabajador(String nombre, String apellido, String dNI, String nroTelefonico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dNI = dNI;
        this.nroTelefonico = nroTelefonico;
    }
  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public String getNroTelefonico() {
        return nroTelefonico;
    }

    public void setNroTelefonico(String nroTelefonico) {
        this.nroTelefonico = nroTelefonico;
    }
    
}
