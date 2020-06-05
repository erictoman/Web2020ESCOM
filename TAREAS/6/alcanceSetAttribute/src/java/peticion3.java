/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ertim
 */
public class peticion3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet peticion2</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<p>El metodo setAttribute solo tiene alcance hasta donde se hace el foward, no a las demas rutas.</p>");
        out.println("<h1>Nombre 2 en servlet 3:" +request.getAttribute("nombre2") + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
