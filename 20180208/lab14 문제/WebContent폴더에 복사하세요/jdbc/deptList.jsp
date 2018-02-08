<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="jdbcex.dept.*" %> 
<html><body>
	<table border="1">
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>위치</th>
		</tr>
		<% 
			DeptDAO deptDao = new DeptDAO();
			ArrayList<DeptVO> list = deptDao.getDeptList();

			for (DeptVO vo : list) {
				out.println("<tr>");
				out.println( "<td>" + vo.getDeptNo() + "</td>" 
+ "<td>" + vo.getDname() + "</td>" 
+ "<td>" + vo.getLoc()+ "</td>");
out.println("</tr>");
			}
		 %>
	</table>
</body></html>
