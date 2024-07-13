package logic;

import java.util.ArrayList;
import java.util.List;
import persistence.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(String nombreUsuario, String contrasena, String rol) {
        Usuario usu = new Usuario();

        usu.setNombre_usuario(nombreUsuario);
        usu.setContrasena(contrasena);
        usu.setRol(rol);

        controlPersis.crearUsuario(usu);
    }

    public List<Usuario> getUsers() {
        return controlPersis.getUsers();

    }

    public void deleteUser(int id) {
        controlPersis.deleteUser(id);
    }

    public Usuario getUser(int id) {
        return controlPersis.getUser(id);
    }

    public void editUser(Usuario usu) {
        controlPersis.editUser(usu);
    }

    public boolean validator(String user, String password) {
        List<Usuario> usersList = new ArrayList<Usuario>();
        usersList = controlPersis.getUsers();
        boolean validator = false;

        for (Usuario usu : usersList) {
            if (usu.getNombre_usuario().equals(user)) {
                if (usu.getContrasena().equals(password)) {
                    validator = true;
                } else {
                    validator = false;
                }
            }
        }
        return validator;
    }

}
