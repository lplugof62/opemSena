<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="modelado.Operaciones"%>
<%@page session="true"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"></meta>
        <title>Login</title>
        <link rel="stylesheet"  href="css/EstilosLogin.css" type="text/css"></link>
        <link rel="stylesheet"  href="css/bootstrap.min.css" type="text/css"></link>
        <link rel="stylesheet"  href="css/normalize.min.css" type="text/css"></link>
        
    </head>
    <body>
        <%
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
           
        %>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script>
            
        function validarfor(){
    
    
        var user = document.getElementsByName("txtUsuario")[0].value;
        var contra = document.getElementsByName("txtContra")[0].value;
        
       var tipo1 = document.getElementById('TipoUsuario1').checked
       var tipo2 = document.getElementById('TipoUsuario2').checked
       var tipo3 = document.getElementById('TipoUsuario3').checked
       
        if(user == ""){
            alert("El campo Usuario no debe estar vacio");
            return false;
        }
        
          if(contra == ""){
             alert("El campo contraseña  no debe estar vacio");
              return false;
        }
         
        if (tipo1 == false && tipo2 == false && tipo3 == false ) {
            alert('Debe seleccionar un .');
            return false;
        }

        else {
            return true;
        }
        
          
        
      
    }
    
    

            

        </script>
        <form action="index.jsp" method="POST" class="login">
            <fieldset>
            <img src="img/Logo.jpg" id="miImagen" width="350" height="100">
            <h3 class="text-center">Inicio de sesión</h3>
            <div class="form-group">
                <label for="txtUsuario" >Usuario:</label>
            <input type="text" name="txtUsuario" id="textoUsuario" placeholder="Escriba su usuario"></input><br></br>
             </div>
            <div class="form-group">
            <label for="txtContra" >Contraseña:</label>  
            <input type="password" name="txtContra" id="textoUsuario1" placeholder="Escriba su contraseña"></input><br></br>
            </div>
                 <div class="form-group">
            <p>

            <label for="TipoUsuariotxt">Tipo Usuario:</label>

            <input type="radio" name="TipoUsuario2" id="TipoUsuario2" value="2" onmousedown="this.c=this.checked" onclick="if (this.c) { this.checked = false }"> Egresado

            <input type="radio" name="TipoUsuario3" id="TipoUsuario3" value="3" onmousedown="this.c=this.checked" onclick="if (this.c) { this.checked = false }"> Empresa
            
            <input type="radio" name="TipoUsuario1" id="TipoUsuario1" value="1" onmousedown="this.c=this.checked" onclick="if (this.c) { this.checked = false }"> Admin<br>
            
            </p>
            </div>
            <p class="text-center">
                <input  type="submit"  class="btn btn-primary btn-block" name="Botoningreso" value="Iniciar Sesion"  onclick="return validarfor();"></input><br></br>  
            
            <input  type="submit"  class="btn btn-primary btn-block" name="BotonRegistro" value="Registro Egresado"></input> <br></br>
            
            <input  type="submit"  class="btn btn-primary btn-block" name="BotonRegistroEmpresa" value="Registro Empresa"></input> <br></br>
            </p>
        </fieldset>
        </form>
        <script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
        <%
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
        
        %>
        <footer>
        <td height="38" colspan="2" class="barra_delgada"><div align="center">
                <p align="left"><img src="img/sena.jpg" id="miImagen" width="60" height="50" align="left" ><a href="http://oferta.senasofiaplus.edu.co/sofia-oferta/" style="color:#FFFFFF;">SENA</a></img> </p> &nbsp &nbsp &nbsp &nbsp <p align="left"><img src="img/Escud.png" id="miImagen" width="110" height="50" align="left"> <a href="https://www.mintrabajo.gov.co/web/guest/inicio" style="color:#FFFFFF;">Min Trabajo</a></img> </p>
        </td>
        </footer>
        
    </body>
        
</html>

