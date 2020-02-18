<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <%
            out.println("Hola mundo: "+request.getParameter("id"));
        %>
    </body>
</html>
