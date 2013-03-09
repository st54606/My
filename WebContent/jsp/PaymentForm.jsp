<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <%@page pageEncoding="UTF-8" %>
    <%@page import="lv.citadele.domain.FormFields"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="../css/citadele-all.css" media="screen, projection">
<title>Payment Form</title>
</head>
<body>
<!-- Page header -->

<div id ="container">
<table>
<tr>
<td id ="logo" >
<img src="../img/citadele-logo.gif" alt= "Citadele banka" widht ="164" "height="72" class="padding-logo">
</td>
<td  align ="center" valign="middle"><br>
<h1><b>MAKSĀJUMA UZDEVUMS</b></h1>
<h3>Payment Order</h3>
<h3>Платежное поручение</h3>
</td>

<!-- Page header -->


<!-- First Table -->
<form name="input" action="successful.jsp" method="post"><table>
<tr><br>
<td align = "left"><h6>AS „Citadele banka”, Reg. nr. 40103303559</h6> </td>
<td align="right">FKl. num. / Cust. num <input type="text" name="cust_number" value =""></td></tr>
<tr>
<td align = "left">Republikas laukums 2A, Riga, LV-1010, Latvija</td>
<td align="right">Datums / Date<input type="text" name="formDate"/></td>
</tr>
</table>
</tr> 
</td>
</table>
<!--  End of First Table -->

 <!-- Second Table -->
<table id = "tables">
<tr class = "table-head">
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb" ><b>Maksātājs/ Remitter / Плательщик</b><br>
<small>
Vards, uzvards / Uznemuma nosaukums<br>
<h6>Name, surname / Company name</h6>

Имя, Фамилия/ Название фирмы <input type="text" size= "50" name= "remitterName" value="remitterName">

</small>
</td>
</tr>
</table>
<!-- End of Second Table -->

<!-- Third table -->
<table id = "tables">
<tr class = "table-head">
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb"><b>Saņēmejs / Beneficiary / Получатель</b><br>
<small>
Vards, uzvards / Uznemuma nosaukums<br>
Name, surname / Company name<br>

Имя, Фамилия/ Название фирмы  <input type="text" size= "50" name= "beneficiaryName" value="">

<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
</small>
</td>
</tr>
<tr class = "table-head">
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Personas kods / Reg. Nr.<br>
Personal ID number / Reg. No<br>

Перс. код / Регистрационный №
<input type="text" size= "5" name= "personalId1half" value=""> - <input type ="text" size="5" name="personalId2half" value ="">
/ <input type ="text" size="11" name="RegNr" value ="">
<
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
</small>
</td>
</tr>
<tr>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Konta Nr.<br>
Account No<br>
<
№ счета  <input type="text" size= "50" name= "accountNr" value="">

</td>
<td colspan = "3" align ="left" valign = "top" bgcolor = "#fbfbfb">
<small>
Rezidences valsts<br>
Residence country<br>

Страна резиденции <input type="text" size= "25" name= "residenceCountry" value="">

</small>
</td>
</tr>
<tr>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Saņēmējbanka<br>
Beneficiary bank<br>

Банк получателя  <input type="text" size= "25" name= "beneficiaryBank" value="">

</small>
</td>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Bankas kods<br>
Bank code<br>

Банковский код  <input type="text" size= "25" name= "bankCode" value="">

</small>
</td>
</tr>
</table>
<!--End of  Third table -->
<table id = "tables">
<tr class = "table-head">
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb"><b>Maksājuma informācija / Payment information / Информация о платеже</b><br>
<small>
Summa cipariem un valuta<br>
Amount in figures and currency<br>

Сумма цифрами и валюта <input type="text" size= "15" name= "currency" value="">

</small>
</td>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small><br>
Bankas komisija<br>
Bank fee<br>

Коммимия банка  <input type="text" size= "15" name= "bankFee" value="" align ="left">

</small>
</td>
</tr>
<tr>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Summa vārdiem<br>
Amount in words<br>

Сумма прописью  <input type="text" size= "25" name= "amountInWords" value="">

</small>
</td>
<td colspan = "3" align ="left" valign = "top" bgcolor = "#fbfbfb">
</td>
</tr>
<tr>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Maksajuma veids<br>
Payment type<br>

Вид платежа  <input type="text" size= "50" name= "paymentType" value="">

</td>
<td colspan = "3" align ="left" valign = "top" bgcolor = "#fbfbfb">
<small>
Maiņas kurss<br>
Exchange rate<br>

Обменный курс <input type="text" size= "25" name= "exchangeRate" value="">

</small>
</td>
</tr>
<tr>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Valutešanas datums<br>
Value date<br>

Дата валютирования  <input type="text" size= "15" name= "valueDate" value="">

</td>
<td colspan = "3" align ="left" valign = "top" bgcolor = "#fbfbfb">
<small>
Arējā maksājuma kods<br>
Code of external payment<br>

Код зарубежного платежа <input type="text" size= "15" name= "codeOfExternalPayment" value="">

</small>
</td>
</tr>
<tr>
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
<small>
Maksājuma mērķis<br>
Payment details<br>

Назначение платежа  <input type="text" size= "100" name= "paymentDetails" value="">

</small>
</td>
<td colspan = "3" align ="left" valign = "top" bgcolor = "#fbfbfb">
</td>
</tr>
</table>
<table id = "tables">
<tr class = "table-head">
<td colspan = "3" valign = "top" bgcolor = "#fbfbfb"><b>Paraksti / Signatures / Подписи</b><br>
<small>
Vards, uzvards / Uznemuma nosaukums<br>
Name, surname / Company name<br>

Имя, Фамилия/ Название фирмы  <input type="text" size= "50" name= "signature" value="">

<td colspan = "3" valign = "top" bgcolor = "#fbfbfb">
</small>
</td>
</tr>
</table>
<table>
<tr>
<td>
</td>
<td align="center">

<input type="image" src="../img/button_nosutit.gif" name="submit"  />
</form>
</td>
</table>
</form>
<% %>
</div>

</body>
</html>