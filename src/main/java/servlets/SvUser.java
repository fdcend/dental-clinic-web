package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Controladora;
import logic.Usuario;

@WebServlet(name = "SvUser", urlPatterns = {"/SvUser"})
public class SvUser extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> userList = new ArrayList<Usuario>();
        userList = control.getUsers();
        
        HttpSession mySession = request.getSession();
        mySession.setAttribute("userList", userList);
        
        response.sendRedirect("verUsuario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String usName = request.getParameter("userName");
        String usPassword = request.getParameter("userPassword");
        String usRol = request.getParameter("userRol");
        
        control.crearUsuario(usName, usPassword, usRol);
        
        List<Usuario> userList = new ArrayList<Usuario>();
        userList = control.getUsers();
        
        HttpSession mySession = request.getSession();
        mySession.setAttribute("userList", userList);
        
        response.sendRedirect("verUsuario.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
