<%@ page import="jdbcex.emp.*"%>
<%@ page  contentType="text/html; charset=utf-8" %>
<!DOCTYPE html >
<html><body>
<%
  boolean isSuccess = false;
  String empno = request.getParameter("empno");
  String ename = request.getParameter("ename");
  EmpDAO dao = new EmpDAO(); 
 
  EmpVO vo =  dao.getEmp(Integer.parseInt(empno));
  if (vo !=null && vo.getEname().equals(ename))//로그인 성공 
  {  isSuccess = true; 
     session.setAttribute("user", vo) ; 
     out.print("로그인 성공") ;
  }else{
	 out.print("로그인 실패") ;
  }
%>
</body></html>
