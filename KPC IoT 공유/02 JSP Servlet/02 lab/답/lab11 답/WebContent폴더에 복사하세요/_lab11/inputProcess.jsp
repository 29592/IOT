<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 String mcheck = request.getParameter("mcheck");
 if (mcheck!=null && "on".equals(mcheck)){//지금 선택한 수단을 저장 
	 String g1 = request.getParameter("g1"); 
     Cookie c = new Cookie("g1",g1); 
     c.setMaxAge(60*60*24*30) ;//한달 
     response.addCookie(c) ; 
 }else { // 쿠키 삭제 
	 Cookie c = new Cookie("g1",null); 
     c.setMaxAge(0) ;   
     response.addCookie(c) ; 
 }
%> 