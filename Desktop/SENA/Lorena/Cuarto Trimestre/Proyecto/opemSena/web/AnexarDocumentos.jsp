<%-- 
    Document   : AnexarDocumentos
    Created on : 28/10/2020, 03:59:48 PM
    Author     : juanf
--%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet"  href="css/EstilosLogin.css" type="text/css"></link>
<link rel="stylesheet"  href="css/bootstrap.min.css" type="text/css"></link>
<link rel="stylesheet"  href="css/normalize.min.css" type="text/css"></link>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Anexar</title>
    </head>
    <body>
        <form action="AnexarDocumentos.jsp" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>
                        <input class="btn btn-primary btn-block" type="file" name="file"/>
                        <input type="submit" class="btn btn-primary btn-block" value="SUBIR ARCHIVO"/>
                        <button onclick="cerrar();" class="btn btn-primary btn-block">Cerrar Ventana</button>
                    </td>
                </tr>
            </table>
        </form>
        <script>
            function cerrar(){
                
                window.close();
            }
            
        </script>
       <% String archivourl = "C:\\Users\\juanf\\OneDrive\\Documents\\NetBeansProjects\\OPEMSENA1\\files";
            
            DiskFileItemFactory factory = new DiskFileItemFactory();
            
            factory.setSizeThreshold(1024);
            
            factory.setRepository(new File(archivourl));
            
            ServletFileUpload upload = new ServletFileUpload(factory);
            
            
            try{
                
                List<FileItem> partes = upload.parseRequest(request);
                
                for(FileItem items: partes){
                    File file = new File(archivourl,items.getFieldName());
                    items.write(file);
                }
                
                out.print("<h2>ARCHIVO CORRECTAMENTE SUBIDO.....</h2>"+"\n\n");
                
            }catch(Exception e){
                //out.print("Exception: "+e.getMessage()+"");
            } 
            %>
    </body>
</html>
