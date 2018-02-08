<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<h4> 티켓 수령 방법 선택  </h4>
<%   String g1 ="";
     Cookie[] cookies = request.getCookies();
     if (cookies!=null){
    	  for(Cookie c : cookies ){
    		 if( c.getName().equals("g1") ) {
    			 g1 = c.getValue();
    		 }
    	  }
     } 
     String s1 ="";
     String d1 ="";
     if( "site".equals(g1 ))           { s1 ="checked" ; } 
     else if ( "delivery".equals(g1 )) { d1 ="checked" ;  }  
%>
<form action="inputProcess.jsp">
 현장수령     <input type="radio" name="g1"  value="site" <%=s1%>/>
 배송(2500)  <input type="radio" name="g1"  value="delivery" <%=d1 %>/><br/><br/>
 지금 선택한 수단을 저장 <input type="checkbox" name="mcheck" /><br/>
             <input type="submit" value="다음"  />
</form>
</body>
</html>
    