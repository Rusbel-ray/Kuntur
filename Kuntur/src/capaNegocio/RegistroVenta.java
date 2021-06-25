package capaNegocio;

import java.util.ArrayList;


public class RegistroVenta {
    
     //atributos
    private String codRegistro;
    private String fechaHoraRegistro ;
    private String precioRegistro ;
        
    //Implementar la multiplicidad 
    
    public Cliente registraCliente;

    
    public RegistroVenta(String codRegistro, String fechaHoraRegistro, String precioRegistro, String registroCliente) {
        this.codRegistro = codRegistro;
        this.fechaHoraRegistro = fechaHoraRegistro;
        this.precioRegistro = precioRegistro;
        
    }

    public RegistroVenta() {
        this.codRegistro="";
        this.fechaHoraRegistro="";
        this.precioRegistro="";
        
        
        
        
    }
    

    public String getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(String codRegistro) {
        this.codRegistro = codRegistro;
    }

    public String getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(String fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public String getPrecioRegistro() {
        return precioRegistro;
    }

    public void setPrecioRegistro(String precioRegistro) {
        this.precioRegistro = precioRegistro;
    }

   
    
}
