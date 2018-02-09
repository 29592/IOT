<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  방문자 수 count  -->
<% 
   int cnt = 1; 

   Object value = application.getAttribute("cntVisit"); 
   
   if (value!=null ){ 
	   cnt = (int)value ; 
	   if (session.isNew()==true)
	       cnt = cnt + 1 ;   
   } 
   application.setAttribute("cntVisit", cnt) ;

%>
방문자 수 : <%= cnt %> 