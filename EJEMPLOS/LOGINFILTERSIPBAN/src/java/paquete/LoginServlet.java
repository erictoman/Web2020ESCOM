/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eric
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        String user = req.getParameter("usuario");
        String pass = req.getParameter("passwd");
        LoginChecker log = new LoginChecker();
        if(log.Validate(user, pass)){
            req.getSession().setAttribute("usuario",user);
            res.sendRedirect("Hola");
        }else{
            res.sendRedirect("");
        }
    }
}
