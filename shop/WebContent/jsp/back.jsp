<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String msg = (String)request.getAttribute("msg");
	if(msg == null)
		msg = "";
%>   
<STYLE TYPE="text/css"> 
	td {font-family:   Times, ����ü; font-size:11pt;} 
</STYLE> 
<script>
alert("<%=msg%>");
history.go(-1);
</script>