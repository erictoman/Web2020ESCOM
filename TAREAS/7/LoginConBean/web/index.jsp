<%-- 
    Document   : index
    Created on : 29/05/2020, 05:20:15 PM
    Author     : ertim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de inicio</title>
    </head>
    <body>
        <%
            String usuario=null;
            HttpSession s = request.getSession();
            if(s.getAttribute("usuario")!=null){
                usuario=request.getSession().getAttribute("usuario").toString();
            }
            if(usuario!=null){
        %>
        <p>Usuario <%out.println(request.getSession().getAttribute("usuario").toString());%> validado</p>
        <a href="./cerrarSesion">Salir</a>
        <%
                }else{
        %>
        <form action="login" method="get">
            usuario: <input type="text" name="usuario">
            <br>
            contraseña <input type="text" name="password">
            <br>
            <button type="submit">Enviar</button>
        </form>
        <%
                }
        %>
    </body>
</html>
