<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="modelado.Operaciones"%>
<%@page session="true"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"></meta>
        <title>Aprobacion de Ofertas</title>
        <link rel="stylesheet"  href="css/EstilosRevisionOfertas.css" type="text/css"></link>
        <link rel="stylesheet"  href="css/bootstrap.min.css" type="text/css"></link>
        <link rel="stylesheet"  href="css/normalize.min.css" type="text/css"></link>
        
    </head>
    <body>
 
        <script>
                 function validarfor(){
    
        var nom = document.getElementById("txtOferta").value; 
        var desc = document.getElementsByName("txtDescOferta")[0].value;
       
        
        //var coment = document.getElementsByName("comentarios")[0].value;
    
       
        if(nom == ""){
            alert("El campo Nombre Oferta no debe estar vacio");
            return false;
        }
        
          if(desc == ""){
             alert("El campo Descripcion  no debe estar vacio");
              return false;
        }
     
        
    
       
    }
     function redirect(){
        window.location.replace('http://localhost:8084/OPEMSENA1/indexUserEmpresa.jsp'); 
       }
       
        </script>
        <form action="RevisionOfertas.jsp" method="POST" class="login" onSubmit="return validarfor();">
            <fieldset>
            <img src="img/Logo.jpg" id="miImagen" width="350" height="100">
            <h3 class="text-center">Consulta Oferta</h3>
            <div class="form-group">
                <label for="txtOferta" >Nombre Oferta:</label>
            <input type="text" name="txtOferta" id="txtOferta" placeholder="Escriba Nom Oferta"></input><br></br>
             </div>
            <div class="form-group">
            <label for="txtDescOferta" >Descripcion Oferta:</label>             
            <p><textarea  name="txtDescOferta" id="txtDescOferta" placeholder="Descripcion de la Oferta"></textarea></p><br></br>
            </div>
            
           
            <p class="text-center">
            <input  type="submit"  class="btn btn-primary btn-block" name="BotonConsulta" value="Consultar Ofertas"></input><br></br>  
            <input  type="button"  class="btn btn-primary btn-block" name="Volver" value="Volver al Menu" onclick="redirect();"></input><br></br>  
            </p>
        </fieldset>
        </form>
        <script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
        <%
            Operaciones op = new Operaciones();
        
           if(request.getParameter("BotonConsulta") != null){
           Boolean inserto = false;
           String   nomOferta = request.getParameter("txtOferta");
           String   descOferta = request.getParameter("txtDescOferta");
          
           
           
            inserto = op.ConsultaDatosOferta(nomOferta,descOferta);
           
            if(inserto == true){
            out.write("Oferta creada Exitosamente");
            
            }else{
            out.write("Hubo un error creando la Oferta");
            
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

