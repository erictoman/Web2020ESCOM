<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
<head>
<title>Struts File Upload Example</title>
</head>
<body>
    <html:form action="StrutsUploadForm" method="post" enctype="multipart/form-data">
    <%
        String numero =(String)request.getParameter("numero");
        request.getSession().setAttribute("N",Integer.parseInt(numero));
        int num = Integer.parseInt(numero);
        for(int i =0;i<num;i++){
            out.println("Imagen "+i+": <input type='file'"+i+"'/><br>");
        }
    %>
    <html:submit value="Submit" />
    </html:form>
</body>
</html:html>
