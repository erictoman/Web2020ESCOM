package paquete;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class Accion extends ActionSupport implements SessionAware
{
    
private Map<String, Object> sessionMap;
private String username;
private String password;    

    @Override
    public void setSession(Map<String, Object> sessionMap) 
    {
        this.sessionMap = sessionMap;
    }    
    
    public String getUsername() 
    {
        return username;
    }
 
    public void setUsername(String username) 
    {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
	
    @Override
    public String execute()
    {
        
        sessionMap.put("username", username);
        return "welcome";
    }    
}
