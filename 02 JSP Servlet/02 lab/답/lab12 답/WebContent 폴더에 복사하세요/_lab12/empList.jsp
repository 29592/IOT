<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="jdbcex.emp.*" %> 
<html><body>
	<table border="1">
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직종</th>
		</tr>
		
		<%  
		    String deptno = request.getParameter("deptno");
			EmpDAO deptDao = new EmpDAO();
			ArrayList<EmpVO> list = deptDao.getEmpList(Integer.parseInt(deptno));

			for (EmpVO vo : list) {
				out.println("<tr>");
				out.println( "<td>" + vo.getEmpNo () + "</td>" 
+ "<td>" + vo.getEname() + "</td>" 
+ "<td>" + vo.getJob()+ "</td>");
out.println("</tr>");
			}
		 %>
	</table>
</body></html>
