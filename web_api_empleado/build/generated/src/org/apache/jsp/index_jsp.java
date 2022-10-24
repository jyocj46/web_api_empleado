package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.table.DefaultTableModel;
import controlador.api_empleado;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Open+Sans:wght@400;600&display=swap\" rel=\"stylesheet\"> \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("\t\t<div class=\"contenedor\">\n");
      out.write("\t\t\t<h2 class=\"logotipo\">Programación II</h2>\n");
      out.write("\t\t\t<h2 class=\"logotipo\">Formulario Empleados</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<main>\n");
      out.write("\t\t<div class=\"pelicula-principal\">\n");
      out.write("\t\t\t<div class=\"contenedor\">\n");
      out.write("\t\t\t\t<h3 class=\"titulo\">Información</h3>\n");
      out.write("\t\t\t\t<table class=\"tabla\">\n");
      out.write("                                <thead>\n");
      out.write("                                  <tr>\n");
      out.write("                                    <th>Nombres</th>\n");
      out.write("                                    <th>Apellidos</th>\n");
      out.write("                                    <th>Direccion</th>\n");
      out.write("                                    <th>Telefono</th>\n");
      out.write("                                    <th>IdPuesto</th>\n");
      out.write("                                    <th>DPI</th>\n");
      out.write("                                    <th>Nacimiento</th>\n");
      out.write("                                    <th>Ingreso</th>\n");
      out.write("                                  </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
 
                                    api_empleado api_c =  new api_empleado();
                                    DefaultTableModel tabla = new DefaultTableModel();
                                    tabla = api_c.leer();
                                    for (int t=0;t<tabla.getRowCount();t++){
                                        out.println("<tr data-id="+ tabla.getValueAt(t, 0) + ">");
                                        out.println("<td>"+ tabla.getValueAt(t, 1) +"</td>");
                                        out.println("<td>"+ tabla.getValueAt(t, 2) +"</td>");
                                        out.println("<td>"+ tabla.getValueAt(t, 3) +"</td>");
                                        out.println("<td>"+ tabla.getValueAt(t, 4) +"</td>");
                                        out.println("<td>"+ tabla.getValueAt(t, 5) +"</td>");
                                        out.println("<td>"+ tabla.getValueAt(t, 6) +"</td>");
                                        out.println("<td>"+ tabla.getValueAt(t, 7) +"</td>");
                                        out.println("<td>"+ tabla.getValueAt(t, 8) +"</td>");
                                        out.println("</tr>");
                                                }
                                    
      out.write("     \n");
      out.write("                                </tbody>\n");
      out.write("                                </table>\n");
      out.write("\t\t\t\t<button role=\"banner\" class=\"boton\"><i class=\"fa-solid fa-file\"></i>Agregar</button>\n");
      out.write("\t\t\t\t<button role=\"button\" class=\"boton\"><i class=\"fa-solid fa-gears\"></i>Modificar</button>\n");
      out.write("\t\t\t\t<button role=\"button\" class=\"boton\"><i class=\"fa-solid fa-rectangle-xmark\"></i>Eliminar</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</main>\n");
      out.write("\t<script src=\"https://kit.fontawesome.com/c70663fc08.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
