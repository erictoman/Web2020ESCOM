<%-- 
    Document   : Hola
    Created on : Mar 2, 2020, 7:45:40 AM
    Author     : eric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola <% out.println(request.getSession().getAttribute("usuario"));%></h1>
        <form action="cerrarSesion" method="POST"><input type="submit" value="Cerrar sesion"></form>
    </body>
</html>
