<%@page import="java.util.List"%>
<%@page import="logic.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body.jsp" %>

<div class="container-fluid">

        <!-- session validation -->

    <% HttpSession mySession = request.getSession();
    String user2 = (String) request.getSession().getAttribute("user");
    if(user == null){
        response.sendRedirect("login.jsp");
        } %>
    
    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Users</h1>
    
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Rol</th>
                            <th style="width: 210px">Modify</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Rol</th>
                            <th style="width: 210px">Modify</th>
                        </tr>
                    </tfoot>
                    
                    <%
                    List<Usuario> allUsersList = (List) request.getSession().getAttribute("userList");
                    %>
                    
                    <tbody>
                        <%for (Usuario usu: allUsersList){%>
                        <tr>
                            <td><%=usu.getId_usuario()%></td>
                            <td><%=usu.getNombre_usuario()%></td>
                            <td><%=usu.getRol()%></td>
                            <td style="display: flex; width: 230px">
                                <form name="delete" action="SvDeleteUser" method="POST">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px"/>
                                    <i class="fas fa-trash-alt"></i> Delete
                                    </button>
                                    <input type="hidden"; name="id" value="<%=usu.getId_usuario()%>">
                                </form>
                                <form name="edit" action="SvEditUser" method="GET">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px"/>
                                    <i class="fas fa-pencil-alt"></i> Edit
                                    </button>
                                    <input type="hidden"; name="id" value="<%=usu.getId_usuario()%>">
                                </form>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>

<%@include file="components/footer.jsp" %>