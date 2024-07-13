<%@page import="logic.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body.jsp" %>

<h2>Edit User</h2>
<br>

<%Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>

<form class="user" action="SvEditUser" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="userName" name="userName"
                   placeholder="User Name" value="<%=usu.getNombre_usuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="userPassword" name="userPassword"
                   placeholder="Password" value="<%=usu.getContrasena()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="userRol" name="userRol"
                   placeholder="Rol" value="<%=usu.getRol()%>">
        </div>
        <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
            Update User
        </button>
        </div>
</form>

<%@include file="components/footer.jsp" %>
