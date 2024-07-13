package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona implements Serializable {

    //private int id_responsable;
    private String tipoResp;

    
    public Responsable() {
    }

    public Responsable(String tipoResp, int id_persona, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id_persona, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipoResp = tipoResp;
    }

    public String getTipoResp() {
        return tipoResp;
    }

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }

}
