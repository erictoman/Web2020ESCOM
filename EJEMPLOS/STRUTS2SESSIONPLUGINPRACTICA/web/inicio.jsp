<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body>
	<h1>STRUTS 2 SESSION</h1>
	<s:form action="/Usuario/Session">
		<s:textfield name="username" label="Usuario" />
                <s:password name="password" label="Contraseña"/>
		<s:submit />
	</s:form>
</body>
</html>