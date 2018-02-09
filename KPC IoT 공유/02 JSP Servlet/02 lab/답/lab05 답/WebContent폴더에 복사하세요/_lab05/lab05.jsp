<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>  
이름<%=request.getParameter("name")%><br>
전화번호<%=request.getParameter("phoneNumber")%><br>
이메일<%=request.getParameter("email")%><br>
생일<%=request.getParameter("birthday")%><br>
경로<%=request.getParameter("source")%><br>
테니스<%=request.getParameter("tennis")%><br>
골프<%=request.getParameter("golf")%><br>
농구<%=request.getParameter("basketball")%><br>
축구<%=request.getParameter("soccer")%><br>
스쿼시<%=request.getParameter("squash")%><br>
볼링<%=request.getParameter("bowling")%><br>
연락방법 <%=request.getParameter("contactVia")%><br>  
개인정보 활용: <%=request.getParameter("agree")%><br>  