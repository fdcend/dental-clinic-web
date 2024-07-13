<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body.jsp" %>

<h2>Create a new user</h2>
<br>

<form class="user" action="SvUser" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="userName" name="userName"
                   placeholder="Username">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="userPassword" name="userPassword"
                   placeholder="Password">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="userRol" name="userRol"
                   placeholder="Rol">
        </div>
        <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
            Register User
        </button>
        </div>
</form>

<%@include file="components/footer.jsp" %>
