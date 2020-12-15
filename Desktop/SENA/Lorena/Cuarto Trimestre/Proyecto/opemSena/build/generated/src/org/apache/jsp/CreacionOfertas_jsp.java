package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelado.Operaciones;

public final class CreacionOfertas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?xml version='1.0' encoding='UTF-8' ?>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\"></meta>\n");
      out.write("        <title>Creacion de Ofertas</title>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/EstilosCreacionOfertas.css\" type=\"text/css\"></link>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/bootstrap.min.css\" type=\"text/css\"></link>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/normalize.min.css\" type=\"text/css\"></link>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" \n");
      out.write("        <script>\n");
      out.write("                 function validarfor(){\n");
      out.write("    \n");
      out.write("        var nom = document.getElementById(\"txtOferta\").value; \n");
      out.write("        var desc = document.getElementsByName(\"txtDescOferta\")[0].value;\n");
      out.write("        var tipPerfil = document.getElementsByName(\"selecttxtPerfil\")[0].value;\n");
      out.write("        var sueldo = document.getElementsByName(\"txtSueldo\")[0].value;\n");
      out.write("        \n");
      out.write("        //var coment = document.getElementsByName(\"comentarios\")[0].value;\n");
      out.write("    \n");
      out.write("       \n");
      out.write("        if(nom == \"\"){\n");
      out.write("            alert(\"El campo Nombre Oferta no debe estar vacio\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("          if(desc == \"\"){\n");
      out.write("             alert(\"El campo Descripcion  no debe estar vacio\");\n");
      out.write("              return false;\n");
      out.write("        }\n");
      out.write("          if(tipPerfil == \"\"){\n");
      out.write("             alert(\"El campo tipo Perfil  no debe estar vacio\");\n");
      out.write("              return false;\n");
      out.write("        }\n");
      out.write("           if(sueldo == \"\" ){\n");
      out.write("             alert(\"El campo Tipo de documento  no debe estar vacio\");\n");
      out.write("              return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    function redirect1(){\n");
      out.write("        window.location.replace('http://localhost:8084/OPEMSENA1/indexUserEmpresa.jsp'); \n");
      out.write("       }\n");
      out.write("        </script>\n");
      out.write("        <form action=\"CreacionOfertas.jsp\" method=\"POST\" class=\"login\" onSubmit=\"return validarfor();\">\n");
      out.write("            <fieldset>\n");
      out.write("            <img src=\"img/Logo.jpg\" id=\"miImagen\" width=\"350\" height=\"100\">\n");
      out.write("            <h3 class=\"text-center\">Creacion Oferta</h3>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtOferta\" >Nombre Oferta:</label>\n");
      out.write("            <input type=\"text\" name=\"txtOferta\" id=\"txtOferta\" placeholder=\"Escriba Nom Oferta\"></input><br></br>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"txtDescOferta\" >Descripcion Oferta:</label>             \n");
      out.write("            <p><textarea  name=\"txtDescOferta\" id=\"txtDescOferta\" placeholder=\"Descripcion de la Oferta\"></textarea></p><br></br>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("            <label for=\"txtPerfil\" >Perfil:</label>             \n");
      out.write("            <select name=\"selecttxtPerfil\" id=\"selecttxtPerfil\">\n");
      out.write("                                 <option value=\"\" selected></option> \n");
      out.write("                                <option value=\"TC\">Tecnico</option> \n");
      out.write("                                <option value=\"TCF\">Tecnico Profesional</option>\n");
      out.write("                                <option value=\"TG\">Tecnologo</option>  \n");
      out.write("                              </select><br></br>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("            <label for=\"txtSueldo\" >Sueldo:</label>             \n");
      out.write("            <input type=\"text\" name=\"txtSueldo\" id=\"txtSueldo\" placeholder=\"Escriba el Sueldo de la Oferta\"></input><br></br>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"text-center\">\n");
      out.write("            <input  type=\"submit\"  class=\"btn btn-primary btn-block\" name=\"BotonOferta\" value=\"Guardar Oferta\"></input><br></br>  \n");
      out.write("            <input  type=\"button\"  class=\"btn btn-primary btn-block\" name=\"Volver\" value=\"Volver al Menu\" onclick=\"redirect1();\"></input><br></br>  \n");
      out.write("            </p>\n");
      out.write("        </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        ");

             HttpSession sesion = request.getSession();                              
            String empresa;
            
            if(sesion.getAttribute("usuario") !=null ){
                empresa= sesion.getAttribute("usuario").toString();
                int empresaint = Integer.parseInt(empresa); 
                //nivel = sesion.getAttribute("nivel").toString();
            
            Operaciones op = new Operaciones();
        
           if(request.getParameter("BotonOferta") != null){
           Boolean inserto = false;
           String   nomOferta = request.getParameter("txtOferta");
           String   descOferta = request.getParameter("txtDescOferta");
           String   tipPerfil = request.getParameter("selecttxtPerfil");
           String   suel = request.getParameter("txtSueldo");
           
           
            inserto = op.registroOfertas(empresaint,nomOferta,descOferta,tipPerfil,suel);
           
            if(inserto == true){
            out.write("Oferta creada Exitosamente");
            
            }else{
            out.write("Hubo un error creando la Oferta");
            
            }
            
            
        }
           }
        
        
        
      out.write("\n");
      out.write("        <footer>\n");
      out.write("        <td height=\"38\" colspan=\"2\" class=\"barra_delgada\"><div align=\"center\">\n");
      out.write("                <p align=\"left\"><img src=\"img/sena.jpg\" id=\"miImagen\" width=\"60\" height=\"50\" align=\"left\" ><a href=\"http://oferta.senasofiaplus.edu.co/sofia-oferta/\" style=\"color:#FFFFFF;\">SENA</a></img> </p> &nbsp &nbsp &nbsp &nbsp <p align=\"left\"><img src=\"img/Escud.png\" id=\"miImagen\" width=\"110\" height=\"50\" align=\"left\"> <a href=\"https://www.mintrabajo.gov.co/web/guest/inicio\" style=\"color:#FFFFFF;\">Min Trabajo</a></img> </p>\n");
      out.write("        </td>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("        \n");
      out.write("</html>\n");
      out.write("\n");
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
