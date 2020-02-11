<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body>
        <html:form action="Accion2">
            ID: <html:text property="id"/>
            <br/>
            PASSWORD <html:password property="password"/>
            <br/>
            <html:submit/>
        </html:form>
    </body>
</html:html>