package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelado.Operaciones;

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
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/EstilosLogin.css\" type=\"text/css\"></link>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/bootstrap.min.css\" type=\"text/css\"></link>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/normalize.min.css\" type=\"text/css\"></link>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession sesion = request.getSession();
            String insertU;
            String insp;
        
            if(sesion.getAttribute("inserto") !=null){
            insertU= sesion.getAttribute("inserto").toString();
            
            if(insertU.equals("true")){
            out.print("Usuario creado Exitosamente");
            }else{
            out.print("Usuario NO creado ");
            }
            
            
            
            
            }
           
        
      out.write("\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("        function validarfor(){\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        var user = document.getElementsByName(\"txtUsuario\")[0].value;\n");
      out.write("        var contra = document.getElementsByName(\"txtContra\")[0].value;\n");
      out.write("        \n");
      out.write("       var tipo1 = document.getElementById('TipoUsuario1').checked\n");
      out.write("       var tipo2 = document.getElementById('TipoUsuario2').checked\n");
      out.write("       var tipo3 = document.getElementById('TipoUsuario3').checked\n");
      out.write("       \n");
      out.write("        if(user == \"\"){\n");
      out.write("            alert(\"El campo Usuario no debe estar vacio\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("          if(contra == \"\"){\n");
      out.write("             alert(\"El campo contraseña  no debe estar vacio\");\n");
      out.write("              return false;\n");
      out.write("        }\n");
      out.write("         \n");
      out.write("        if (tipo1 == false && tipo2 == false && tipo3 == false ) {\n");
      out.write("            alert('Debe seleccionar un .');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        else {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("          \n");
      out.write("        \n");
      out.write("      \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <form action=\"index.jsp\" method=\"POST\" class=\"login\">\n");
      out.write("            <fieldset>\n");
      out.write("            <img src=\"img/Logo.jpg\" id=\"miImagen\" width=\"350\" height=\"100\">\n");
      out.write("            <h3 class=\"text-center\">Inicio de sesión</h3>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtUsuario\" >Usuario:</label>\n");
      out.write("            <input type=\"text\" name=\"txtUsuario\" id=\"textoUsuario\" placeholder=\"Escriba su usuario\"></input><br></br>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"txtContra\" >Contraseña:</label>  \n");
      out.write("            <input type=\"password\" name=\"txtContra\" id=\"textoUsuario1\" placeholder=\"Escriba su contraseña\"></input><br></br>\n");
      out.write("            </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("            <p>\n");
      out.write("\n");
      out.write("            <label for=\"TipoUsuariotxt\">Tipo Usuario:</label>\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"TipoUsuario2\" id=\"TipoUsuario2\" value=\"2\" onmousedown=\"this.c=this.checked\" onclick=\"if (this.c) { this.checked = false }\"> Egresado\n");
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"TipoUsuario3\" id=\"TipoUsuario3\" value=\"3\" onmousedown=\"this.c=this.checked\" onclick=\"if (this.c) { this.checked = false }\"> Empresa\n");
      out.write("            \n");
      out.write("            <input type=\"radio\" name=\"TipoUsuario1\" id=\"TipoUsuario1\" value=\"1\" onmousedown=\"this.c=this.checked\" onclick=\"if (this.c) { this.checked = false }\"> Admin<br>\n");
      out.write("            \n");
      out.write("            </p>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"text-center\">\n");
      out.write("                <input  type=\"submit\"  class=\"btn btn-primary btn-block\" name=\"Botoningreso\" value=\"Iniciar Sesion\"  onclick=\"return validarfor();\"></input><br></br>  \n");
      out.write("            \n");
      out.write("            <input  type=\"submit\"  class=\"btn btn-primary btn-block\" name=\"BotonRegistro\" value=\"Registro Egresado\"></input> <br></br>\n");
      out.write("            \n");
      out.write("            <input  type=\"submit\"  class=\"btn btn-primary btn-block\" name=\"BotonRegistroEmpresa\" value=\"Registro Empresa\"></input> <br></br>\n");
      out.write("            </p>\n");
      out.write("        </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        ");

         Operaciones op = new Operaciones();
        if(request.getParameter("BotonRegistroEmpresa") != null){
           response.sendRedirect("RegistroEmpresa.jsp");
        }
        if(request.getParameter("BotonRegistro") != null){
        
            response.sendRedirect("RegistroUsuarios.jsp");
        }
        
         if(request.getParameter("Botoningreso") != null){
        String nombre = request.getParameter("txtUsuario");
        String contra = request.getParameter("txtContra");
        String tipoUsuario2 = request.getParameter("TipoUsuario2");
         String tipoUsuario1 = request.getParameter("TipoUsuario1");
          String tipoUsuario3 = request.getParameter("TipoUsuario3");
          String tipoUsuario = "";
          if(tipoUsuario2 != null){
          tipoUsuario = tipoUsuario2 ;
          }
           if(tipoUsuario1 != null){
          tipoUsuario = tipoUsuario1 ;
          }
           if(tipoUsuario3 != null){
          tipoUsuario = tipoUsuario3 ;
          }
        
        if(tipoUsuario.equals("3")){
        
            
            
             switch(op.loguearEmpresa(nombre,contra)){
            case 1:  
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "1");
                response.sendRedirect("IndexMain.jsp");
           break; 
               
            
                case 2:
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "2");
                response.sendRedirect("IndexUser.jsp");
           break;
           case 3:
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "3");
                response.sendRedirect("indexUserEmpresa.jsp");
           break;
            default:
                out.write("Usuario no exite , o contraseña invalida");
                break;
             
        }
        
        }else if(tipoUsuario.equals("2")){
             switch(op.loguear(nombre,contra)){
                case 1:  
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "1");
                response.sendRedirect("IndexMain.jsp");
             break; 
               
            
                case 2:
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "2");
                response.sendRedirect("IndexUser.jsp");
            break;
             case 3:
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "3");
                response.sendRedirect("indexUserEmpresa.jsp");
             break;
            default:
                out.write("Usuario no exite , o contraseña invalida");
                break;
             
        }
        
        
        }else{
        
        
        switch(op.loguear(nombre,contra)){
                case 1:  
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "1");
                response.sendRedirect("IndexMain.jsp");
             break; 
               
            
                case 2:
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "2");
                response.sendRedirect("IndexUser.jsp");
            break;
             case 3:
                sesion.setAttribute("usuario", nombre);
                sesion.setAttribute("nivel", "3");
                response.sendRedirect("indexUserEmpresa.jsp");
             break;
            default:
                out.write("Usuario no exite , o contraseña invalida");
                break;
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
