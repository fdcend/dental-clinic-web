/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-07-13 16:20:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import logic.Usuario;

public final class verUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/components/body.jsp", Long.valueOf(1720887354536L));
    _jspx_dependants.put("/components/header.jsp", Long.valueOf(1718539690328L));
    _jspx_dependants.put("/components/footer.jsp", Long.valueOf(1720885353181L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("logic.Usuario");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Dental Clinic</title>\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <!-- Page Wrapper -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar - Brand -->\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.jsp\">\n");
      out.write("                <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                    <i class=\"fas fa-light fa-tooth\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">My Dental Clinic</div>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Dashboard -->\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\">\n");
      out.write("                    <i class=\"fas fa-solid fa-bars\"></i>\n");
      out.write("                    <span>Management</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Dentist Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\n");
      out.write("                   aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                    <i class=\"fas fa-solid fa-user-md\"></i>\n");
      out.write("                    <span>Dentist</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <a class=\"collapse-item\" href=\"buttons.html\">View / Modify</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"altaOdontologo.jsp\">Add New</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Patient Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\n");
      out.write("                   aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("                    <i class=\"fas fa-solid fa-user-alt\"></i>\n");
      out.write("                    <span>Patient</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\n");
      out.write("                     data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <a class=\"collapse-item\" href=\"buttons.html\">View / Modify</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"cards.html\">Add New</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - User Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUsers\"\n");
      out.write("                   aria-expanded=\"true\" aria-controls=\"collapseUsers\">\n");
      out.write("                    <i class=\"fas fa-solid fa-user-alt\"></i>\n");
      out.write("                    <span>User</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseUsers\" class=\"collapse\" aria-labelledby=\"headingUsers\"\n");
      out.write("                     data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <a class=\"collapse-item\" href=\"SvUser\">View / Modify</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"altaUsuario.jsp\">Add New</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("        <!-- Content Wrapper -->\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <!-- Topbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <!-- Topbar Navbar -->\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - User Information -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");

                                    String user = (String) request.getSession().getAttribute("user");
                                    if (user != null) {
                                        out.print(user);
                                    } else {
                                        out.print("");
                                    }
                                    
      out.write("</span>\n");
      out.write("                                <img class=\"img-profile rounded-circle\"\n");
      out.write("                                     src=\"img/undraw_profile.svg\">\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("                <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                <!-- Begin Page Content -->\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        <!-- session validation -->\n");
      out.write("\n");
      out.write("    ");
 HttpSession mySession = request.getSession();
    String user2 = (String) request.getSession().getAttribute("user");
    if(user == null){
        response.sendRedirect("login.jsp");
        } 
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- Page Heading -->\n");
      out.write("    <h1 class=\"h3 mb-2 text-gray-800\">Users</h1>\n");
      out.write("    \n");
      out.write("    <!-- DataTales Example -->\n");
      out.write("    <div class=\"card shadow mb-4\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Rol</th>\n");
      out.write("                            <th style=\"width: 210px\">Modify</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tfoot>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Rol</th>\n");
      out.write("                            <th style=\"width: 210px\">Modify</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </tfoot>\n");
      out.write("                    \n");
      out.write("                    ");

                    List<Usuario> allUsersList = (List) request.getSession().getAttribute("userList");
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tbody>\n");
      out.write("                        ");
for (Usuario usu: allUsersList){
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(usu.getId_usuario());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(usu.getNombre_usuario());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(usu.getRol());
      out.write("</td>\n");
      out.write("                            <td style=\"display: flex; width: 230px\">\n");
      out.write("                                <form name=\"delete\" action=\"SvDeleteUser\" method=\"POST\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-user btn-block\" style=\"background-color: red; margin-right: 5px\"/>\n");
      out.write("                                    <i class=\"fas fa-trash-alt\"></i> Delete\n");
      out.write("                                    </button>\n");
      out.write("                                    <input type=\"hidden\"; name=\"id\" value=\"");
      out.print(usu.getId_usuario());
      out.write("\">\n");
      out.write("                                </form>\n");
      out.write("                                <form name=\"edit\" action=\"SvEditUser\" method=\"GET\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-user btn-block\" style=\"margin-left: 5px\"/>\n");
      out.write("                                    <i class=\"fas fa-pencil-alt\"></i> Edit\n");
      out.write("                                    </button>\n");
      out.write("                                    <input type=\"hidden\"; name=\"id\" value=\"");
      out.print(usu.getId_usuario());
      out.write("\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- End of Main Content -->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"sticky-footer bg-white\">\n");
      out.write("    <div class=\"container my-auto\">\n");
      out.write("        <div class=\"copyright text-center my-auto\">\n");
      out.write("            <span>&copy; 2024, My Dental Clinic.</span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<!-- End of Footer -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("<!-- Scroll to Top Button-->\n");
      out.write("<a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<!-- Logout Modal-->\n");
      out.write("<div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("     aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">x</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">Select \"Logout\" to end your current session.</div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                <a class=\"btn btn-primary\" href=\"login.jsp\" >Logout</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript-->\n");
      out.write("<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Core plugin JavaScript-->\n");
      out.write("<script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Custom scripts for all pages-->\n");
      out.write("<script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page level plugins -->\n");
      out.write("<script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("<script src=\"vendor/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"vendor/datatables/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page level custom scripts -->\n");
      out.write("<script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("<script src=\"js/demo/chart-pie-demo.js\"></script>\n");
      out.write("<script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
