<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                String id=request.getSession().getAttribute("id").toString();
                if(!id.equals(null)){
                    out.println("Hola "+id);
                }else{
                    out.println("No has iniciado sesion "+id);
                }
            %>
        </h1>
        <br>
        <a href="./Signout">Sign out</a>
    </body>
</html>
