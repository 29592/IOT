<%@ page import="jdbcex.emp.EmpVO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html><body>
<%  String ename = "";
    String job = "" ; 
    int empno = 0   ;
    EmpVO vo =(EmpVO)session.getAttribute("user") ;
    if (vo != null ){
    	ename =vo.getEname();
    	job = vo.getJob();
    	empno = vo.getEmpNo();
 %>
 		<%= ename %> 님 환영합니다. 	<br/>
 		<%= ename %> 님 정보  		<br/>
 		사번 : <%= empno %>   			 
 		직종 : <%= job %> 				<br/>
 		<br/><br/>
 		<a href="insertEmp.jsp" >사원등록메뉴 </a> <br/>
 		<a href="searchEmp.jsp" >사원검색메뉴</a><br/>
 		<a href="logout.jsp" >로그아웃 </a>
<%  }else{    %>
<a href="login.html" >로그인 하세요 </a>
<%  }%>
</body></html>
