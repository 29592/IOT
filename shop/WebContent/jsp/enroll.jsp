<%
    //history.go(-1)�� �̵��ϴ� ��쿡��, �������� ���� �д´�. (No cache)
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires",0);
	response.setHeader("Cache-Control","no-Cache");
%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String message = (String)request.getAttribute("message");
	if(message == null) {
		message = "";
	}

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>:: �¶��� ���θ�</title>
<STYLE TYPE="text/css"> 
	td {font-family:    Georgia, Arial Black, ����ü; font-size:11pt;} 
</STYLE> 
</head>
<body onload="javascript:login.id.focus();">
<h3> ���θ� ��ǰ��� �� </h3>
<hr>

<form name="enroll" method=post action=enroll.do>
<table>
	<tr>
		<td>��ǰ��ȣ :</td>
		<td><input type=text name=prd_no style="width:120px;" tabindex="1" value="PRD000000013"></td>
		<td rowspan="2"><input type=submit value=Ȯ�� tabindex="3"></td> 
	</tr>
	<tr>
		<td>��ǰ�̸� :</td>
		<td><input type=text name=prd_nm style="width:120px;" tabindex="1" value="thony_kamela"></td>
	</tr>	 
	<tr>
		<td colspan="3" height="50"><font color="red"><%= message%></td> 
	</tr>	
</table>
 

 
</form>
</body>
</html>