<%-- 
    Document   : IndexMain
    Created on : 24/10/2020, 07:23:21 PM
    Author     : juanf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>  
		<title>Menu Desplegable</title>
		<style type="text/css">
			
			* {
				margin:0px;
				padding:0px;
			}
			
			#header {
				margin:auto;
				width:2000px;
				font-family:Arial, Helvetica, sans-serif;
			}
			
			ul, ol {
				list-style:none;
			}
			
			.nav > li {
				float:left;
			}
			
			.nav li a {
				background-color:#FF5733;
				color:#fff;
				text-decoration:none;
				padding:10px 12px;
				display:block;
			}
			
			.nav li a:hover {
				background-color:#F18654;
			}
			
			.nav li ul {
				display:none;
				position:absolute;
				min-width:140px;
			}
			
			.nav li:hover > ul {
				display:block;
			}
			
			.nav li ul li {
				position:relative;
			}
			
			.nav li ul li ul {
				right:-140px;
				top:0px;
			}
			.barra_delgada {
                            font-size: 8px;
                        }
		</style>
	</head>
	<body>
	<%
            HttpSession sesion = request.getSession();                              
            String usuario;
            String nivel;
        
            if(sesion.getAttribute("usuario") !=null && sesion.getAttribute("nivel") !=null){
                usuario= sesion.getAttribute("usuario").toString();
                nivel = sesion.getAttribute("nivel").toString();
            }
        
        
        
        %>	
        
        <div id="content">
            <img src="img/Logo.jpg" alt="" width="350" height="100"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <img src="img/sena.jpg"  width="350" height="100"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <img src="img/Escud.png"  width="350" height="100"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </div>   
        <div id="header">
			<ul class="nav">
                                
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li> 
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a>
                                </li> <li><a href="IndexMain.jsp">Inicio</a></li>
				<li><a href="">Servicios Administrador</a>
					<ul>
					     <li><a href="RevisionOfertas.jsp">Publicaciones/Ofertas Empresas</a></li>
					     <li><a href="">Casos Estudiantes</a></li>   
                                             <li><a href="CreacionAdmin.jsp">Ingresar Nuevos Administradores</a></li>
                                        </ul>
				</li>
				<li><a href="">Acerca de</a>
					<ul>
						<li><a href="">Proceso de Aprobacion Empresa</a></li>
						<li><a href="">Procesos de Reportar Egresados</a></li>
						<li><a href="">Proceso Asignar Administrador</a></li>
						
					</ul>
				</li>
				<li><a href="">Otras Apliaciones</a>
                                <ul>
						<li><a href="">Territorium</a></li>
						<li><a href="http://oferta.senasofiaplus.edu.co/sofia-oferta/">Sena Sofia</a></li>
						<li><a href="https://www.mintrabajo.gov.co/web/guest/inicio">Ministerio de trabajo</a></li>						
			        </ul> 
                                </li>
                                <li><a href="index.jsp">Salir</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>    
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>    
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>
                                <li><a href="">&nbsp;</a></li>     
			</ul>
		</div>
	
        
        
        
        </body>
</html>
