<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<body> <h1>사원  조회 화면 입니다.</h1>
	<form action="<%=request.getContextPath()%>/_lab13/EmpSearchServlet" method="post">
		<table border="1">
			<tr>
				<td>조회할 부서번호 (숫자) :  </td>
				<td><input type="text" name="deptno"></td>
			</tr>
		</table>
		<input type="submit" value="조회" />  
	</form>
</body>
</html>