<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="jdbcex.dept.*" %> 
<html><body>
	<table border="1">
		<tr>
			<th>�μ���ȣ</th>
			<th>�μ��̸�</th>
			<th>��ġ</th>
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
