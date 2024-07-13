package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {

    //iba id_paciente
    private boolean os;
    private String tipo_sangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurnosPaciente;

    public Paciente() {
    }

    public Paciente(boolean os, String tipo_sangre, Responsable unResponsable, List<Turno> listaTurnosPaciente, int id_persona, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id_persona, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.os = os;
        this.tipo_sangre = tipo_sangre;
        this.unResponsable = unResponsable;
        this.listaTurnosPaciente = listaTurnosPaciente;
    }

    public boolean isOs() {
        return os;
    }

    public void setOs(boolean os) {
        this.os = os;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnosPaciente() {
        return listaTurnosPaciente;
    }

    public void setListaTurnosPaciente(List<Turno> listaTurnosPaciente) {
        this.listaTurnosPaciente = listaTurnosPaciente;
    }



}
