package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Controladora;
import logic.Usuario;

@WebServlet(name = "SvEditUser", urlPatterns = {"/SvEditUser"})
public class SvEditUser extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usu = control.getUser(id);
        HttpSession mySession = request.getSession();

        mySession.setAttribute("usuEditar", usu);

        response.sendRedirect("editarUsuario.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        String userRol = request.getParameter("userRol");
        
        Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");
        usu.setNombre_usuario(userName);
        usu.setContrasena(userPassword);
        usu.setRol(userRol);
        
        control.editUser(usu);
        
        response.sendRedirect("SvUser");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
