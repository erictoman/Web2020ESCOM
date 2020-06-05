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
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost/DB2","admin", "1234");
            Statement s = db.createStatement();
            rs=s.executeQuery("SELECT * FROM Users");
            while(rs.next()){
                validUsers.put(rs.getString("id1"),rs.getString("password"));
            }
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public boolean validateUser(String userName, String password)
    {
            if(validUsers.containsKey(userName))
            {
             String thePassword = (String)validUsers.get(userName);
             if(thePassword.equals(password))
             return true;
            }
        return false;
    }
}