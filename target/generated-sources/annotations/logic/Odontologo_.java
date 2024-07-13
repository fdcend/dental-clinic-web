package logic;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Horario;
import logic.Turno;
import logic.Usuario;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-10T22:44:43")
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Persona_ {

    public static volatile SingularAttribute<Odontologo, Usuario> unUsuario;
    public static volatile SingularAttribute<Odontologo, String> especialidad;
    public static volatile ListAttribute<Odontologo, Turno> listaTurnos;
    public static volatile SingularAttribute<Odontologo, Horario> unHorario;

}