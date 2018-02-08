<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta charset="UTF-8">
<title> 사원 정보 등록 </title>
</head>
<body> <h1>사원 등록 화면 입니다.</h1>
	<form action="<%=request.getContextPath()%>/_lab13/EmpInsertServlet" method="post">
		<table border="1">
			<tr>
				<td>등록할 사원 명 :</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>사원 사번(숫자) :</td>
				<td><input type="text" name="empno"></td>
			</tr>
			<tr>
				<td>사원 직종</td>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<td>부서 번호 </td>
				<td><input type="text" name="deptno"></td>
			</tr>
		</table>
		<input type="submit" value="등록" />  
	</form>
</body>
</html>