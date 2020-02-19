<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
<head>
<title>Struts File Upload Example</title>
</head>
<body bgcolor="white">
    <html:form action="UPLOAD" method="post" enctype="multipart/form-data">
    File Name
    <html:file property="theFile"/>
    <html:submit value="Submit" />
    </html:form>
</body>
</html:html>
