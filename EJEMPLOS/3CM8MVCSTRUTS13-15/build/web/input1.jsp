<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="true">
    <head>
    </head>
    <body>
        <html:form action="Accion">
            ID: <html:text property="id" />
            PASSWORD <html:password property="password" />
            <html:submit />
        </html:form>
    </body>
</html:html>
