package admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eric
 */
@WebServlet(urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet1</title></head>");
        out.println("<p>API Servlets.</p>");
        Enumeration enum1 = request.getParameterNames();
        while(enum1.hasMoreElements()){
            String nombre = (String) enum1.nextElement();
            String valores[] = request.getParameterValues(nombre);
            if (valores != null) {
                for (int i = 0; i < valores.length; i++) {
                    out.println("<p>"+nombre + " (" + i + "): " + valores[i]+"</p>");
                }
            }
        }
        out.println("</body></html>");
    }
}
