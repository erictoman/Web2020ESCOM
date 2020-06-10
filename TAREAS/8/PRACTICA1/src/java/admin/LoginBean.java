package admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

class LoginBean 
{
    private HashMap validUsers = new HashMap();
    public LoginBean()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root", "2312");
            Statement s = db.createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM usuario;");
            while(rs.next()){
                validUsers.put(rs.getString("nombre"),rs.getString("password"));
            }
        }catch(ClassNotFoundException | SQLException e){
        }
    }
    
    public boolean validateUser(String userName, String password)
    {
        if(validUsers.containsKey(userName)){
            String thePassword = (String)validUsers.get(userName);
            if(thePassword.equals(password))
                return true;
            }
        return false;
    }
}