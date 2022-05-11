<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Datos recibidos: " + "<BR>");
out.println("Nombre --> " + request.getParameter("nombre") + "<BR>"); 
out.println ("Apellidos --> " + request.getParameter("apellidos") + "<BR>");
out.println("Localidad --> " + request.getParameter("localidad"));
%>
</body>
</html>