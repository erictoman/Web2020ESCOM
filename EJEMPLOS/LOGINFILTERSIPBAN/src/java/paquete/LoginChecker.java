package paquete;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eric
 */
public class LoginChecker {
    private final HashMap<String,String> map= new HashMap<>();

    public LoginChecker() {
        try{
            Class.forName("com.mysql.jdbc.Driver");     
            String user="root";
            String pass="2312";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",user,pass);         
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from usuario");
            while(rs.next()){
                map.put(rs.getString("nombre"),rs.getString("password"));
            }
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
    
    boolean Validate(String user, String pass){
        return map.containsKey(user) && map.get(user).endsWith(pass);
    }
    
}
