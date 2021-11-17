/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;

/**
 *
 * @author OhmAster
 */
public class conector {
    Connection con;
    public Connection conect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas"
                ,"root"
                ,"");
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return con;
    }
  /*  public static void main(String[] args) {
        conector cn = new conector();
        try{
            Statement st = cn.con.createStatement();
            ResultSet rs = st.executeQuery("select * from tblusuarios");
            while(rs.next()){
                System.out.println(rs.getInt("idx")+" "
                    +rs.getString("nombre")+" "
                    +rs.getString("marca"));
            }
            cn.con.close();
        }catch(Exception e){
            System.out.println("error: "+e);
        }
    }*/
}
