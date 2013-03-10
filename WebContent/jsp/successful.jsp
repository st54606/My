<%@page import="lv.citadele.models.FormModel"%>
<%@page import="lv.citadele.models.IModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="lv.citadele.domain.FormFields"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="../css/citadele-all.css" media="screen, projection">
<link rel="shortcut icon" href="http://www.citadele.lv/favicon.ico" type="image/x-icon">
<title>Successful</title>
</head>
<body>
<%HttpSession sessions = request.getSession();
FormModel model = (FormModel)session.getAttribute("model"); %>
<div id ="container">
<table>
<tr>
<td id ="logo" >
<img src="../img/citadele-logo.gif" alt= "Citadele banka" widht ="164" "height="100" class="padding-logo">
</td>
<td  align ="center" valign="middle"><br>
</td>
</tr>
<tr>
<td><td>
<td align ="center">
<p><h4><b>Payment form succesfuly sended...</b></h4></p></td></td></td></tr>
</table>
<br>
<% /* HttpSession sessions = request.getSession();
FormModel model = (FormModel)session.getAttribute("model"); */

out.println(model.getRemitterName() + "successful");
%> <br> <%
out.println(model.getBeneficiaryName() + "successful");
%>
</body>
</html>