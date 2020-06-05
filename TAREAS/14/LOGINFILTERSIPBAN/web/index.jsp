<%-- 
    Document   : index
    Created on : Mar 2, 2020, 8:14:27 AM
    Author     : eric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
        int num=0;
        try{
            num = Integer.parseInt(request.getSession().getAttribute("try").toString()); 
        }catch(Exception e){
            request.getSession().setAttribute("try",0);
        }finally{
            out.println("Intento: "+num);
            out.println("<br>");
            out.println("IP: "+request.getRemoteAddr()+"<br>");
            if(num<3){
        %>
        <form action="Login" method="POST">
            <label for='usuario'>
                Usuario:<input name="usuario" type="text" required> 
            </label>
            <label for='passwd'>
                Password:<input name="passwd" type="password" required> 
            </label>
            <input type='submit'>
        </form>
        <% 
            }else{
                out.println("No hay mas intentos disponibles");
            }
        }
        %>
    </body>
</html>
