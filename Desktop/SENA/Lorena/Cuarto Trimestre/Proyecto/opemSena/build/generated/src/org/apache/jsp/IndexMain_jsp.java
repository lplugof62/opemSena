package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IndexMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>  \n");
      out.write("\t\t<title>Menu Desplegable</title>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t* {\n");
      out.write("\t\t\t\tmargin:0px;\n");
      out.write("\t\t\t\tpadding:0px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#header {\n");
      out.write("\t\t\t\tmargin:auto;\n");
      out.write("\t\t\t\twidth:2000px;\n");
      out.write("\t\t\t\tfont-family:Arial, Helvetica, sans-serif;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tul, ol {\n");
      out.write("\t\t\t\tlist-style:none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav > li {\n");
      out.write("\t\t\t\tfloat:left;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li a {\n");
      out.write("\t\t\t\tbackground-color:#FF5733;\n");
      out.write("\t\t\t\tcolor:#fff;\n");
      out.write("\t\t\t\ttext-decoration:none;\n");
      out.write("\t\t\t\tpadding:10px 12px;\n");
      out.write("\t\t\t\tdisplay:block;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li a:hover {\n");
      out.write("\t\t\t\tbackground-color:#F18654;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li ul {\n");
      out.write("\t\t\t\tdisplay:none;\n");
      out.write("\t\t\t\tposition:absolute;\n");
      out.write("\t\t\t\tmin-width:140px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li:hover > ul {\n");
      out.write("\t\t\t\tdisplay:block;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li ul li {\n");
      out.write("\t\t\t\tposition:relative;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li ul li ul {\n");
      out.write("\t\t\t\tright:-140px;\n");
      out.write("\t\t\t\ttop:0px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.barra_delgada {\n");
      out.write("                            font-size: 8px;\n");
      out.write("                        }\n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t");

            HttpSession sesion = request.getSession();                              
            String usuario;
            String nivel;
        
            if(sesion.getAttribute("usuario") !=null && sesion.getAttribute("nivel") !=null){
                usuario= sesion.getAttribute("usuario").toString();
                nivel = sesion.getAttribute("nivel").toString();
            }
        
        
        
        
      out.write("\t\n");
      out.write("        \n");
      out.write("        <div id=\"content\">\n");
      out.write("            <img src=\"img/Logo.jpg\" alt=\"\" width=\"350\" height=\"100\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <img src=\"img/sena.jpg\"  width=\"350\" height=\"100\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <img src=\"img/Escud.png\"  width=\"350\" height=\"100\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        </div>   \n");
      out.write("        <div id=\"header\">\n");
      out.write("\t\t\t<ul class=\"nav\">\n");
      out.write("                                \n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li> \n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a>\n");
      out.write("                                </li> <li><a href=\"IndexMain.jsp\">Inicio</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Servicios Administrador</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t     <li><a href=\"RevisionOfertas.jsp\">Publicaciones/Ofertas Empresas</a></li>\n");
      out.write("\t\t\t\t\t     <li><a href=\"\">Casos Estudiantes</a></li>   \n");
      out.write("                                             <li><a href=\"CreacionAdmin.jsp\">Ingresar Nuevos Administradores</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Acerca de</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Proceso de Aprobacion Empresa</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Procesos de Reportar Egresados</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Proceso Asignar Administrador</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Otras Apliaciones</a>\n");
      out.write("                                <ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Territorium</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://oferta.senasofiaplus.edu.co/sofia-oferta/\">Sena Sofia</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.mintrabajo.gov.co/web/guest/inicio\">Ministerio de trabajo</a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t        </ul> \n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"index.jsp\">Salir</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>    \n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>    \n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>\n");
      out.write("                                <li><a href=\"\">&nbsp;</a></li>     \n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </body>\n");
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
