package capaNegocio;

import java.util.ArrayList;


public class PaqueteTuristico {
    
    //Atributos
    private String codPaqueteTuristico;
    private String descripcionPaqueteTuristico;
    private int precioPaqueteTuristico;
    //Implementar la multiplicidad
    public ArrayList<DetalleFactura> estaenDetalleFactura = new ArrayList();
    public ArrayList<DetalleReserva> estaenDetalleReserva = new ArrayList();

    
    public PaqueteTuristico() {
        this.codPaqueteTuristico = "";
        this.descripcionPaqueteTuristico = "";
        this.precioPaqueteTuristico = 0;
        
    }
    
    
    public PaqueteTuristico(String codPaqueteTuristico, String descripcionPaqueteTuristico, int precioPaqueteTuristico) {
        this.codPaqueteTuristico = codPaqueteTuristico;
        this.descripcionPaqueteTuristico = descripcionPaqueteTuristico;
        this.precioPaqueteTuristico = precioPaqueteTuristico;
    }

    
//
    public String getCodPaqueteTuristico() {
        return codPaqueteTuristico;
    }

    public void setCodPaqueteTuristico(String codPaqueteTuristico) {
        this.codPaqueteTuristico = codPaqueteTuristico;
    }
//
    public String getDescripcionPaqueteTuristico() {
        return descripcionPaqueteTuristico;
    }

    public void setDescripcionPaqueteTuristico(String descripcionPaqueteTuristico) {
        this.descripcionPaqueteTuristico = descripcionPaqueteTuristico;
    }
//
    public int getPrecioPaqueteTuristico() {
        return precioPaqueteTuristico;
    }

    public void setPrecioPaqueteTuristico(int precioPaqueteTuristico) {
        this.precioPaqueteTuristico = precioPaqueteTuristico;
    }
    
}
