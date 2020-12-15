/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;


import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author juanf
 */
public class Operaciones {
    String driver;
    String url;
    String uss;
    String contra;
     public static int id = 1;
     public static int idEmpresa = 1;
     private HttpSession session;
    
    public Operaciones(){
    driver= "com.mysql.jdbc.Driver";
    url="jdbc:mysql://localhost/mydb";
    uss="root";
    contra="1234";
    }
    
    public int loguear(String usuario,String contra){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        int nivel = 0;
        EncriptadorAES encriptador = new EncriptadorAES(); 
       
        try {
            
             String encriptado = encriptador.encriptar(contra, contra);
       
             String sql= "select nivel from usuarios where idUsuarios  ='" + usuario + "' and contraseña = '"+encriptado+ "'";
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                nivel = rs.getInt(1);  
            }
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return nivel;
    }
    
    
    public int loguearEmpresa(String usuario,String contra){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        int nivel = 0;
        EncriptadorAES encriptador = new EncriptadorAES(); 
       
        try {
            
             String encriptado = encriptador.encriptar(contra, contra);
       
             String sql= " select nivel from empresas where Nit_Empresa  ='" + usuario + "' and contraseña = '"+encriptado+ "'";
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                nivel = rs.getInt(1);  
            }
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return nivel;
    }
    
    public boolean registroUsuario(String usuario,String nombre,String tipDocu,String contra,String correo,String tel,int nivel,String Apellido){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        boolean inserto = true;
        EncriptadorAES encriptador = new EncriptadorAES();
        try {
            
            
            String encriptado = encriptador.encriptar(contra, contra);
        
            String sql= " insert into usuarios (idUsuarios,Nombre_Usuario,Tipo_Documento,Numero_Documento,Correo_Electronico,Telefono,Hoja_vida,contraseña,nivel) VALUES ('" + usuario + "','" + nombre + "','" + tipDocu + "','" + usuario + "','" + correo + "','" + tel + "','','" + encriptado + "','" + nivel + "')";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             pst.executeUpdate(sql);
            
            //while(rs.next()){
               //  nivel = rs.getInt(1);  
            //}
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return inserto;
    }
     public boolean registroEmpresa(int empresa ,String nombreEmpresa,String nitEmpresa,String direccionEmpresa,String correoEmpresa,String telefonoEmpresa,String contraseña,int nivel){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        boolean inserto = true;
         
        EncriptadorAES encriptador = new EncriptadorAES();
        //int idEmpresaR = ConsultarMaximoEmpresa();
        //int idsumado = idEmpresaR + 1;
        
        try {
            
            
            String encriptado = encriptador.encriptar(contraseña, contraseña);
        
            String sql= " INSERT INTO empresas (idEmpresas,Nombre_Empresa,Nit_Empresa,Direccion_Empresa,Correo_Empresa,Telefono_Empresa,contraseña,nivel) VALUES ('" + empresa + "','" + nombreEmpresa + "','" + nitEmpresa + "','" + direccionEmpresa + "','" + correoEmpresa + "','" + telefonoEmpresa + "','" + encriptado + "','" + nivel + "')";
            //String sql= " insert into usuarios (idUsuarios,Nombre_Usuario,Tipo_Documento,Numero_Documento,Correo_Electronico,Telefono,Hoja_vida,contraseña,nivel) VALUES ('" + usuario + "','" + nombre + "','" + tipDocu + "','" + usuario + "','" + correo + "','" + tel + "','','" + encriptado + "','" + nivel + "')";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             pst.executeUpdate(sql);
            
            //while(rs.next()){
               //  nivel = rs.getInt(1);  
            //}
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return inserto;
    }
    
        public boolean registroOfertas(int empresa,String nomOferta,String descOferta,String tipPerfil,String suel){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        
        int idofertaAct = ConsultarMaximoOferta();
        int idOferta = idofertaAct + 1;       
        int estado = 1;
        boolean inserto = true;
       
        try {
            
            String sql= " insert into ofertas (idOfertas,Nombre_Oferta,Descripcion_Oferta,Requerimientos_Oferta,Sueldo_Oferta,Estados_Oferta,Empresas_idEmpresas) VALUES ('" + idOferta + "','" + nomOferta + "','" + descOferta + "','" + tipPerfil + "','" + suel + "','" + estado + "','" + empresa + "')";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             pst.executeUpdate(sql);
            
            //while(rs.next()){
               //  nivel = rs.getInt(1);  
            //}
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return inserto;
    }
    
          public boolean ConsultaDatosOferta(String nomOferta,String descOferta){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        int idOferta = id++;
        int estado = 1;
        boolean inserto = true;
        int empresa= 123;
        try {
            String sql= "SELECT idOfertas,Nombre_Oferta,Descripcion_Oferta,Requerimientos_Oferta,Sueldo_Oferta,Estados_Oferta,Empresas_idEmpresas FROM ofertas\n" +
            "UNION\n" +
                        "SELECT idEmpresas FROM empresas";
            //String sql= " insert into ofertas (idOfertas,Nombre_Oferta,Descripcion_Oferta,Requerimientos_Oferta,Sueldo_Oferta,Estados_Oferta,Empresas_idEmpresas) VALUES ('" + idOferta + "','" + nomOferta + "','" + descOferta + "','" + tipPerfil + "','" + suel + "','" + estado + "','" + empresa + "')";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             pst.executeUpdate(sql);
            
            //while(rs.next()){
               //  nivel = rs.getInt(1);  
            //}
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return inserto;
    }
         
         
      public int ConsultarCantidadAdmin(){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        try {
            
            String sql= " SELECT COUNT(idUsuario_administrador)\n" +
"                         FROM usuario_administrador\n" +
"                          ";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            
            while(rs.next()){
                 cont = rs.getInt(1);  
            }
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return cont;
    }
          
              public int borrarRegistroOferta(int empresa){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        try {
            
            String sql= "  DELETE FROM empresas\n" +
                        "  WHERE idEmpresas = '" + empresa + "' ";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            
            while(rs.next()){
                 cont = rs.getInt(1);  
            }
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return cont;
    }
     
      
     
    public int ConsultarMaximoEmpresa(){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        try {
            
            String sql= "select max(idEmpresas) from  mydb.empresas";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            
            while(rs.next()){
                 cont = rs.getInt(1);  
            }
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return cont;
    }
    //SELECT MAX(list_price) max_list_price
    //FROM production.products;
 public int ConsultarMaximoOferta(){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont =0;
        try {
            
            String sql= "select max(idOfertas) from  ofertas";
        
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.uss, this.contra);
            
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            
            while(rs.next()){
                 cont = rs.getInt(1);  
            }
        
            conn.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
             
        return cont;
    }



}
