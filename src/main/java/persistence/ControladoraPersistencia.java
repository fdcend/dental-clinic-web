package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Usuario;
import persistence.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    HorarioJpaController horaJPA = new HorarioJpaController();
    OdontologoJpaController odntoJPA = new OdontologoJpaController();
    PacienteJpaController pacJPA = new PacienteJpaController();
    PersonaJpaController persJPA = new PersonaJpaController();
    ResponsableJpaController respJPS = new ResponsableJpaController();
    SecretarioJpaController secreJPA = new SecretarioJpaController();
    TurnoJpaController turJPA = new TurnoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public List<Usuario> getUsers() {
        return usuJPA.findUsuarioEntities();
    }

    public void deleteUser(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario getUser(int id) {
        return usuJPA.findUsuario(id);
    }

    public void editUser(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
