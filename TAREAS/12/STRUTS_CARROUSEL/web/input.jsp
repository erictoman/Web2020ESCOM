<%-- 
    Document   : input
    Created on : Feb 24, 2020, 10:14:14 AM
    Author     : eric
--%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="/generarFormulario">
            Numero de imagenes: 
            <html:text title="Imagenes" property="numero" value="" />
            <html:submit value="Enviar"/>
        </html:form>
    </body>
</html>
