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
        
        <form action="RegistroUsuarios.jsp" method="POST" class="login" onSubmit="return validarfor();">
            <fieldset>
            <img src="img/Logo.jpg" id="miImagen" width="350" height="100">
            <h3 class="text-center">Registro Usuario</h3>
            <div class="form-group">
             <label for="txtcreacionUsuario" >Usuario:</label>
             <input type="text" name="txtcreacionUsuario" id="txtcreacionUsuario" placeholder="Escriba su Numero de documento o nit"></input><br></br>
             </div>
            <div class="form-group">
            <label for="selectTipoDocumento" >Tipo de Documento:</label>
            <select name="selectTipoDocumento" id="selectTipoDocumento">
                                 <option value="" selected></option> 
                                <option value="CC">Cedula Ciudadania</option> 
                                <option value="CE">Cedula Extranjeria</option>
                                <option value="TI">Tarjeta Identidad</option>
                                <option value="PA">Pasaporte</option>
                              </select><br></br>
            </div>
            <div class="form-group">
             <label for="txtNombre">Nombre:</label>
             <input type="text" name="txtNombre" id="txtNombre" placeholder="Escriba su nombre"></input><br></br>
             </div>
             <div class="form-group">
             <label for="txtApellido">Apellido:</label>
             <input type="text" name="txtApellido" id="txtApellido" placeholder="Escriba su Apellido"></input><br></br>
             </div>
            

            <div class="form-group">
            <label for="txtcreacionContra" >Contraseña:</label> 
            <input type="password" name="txtcreacionContra" id="txtcreacionContra" placeholder="Escriba su contraseña"></input><br></br>
            </div>
            <label for="txtcreacionContraConfirma" >Confirmar:</label> 
            <input type="password" name="txtcreacionContraConfirma" id="txtcreacionContraConfirma" placeholder="Confirme su contraseña"></input><br></br>
            </div>
             <div class="form-group">
           <label for="txtCorreo" >Correo:</label> 
           <input type="text" name="txtCorreo" id="txtCorreo" placeholder="Escriba su correo Electronico"></input> 
            </div>
            <div class="form-group">
            <label for="txtTelefono" >Telefono:</label>
            <input type="text" name="txtTelefono" id="txtTelefono" placeholder="Escriba su Telefono"></input>
            </div>
       
            <p class="text-center">
                <button  type="button" class="btn btn-primary btn-block" name="linksArchivos" id="linksArchivos" title="Subir soportes"  value="Subir Soportes" onclick="setTimeout(abrirVentana(), 3000);">Subir Documentos</button >
                <input  type="submit"  class="btn btn-primary btn-block" name="BotonRegistroUsuario" value="Registrar" onclick="Registro();"></input> 
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
    
        var correo = document.getElementById("txtCorreo").value; 
        var user = document.getElementsByName("txtcreacionUsuario")[0].value;
        var nom = document.getElementsByName("txtNombre")[0].value;
        var ape = document.getElementsByName("txtApellido")[0].value;
        var tipDocu = document.getElementsByName("selectTipoDocumento")[0].value;
        var contra = document.getElementsByName("txtcreacionContra")[0].value;
        var tel = document.getElementsByName("txtTelefono")[0].value;
        var tipUser =  document.getElementsByName("TipoUsuario")[0].value;
        var confirm = document.getElementsByName("txtcreacionContraConfirma")[0].value;
        //var coment = document.getElementsByName("comentarios")[0].value;
    
        var expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    
        if(user == ""){
            alert("El campo Usuario no debe estar vacio");
            return false;
        }
        
          if(nom == ""){
             alert("El campo Nombre  no debe estar vacio");
              return false;
        }
          if(ape == ""){
             alert("El campo Apellido  no debe estar vacio");
              return false;
        }
           if(tipDocu == "" ){
             alert("El campo Tipo de documento  no debe estar vacio");
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
         if(tipUser == "" ){
             alert("El campo tipo de usuario  no debe estar vacio");
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
        
           if(request.getParameter("BotonRegistroUsuario") != null){
           Boolean inserto = false;
           String   usuario = request.getParameter("txtcreacionUsuario");
           String   nombre = request.getParameter("txtNombre");
           String   tipDocu = request.getParameter("selectTipoDocumento");
           String   contra = request.getParameter("txtcreacionContra");
           String   correo = request.getParameter("txtCorreo");
           String   tel = request.getParameter("txtTelefono");
           int niveluser = 2;
           String apellido = request.getParameter("txtApellido");
           
            
            inserto = op.registroUsuario(usuario,nombre,tipDocu,contra,correo,tel,niveluser,apellido);
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

