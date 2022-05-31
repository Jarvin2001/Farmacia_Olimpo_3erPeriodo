package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Loby_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Recursos/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"Recursos/css/bootstrap-grid.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-grid.rtl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-grid.rtl.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-reboot.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-reboot.rtl.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-reboot.rtl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-utilities.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-reboot.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-utilities.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-utilities.rtl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap-utilities.rtl.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap.rtl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Recursos/css/bootstrap.rtl.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-gray\">\n");
      out.write("        <header class=\"py-5\">\n");
      out.write("            <div class=\"container px-lg-5\">\n");
      out.write("                <div class=\"p-4 p-lg-5 bg-light rounded-3 text-center\">\n");
      out.write("                    <div class=\"m-4 m-lg-5\">\n");
      out.write("                        \n");
      out.write("                        <img src=\"Recursos/imagenes/LOGO FARMACIA OLIMPO VERTICAL .png\"\n");
      out.write("                             style=\"width: 200px;\" alt=\"logo\">\n");
      out.write("                        <h1 class=\"display-5 fw-bold\">¡BIENVENIDO!</h1>\n");
      out.write("                        <p class=\"fs-4\">Seleccione una de las opciones</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!--Elecciion-->\n");
      out.write("        <section class=\"pt-4\">\n");
      out.write("            <div class=\"container px-lg-5\">\n");
      out.write("                <!-- Page Features-->\n");
      out.write("                <div class=\"row gx-lg-5\">\n");
      out.write("                    <div class=\"col-lg-6 col-xxl-4 mb-5\">\n");
      out.write("                        <div class=\"card bg-light border-0 h-100\">\n");
      out.write("                            <div class=\"card-body text-center p-4 p-lg-5 pt-0 pt-lg-0\">\n");
      out.write("                                <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4\"><i class=\"bi bi-collection\"></i></div>\n");
      out.write("                                <img src=\"Recursos/imagenes/bolsa-de-la-compra (4).png\">\n");
      out.write("                                <h2 class=\"fs-4 fw-bold\">Hacer venta</h2> <br>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#!\">Ingresar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-xxl-4 mb-5\">\n");
      out.write("                        <div class=\"card bg-light border-0 h-100\">\n");
      out.write("                            <div class=\"card-body text-center p-4 p-lg-5 pt-0 pt-lg-0\">\n");
      out.write("                                <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4\"><i class=\"bi bi-cloud-download\"></i></div>\n");
      out.write("                                <img src=\"Recursos/imagenes/empleados.png\">\n");
      out.write("                                <h2 class=\"fs-4 fw-bold\">Mantenimiento Empleados</h2>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#!\">Ingresar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-xxl-4 mb-5\">\n");
      out.write("                        <div class=\"card bg-light border-0 h-100\">\n");
      out.write("                            <div class=\"card-body text-center p-4 p-lg-5 pt-0 pt-lg-0\">\n");
      out.write("                                <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4\"><i class=\"bi bi-card-heading\"></i></div>\n");
      out.write("                                <img src=\"Recursos/imagenes/paquete.png\">\n");
      out.write("                                <h2 class=\"fs-4 fw-bold\">Mantenimiento Productos</h2>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#!\">Ingresar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-xxl-4 mb-5\">\n");
      out.write("                        <div class=\"card bg-light border-0 h-100\">\n");
      out.write("                            <div class=\"card-body text-center p-4 p-lg-5 pt-0 pt-lg-0\">\n");
      out.write("                                <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4\"><i class=\"bi bi-bootstrap\"></i></div>\n");
      out.write("                                <img src=\"Recursos/imagenes/clasificacion.png\">\n");
      out.write("                                <h2 class=\"fs-4 fw-bold\">Mantenimiento Clientes</h2>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#!\">Ingresar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-xxl-4 mb-5\">\n");
      out.write("                        <div class=\"card bg-light border-0 h-100\">\n");
      out.write("                            <div class=\"card-body text-center p-4 p-lg-5 pt-0 pt-lg-0\">\n");
      out.write("                                <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4\"><i class=\"bi bi-code\"></i></div>\n");
      out.write("                                <img src=\"Recursos/imagenes/capa.png\">\n");
      out.write("                                <h2 class=\"fs-4 fw-bold\">Historial de ventas</h2>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#!\">Ingresar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-xxl-4 mb-5\">\n");
      out.write("                        <div class=\"card bg-light border-0 h-100\">\n");
      out.write("                            <div class=\"card-body text-center p-4 p-lg-5 pt-0 pt-lg-0\">\n");
      out.write("                                <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4\"><i class=\"bi bi-patch-check\"></i></div>\n");
      out.write("                                <img src=\"Recursos/imagenes/empleados.png\">\n");
      out.write("                                <br>\n");
      out.write("                                <br>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#!\">Cerrar Sesión</a> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("     <footer class=\"bg-light text-center align-bottom\">\n");
      out.write("        <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("            © 2022 Copyright:\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
