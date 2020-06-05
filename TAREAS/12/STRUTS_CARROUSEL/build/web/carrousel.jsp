<%-- 
    Document   : carrousel
    Created on : Feb 25, 2020, 8:06:36 AM
    Author     : eric
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                int indice =Integer.parseInt(request.getSession().getAttribute("indice").toString());
                int numero =Integer.parseInt(request.getSession().getAttribute("numero").toString());
                System.out.println(indice+" "+numero);
                ArrayList<String> paths = (ArrayList<String>)request.getSession().getAttribute("paths");
                try{
                    if(Integer.parseInt(request.getParameter("SIG").toString())==1){
                        Math.abs(indice++);
                        request.getSession().setAttribute("indice",indice);
                        out.println("<img heigh='300px' width='300px' src='"+paths.get(indice%numero)+"'  />");
                    }else{
                        Math.abs(indice--);
                        request.getSession().setAttribute("indice",indice);
                        out.println("<img heigh='300px' width='300px' src='"+paths.get(indice%numero)+"'  />");
                    }
                }catch(Exception e ){
                    out.println("<img heigh='300px' width='300px' src='"+paths.get(indice%numero)+"'  />");
                }
            }catch(Exception e){
                response.sendRedirect("input.jsp");
            }
        %>
        <a href="carrousel.jsp?SIG=0">Anterior</a>
        <a href="carrousel.jsp?SIG=1">Siguiente</a>
    </body>
</html>
