package capaNegocio;

import java.util.ArrayList;


public class Cliente {
    
    //Atributos
    private String codCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;
    //Implementar la multiplicidad
    public ArrayList<Factura> recibeFactura = new ArrayList();

    public Cliente() {
        
        this.codCliente = "";
        this.nombreCliente = "";
        this.direccionCliente = "";
        this.telefonoCliente = "";
    }
    
    public Cliente(String codCliente, String nombreCliente, String direccionCliente, String telefonoCliente) {
        this.codCliente = codCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }

       
//
    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
//
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
//
    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
//
    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
}
