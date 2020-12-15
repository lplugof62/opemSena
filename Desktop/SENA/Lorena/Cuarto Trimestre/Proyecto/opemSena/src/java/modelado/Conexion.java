/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

import java.sql.*;


/**
 * Clase que permite conectar con la base de datos
 * @author
 *
 */

public class Conexion {
   static String bd = "mybd";
   static String login = "root";
   static String password = "1234";
   static String url = "jdbc:mysql://localhost/"+bd+"?serverTimezone=UTC"; 
   private String mensaje;
   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.cj.jdbc.Driver");
         //obtenemos la conexi�n
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            mensaje="Conexión a base de datos "+bd+" OK";
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
   /*Permite retornar la conexi�n*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}