<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.io.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>:: 온라인 쇼핑몰</title>
<STYLE TYPE="text/css"> 
	td {font-family:   Times, 굴림체; font-size:11pt;} 
</STYLE> 
</head>
<body>
<center>
<h1> Error </h1>
</center>
<hr>
<%
	Exception ex = (Exception)request.getAttribute("error.key");
%>

<%=ex.toString() %>
<br>
<pre>
<%=ex.getMessage() %>
</pre>
<br>
<hr>

<h4> printStackTrace </h4>
<pre>

<%
	ex.printStackTrace(new PrintWriter((Writer)out));
%>

</pre>

</body>
</html>