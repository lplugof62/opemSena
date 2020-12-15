<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page import="java.io.*" %>
<%@page import="modelado.Operaciones"%>
<%@page session="true"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"></meta>
        <title>Registro</title>
        <link rel="stylesheet"  href="css/EstilosRegistro.css" type="text/css"></link>
        <link rel="stylesheet"  href="css/bootstrap.min.css" type="text/css"></link>
        <link rel="stylesheet"  href="css/normalize.min.css" type="text/css"></link>
        
    </head>
    <body>
        
        <form action="RegistroEmpresa.jsp" method="POST" class="login" onSubmit="return validarfor();">
            <fieldset>
            <img src="img/Logo.jpg" id="miImagen" width="350" height="100">
            <h3 class="text-center">Registro Empresa</h3>
            <div class="form-group">
             <label for="txtcreacionNit" >Nit Empresa:</label>
             <input type="text" name="txtcreacionNit" id="txtcreacionNit" placeholder="Escriba su Numero de nit"></input><br></br>
             </div>
             <div class="form-group">
             <label for="txtNomEmpresa">Nombre Empresa:</label>
             <input type="text" name="txtNomEmpresa" id="txtNomEmpresa" placeholder="Escriba su Nombre de Empresa"></input><br></br>
             </div>
             <div class="form-group">
             <label for="txtDireccionEmpresa">Direccion Empresa:</label>
             <input type="text" name="txtDireccionEmpresa" id="txtDireccionEmpresa" placeholder="Escriba la Direccion"></input><br></br>
             </div>
            

            <div class="form-group">
            <label for="txtcreacionContra" >Contraseña:</label> 
            <input type="password" name="txtcreacionContra" id="txtcreacionContra" placeholder="Escriba su contraseña"></input><br></br>
            </div>
            <label for="txtcreacionContraConfirma" >Confirmar:</label> 
            <input type="password" name="txtcreacionContraConfirma" id="txtcreacionContraConfirma" placeholder="Confirme su contraseña"></input><br></br>
            </div>
             <div class="form-group">
           <label for="txtCorreo" >Correo Empresa:</label> 
           <input type="text" name="txtCorreo" id="txtCorreo" placeholder="Escriba su correo Electronico"></input> 
            </div>
            <div class="form-group">
            <label for="txtTelefono" >Telefono Empresa:</label>
            <input type="text" name="txtTelefono" id="txtTelefono" placeholder="Escriba su Telefono"></input>
            </div>
            
            <p class="text-center">
                <button  type="button" class="btn btn-primary btn-block" name="linksArchivos" id="linksArchivos" title="Subir soportes"  value="Subir Soportes" onclick="setTimeout(abrirVentana(), 3000);">Subir Documentos</button >
                <input  type="submit"  class="btn btn-primary btn-block" name="BotonRegistroEmpresa" value="Registrar" onclick="Registro();"></input> 
                <input  type="button"  class="btn btn-primary btn-block" name="BotonRegresoLogin" value="Volver a Inicio de sesion" onclick="redirect();"></input> 
            </p>
            </fieldset>
        </form>
        <script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
        <script>
    function abrirVentana(){
   ventana=window.open ('http://localhost:8084/OPEMSENA1/AnexarDocumentos.jsp','ventana_sec','scrollbars=no,status=no,resizable=yes,toolbars=0,location=0,directories=0,menubar=0,width=400,height=350');
   ventana.document.open();
}   
    
        function redirect(){
        window.location.replace('http://localhost:8084/OPEMSENA1/index.jsp'); 
       }
        
        
        function validarfor(){
    
    
        var nit = document.getElementsByName("txtcreacionNit")[0].value;
        var nom = document.getElementsByName("txtNomEmpresa")[0].value;
        var direccion = document.getElementsByName("txtDireccionEmpresa")[0].value;
        var contra = document.getElementsByName("txtcreacionContra")[0].value;
        var correo = document.getElementById("txtCorreo").value; 
        var tel = document.getElementsByName("txtTelefono")[0].value;
        var confirm = document.getElementsByName("txtcreacionContraConfirma")[0].value;
        //var coment = document.getElementsByName("comentarios")[0].value;
    
        var expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    
        if(nit == ""){
            alert("El campo Nit no debe estar vacio");
            return false;
        }
        
          if(nom == ""){
             alert("El campo Nombre  no debe estar vacio");
              return false;
        }
          if(direccion == ""){
             alert("El campo Direccion  no debe estar vacio");
              return false;
        }
          
        
        if(contra == "" ){
             alert("El campo contraseña  no debe estar vacio");
              return false;
        }
        
         if(correo == ""){
         alert("El campo correo no debe estar vacio");
           return false;
         }
       
         if(tel == ""){
            alert("El campo telefono no debe estar vacio");
             return false;
         }
         
        
        if(confirm == contra){
           // return true;
        }else{
            alert("La contraseña no coincide");
            return false;
        }
        
        if (!expr.test(correo)){                                                            //COMPRUEBA MAIL
        alert("Error: La dirección de correo " + correo + " es incorrecta.");
        return false;
        }
        
    }
        
        </script>
        
        
        <%
            
  
            Operaciones op = new Operaciones();
        
           if(request.getParameter("BotonRegistroEmpresa") != null){
           Boolean inserto = false;
           String   nit = request.getParameter("txtcreacionNit");
           int empresaint = Integer.parseInt(nit);
           String   nombreEmpresa = request.getParameter("txtNomEmpresa");
           String   direccion = request.getParameter("txtDireccionEmpresa");
           String   contra = request.getParameter("txtcreacionContra");
           String   correo = request.getParameter("txtCorreo");
           String   tel = request.getParameter("txtTelefono");
           int  niveluser = 3;
           inserto = op.registroEmpresa(empresaint,nombreEmpresa,nit,direccion,correo,tel,contra,niveluser);
            HttpSession sesion = request.getSession();
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
        
        
        
            
        
        
        %>
        <footer>
        <td height="38" colspan="2" class="barra_delgada"><div align="center">
               <p><a href="http://oferta.senasofiaplus.edu.co/sofia-oferta/" style="color:#FFFFFF;">SENA</a>&nbsp &nbsp &nbsp &nbsp  <a href="https://www.mintrabajo.gov.co/web/guest/inicio" style="color:#FFFFFF;">Min Trabajo</a></p>
        </td>
        </footer>
        
    </body>
        
</html>

