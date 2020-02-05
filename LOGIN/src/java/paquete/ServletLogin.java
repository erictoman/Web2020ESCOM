package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String id= request.getParameter("id");
        String password= request.getParameter("password");        
        response.setContentType("text/html;charset=UTF-8");
        LoginBean lb = new LoginBean();
        if(lb.validateUser(id,password))
        {
            HttpSession sesion=request.getSession();
            sesion.setAttribute("userName",id);               
            response.sendRedirect("welcome");     
        }else{
            response.sendRedirect("fail");
        }
    }
}
