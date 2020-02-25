<%-- 
    Document   : formularioImagenes
    Created on : Feb 24, 2020, 10:26:29 AM
    Author     : eric
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="UPLOAD" method="POST" enctype="multipart/form-data">
            <%
                int num = Integer.parseInt(request.getSession().getAttribute("numero").toString());
                for(int i =0;i<num;i++){
                    out.println("Imagen "+(1+i)+": <input type='file' name='upload' /><br>");
                }
            %>
            <button type="submit">Enviar</button>
        </html:form>
    </body>
</html>
