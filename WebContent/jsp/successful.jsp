<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="lv.citadele.domain.FormFields"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>successful</title>
</head>
<body>
<% 

FormFields ff = (FormFields)session.getAttribute("form");

String push = ff.getRemitterName();
System.out.println(push);
%>
</body>
</html>