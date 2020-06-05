import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginBean 
{
    private HashMap validUsers = new HashMap();
    public LoginBean()
    {
        
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ResultSet rs=null;
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false& useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "2312");
            Statement s = con.createStatement();
            rs=s.executeQuery("SELECT * FROM Usuario");
            while(rs.next()){
                validUsers.put(rs.getString("usuario"),rs.getString("password"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean validateUser(String username, String password)
    {
        if(validUsers.containsKey(username)){
            String thePassword = (String)validUsers.get(username);
            if(thePassword.equals(password)){
                return true;
            }
        }
        return false;
    }
}