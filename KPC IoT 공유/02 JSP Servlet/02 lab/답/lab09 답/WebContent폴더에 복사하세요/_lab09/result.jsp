<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%  int sum = 0 ;
     String menu1 = request.getParameter("menu1"); 
     String menu2 = request.getParameter("menu2"); 
     String menu3 = request.getParameter("menu3"); 
     if( menu1 != null) { // 샤프(500)   체크 했으면 
    	 sum = sum + Integer.parseInt(menu1)  ; // 샤프 가격인 500 
     }
     if( menu2 != null) { // 볼펜(700)   체크 했으면 
    	 sum = sum + Integer.parseInt(menu2)  ; // 볼펜 가격인 700
     }
     if( menu3 != null) { // 연필(300)   체크 했으면 
      	 sum = sum + Integer.parseInt(menu3)  ; // 연필 가격인 300
     }
 %>
 총 가격 합 <%= sum %>
</body>
</html>




