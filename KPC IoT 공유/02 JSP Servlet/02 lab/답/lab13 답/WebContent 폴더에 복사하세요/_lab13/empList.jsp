<%@page import="jdbcex.emp.EmpVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% ArrayList<EmpVO> tempVar =(ArrayList<EmpVO>)request.getAttribute("list");
%>
<html><body>
	<table border="1">
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직종</th>
		</tr>
		<% if (tempVar!=null) { 
            for( EmpVO vo : tempVar ) {		
		%>
        <tr>
        <td><%=vo.getEmpNo()%></td>
	    <td><%=vo.getEname()%></td>
	    <td><%=vo.getJob()%></td> 
	    </tr>  
            <% } 
         } %>
	</table>
</body></html>
