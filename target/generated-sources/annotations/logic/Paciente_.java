package logic;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Responsable;
import logic.Turno;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-10T22:44:43")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, Boolean> os;
    public static volatile ListAttribute<Paciente, Turno> listaTurnosPaciente;
    public static volatile SingularAttribute<Paciente, Responsable> unResponsable;
    public static volatile SingularAttribute<Paciente, String> tipo_sangre;

}