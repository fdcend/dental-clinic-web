<%-- 
    Document   : altaOdontologo
    Created on : May 26, 2024, 3:44:10 PM
    Author     : fdcen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body.jsp" %>

<h2>Register a new dentist</h2>
<br>

<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="firstName"
                   placeholder="First Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="lastName"
                   placeholder="Last Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="DNI"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="phoneNumber"
                   placeholder="Phone number">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direction"
                   placeholder="Direction">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control-user" id="birthDate"
                   placeholder="Birth Date">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="specialty"
                   placeholder="Specialty">
        </div>
        <a href="#" class="btn btn-primary btn-user btn-block col-sm-6 mb-3">
            Register Dentist
        </a>
        </div>
</form>

<%@include file="components/footer.jsp" %>
