package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.fileupload.FileItem;
import java.util.List;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import java.io.*;
import modelado.Operaciones;

public final class RegistroEmpresa_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<?xml version='1.0' encoding='UTF-8' ?>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\"></meta>\n");
      out.write("        <title>Registro</title>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/EstilosRegistro.css\" type=\"text/css\"></link>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/bootstrap.min.css\" type=\"text/css\"></link>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/normalize.min.css\" type=\"text/css\"></link>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"RegistroEmpresa.jsp\" method=\"POST\" class=\"login\" onSubmit=\"return validarfor();\">\n");
      out.write("            <fieldset>\n");
      out.write("            <img src=\"img/Logo.jpg\" id=\"miImagen\" width=\"350\" height=\"100\">\n");
      out.write("            <h3 class=\"text-center\">Registro Empresa</h3>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("             <label for=\"txtcreacionNit\" >Nit Empresa:</label>\n");
      out.write("             <input type=\"text\" name=\"txtcreacionNit\" id=\"txtcreacionNit\" placeholder=\"Escriba su Numero de nit\"></input><br></br>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("             <label for=\"txtNomEmpresa\">Nombre Empresa:</label>\n");
      out.write("             <input type=\"text\" name=\"txtNomEmpresa\" id=\"txtNomEmpresa\" placeholder=\"Escriba su Nombre de Empresa\"></input><br></br>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("             <label for=\"txtDireccionEmpresa\">Direccion Empresa:</label>\n");
      out.write("             <input type=\"text\" name=\"txtDireccionEmpresa\" id=\"txtDireccionEmpresa\" placeholder=\"Escriba la Direccion\"></input><br></br>\n");
      out.write("             </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"txtcreacionContra\" >Contraseña:</label> \n");
      out.write("            <input type=\"password\" name=\"txtcreacionContra\" id=\"txtcreacionContra\" placeholder=\"Escriba su contraseña\"></input><br></br>\n");
      out.write("            </div>\n");
      out.write("            <label for=\"txtcreacionContraConfirma\" >Confirmar:</label> \n");
      out.write("            <input type=\"password\" name=\"txtcreacionContraConfirma\" id=\"txtcreacionContraConfirma\" placeholder=\"Confirme su contraseña\"></input><br></br>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("           <label for=\"txtCorreo\" >Correo Empresa:</label> \n");
      out.write("           <input type=\"text\" name=\"txtCorreo\" id=\"txtCorreo\" placeholder=\"Escriba su correo Electronico\"></input> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"txtTelefono\" >Telefono Empresa:</label>\n");
      out.write("            <input type=\"text\" name=\"txtTelefono\" id=\"txtTelefono\" placeholder=\"Escriba su Telefono\"></input>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <p class=\"text-center\">\n");
      out.write("                <button  type=\"button\" class=\"btn btn-primary btn-block\" name=\"linksArchivos\" id=\"linksArchivos\" title=\"Subir soportes\"  value=\"Subir Soportes\" onclick=\"setTimeout(abrirVentana(), 3000);\">Subir Documentos</button >\n");
      out.write("                <input  type=\"submit\"  class=\"btn btn-primary btn-block\" name=\"BotonRegistroEmpresa\" value=\"Registrar\" onclick=\"Registro();\"></input> \n");
      out.write("                <input  type=\"button\"  class=\"btn btn-primary btn-block\" name=\"BotonRegresoLogin\" value=\"Volver a Inicio de sesion\" onclick=\"redirect();\"></input> \n");
      out.write("            </p>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("    function abrirVentana(){\n");
      out.write("   ventana=window.open ('http://localhost:8084/OPEMSENA1/AnexarDocumentos.jsp','ventana_sec','scrollbars=no,status=no,resizable=yes,toolbars=0,location=0,directories=0,menubar=0,width=400,height=350');\n");
      out.write("   ventana.document.open();\n");
      out.write("}   \n");
      out.write("    \n");
      out.write("        function redirect(){\n");
      out.write("        window.location.replace('http://localhost:8084/OPEMSENA1/index.jsp'); \n");
      out.write("       }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        function validarfor(){\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        var nit = document.getElementsByName(\"txtcreacionNit\")[0].value;\n");
      out.write("        var nom = document.getElementsByName(\"txtNomEmpresa\")[0].value;\n");
      out.write("        var direccion = document.getElementsByName(\"txtDireccionEmpresa\")[0].value;\n");
      out.write("        var contra = document.getElementsByName(\"txtcreacionContra\")[0].value;\n");
      out.write("        var correo = document.getElementById(\"txtCorreo\").value; \n");
      out.write("        var tel = document.getElementsByName(\"txtTelefono\")[0].value;\n");
      out.write("        var confirm = document.getElementsByName(\"txtcreacionContraConfirma\")[0].value;\n");
      out.write("        //var coment = document.getElementsByName(\"comentarios\")[0].value;\n");
      out.write("    \n");
      out.write("        var expr = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("    \n");
      out.write("        if(nit == \"\"){\n");
      out.write("            alert(\"El campo Nit no debe estar vacio\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("          if(nom == \"\"){\n");
      out.write("             alert(\"El campo Nombre  no debe estar vacio\");\n");
      out.write("              return false;\n");
      out.write("        }\n");
      out.write("          if(direccion == \"\"){\n");
      out.write("             alert(\"El campo Direccion  no debe estar vacio\");\n");
      out.write("              return false;\n");
      out.write("        }\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        if(contra == \"\" ){\n");
      out.write("             alert(\"El campo contraseña  no debe estar vacio\");\n");
      out.write("              return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("         if(correo == \"\"){\n");
      out.write("         alert(\"El campo correo no debe estar vacio\");\n");
      out.write("           return false;\n");
      out.write("         }\n");
      out.write("       \n");
      out.write("         if(tel == \"\"){\n");
      out.write("            alert(\"El campo telefono no debe estar vacio\");\n");
      out.write("             return false;\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        if(confirm == contra){\n");
      out.write("           // return true;\n");
      out.write("        }else{\n");
      out.write("            alert(\"La contraseña no coincide\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        if (!expr.test(correo)){                                                            //COMPRUEBA MAIL\n");
      out.write("        alert(\"Error: La dirección de correo \" + correo + \" es incorrecta.\");\n");
      out.write("        return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

             HttpSession sesion = request.getSession();                              
            String empresa;
           
            if(sesion.getAttribute("usuario") !=null){
                empresa= sesion.getAttribute("usuario").toString();
                int empresaint = Integer.parseInt(empresa); 
                //nivel = sesion.getAttribute("nivel").toString();
            
            Operaciones op = new Operaciones();
        
           if(request.getParameter("BotonRegistroEmpresa") != null){
           Boolean inserto = false;
           String   nit = request.getParameter("txtcreacionNit");
           String   nombreEmpresa = request.getParameter("txtNomEmpresa");
           String   direccion = request.getParameter("txtDireccionEmpresa");
           String   contra = request.getParameter("txtcreacionContra");
           String   correo = request.getParameter("txtCorreo");
           String   tel = request.getParameter("txtTelefono");
           int  niveluser = 3;
           inserto = op.registroEmpresa(empresaint,nombreEmpresa,nit,direccion,correo,tel,contra,niveluser);
           
            if(inserto == true){
            out.write("Usuario creado Exitosamente");
            sesion.setAttribute("inserto", inserto);
            response.sendRedirect("index.jsp");
            }else{
            out.write("Error en proceso de insercion");
            sesion.setAttribute("inserto", inserto); 
            response.sendRedirect("index.jsp");
            }
            
            
        }
         if(request.getParameter("BotonRegresoLogin") != null){
        
            response.sendRedirect("index.jsp");
        }
        
        
        
            }
        
        
        
      out.write("\n");
      out.write("        <footer>\n");
      out.write("        <td height=\"38\" colspan=\"2\" class=\"barra_delgada\"><div align=\"center\">\n");
      out.write("               <p><a href=\"http://oferta.senasofiaplus.edu.co/sofia-oferta/\" style=\"color:#FFFFFF;\">SENA</a>&nbsp &nbsp &nbsp &nbsp  <a href=\"https://www.mintrabajo.gov.co/web/guest/inicio\" style=\"color:#FFFFFF;\">Min Trabajo</a></p>\n");
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
