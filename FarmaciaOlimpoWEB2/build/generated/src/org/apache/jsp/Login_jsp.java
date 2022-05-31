package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"h-100 gradient-form\" style=\"background-color: #eee;\">\n");
      out.write("            <div class=\"container py-5 h-100\">\n");
      out.write("                <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                    <div class=\"col-xl-5\">\n");
      out.write("                        <div class=\"card rounded-3 text-black\">\n");
      out.write("                            <div class=\"row g-0\">\n");
      out.write("                                <div class=\"col-lg-0\">\n");
      out.write("                                    <div class=\"card-body p-md-5 mx-md-4\">\n");
      out.write("\n");
      out.write("                                        <div class=\"text-center\">\n");
      out.write("                                            <img src=\"Recursos/imagenes/LOGO FARMACIA OLIMPO VERTICAL .png\"\n");
      out.write("                                                 style=\"width: 185px;\" alt=\"logo\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <form action=\"Login.jsp\" method=\"post\" >\n");
      out.write("                                            <p class=\"text-center\">Ingresa tu usuario y contraseña</p>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-outline mb-4 ml-10\">\n");
      out.write("                                                <label class=\"form-label\" for=\"usuario\">Usuario</label>\n");
      out.write("                                                <input type=\"text\" id=\"usuario\" name=\"usuario\" class=\"form-control\" placeholder=\"Ingresa tu usuario\" />\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-outline mb-4\">\n");
      out.write("                                                <label class=\"form-label\" for=\"contra\">Contraseña</label>\n");
      out.write("                                                <input type=\"password\" id=\"contra\"  name=\"contra\" class=\"form-control\" placeholder=\"Ingresa tu contraseña\"/>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"text-center pt-1 mb-5 pb-1\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Ingresar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"bg-light text-center align-bottom\">\n");
      out.write("        <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("            © 2022 Copyright:\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
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
