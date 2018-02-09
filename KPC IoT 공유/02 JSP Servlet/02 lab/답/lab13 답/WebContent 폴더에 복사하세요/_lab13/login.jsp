<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html><head><meta charset="UTF-8"></head>
<body>
<form action="<%=request.getContextPath()%>/_lab13/EmpLoginServlet" method="post">
   사번  <input type="text" name="empno" />
   이름  <input type="text" name="ename" />
         <input type="submit" value="login" />
</form>
</body></html>
