<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>비회원 장바구니</h1>
<!-- 총 가격 합 구함.  (누적 됨) 같은 페이지에 출력 -->
<!-- 초기화 안됨 -->
<%   int sum = 0 ;
     Integer oldSum = (Integer)session.getAttribute("sum"); 

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
     if( oldSum!= null) sum = sum + oldSum ;
     
     
     session.setAttribute("sum", sum) ;
 %>
 총 가격 합 <%= sum %>

<br/><br/>
장바구니에 담을 제품을 선택하세요<br/><br/>
<form action="total_2.jsp">
	<table>
		<tr>
			<td>샤프(500)</td>
			<td><input type="checkbox" value="500" name="menu1" /></td>
		</tr>
		<tr>
			<td>볼펜(700)</td>
			<td><input type="checkbox" value="700" name="menu2" /></td>
		</tr>
		<tr>
			<td>연필(300)</td>
			<td><input type="checkbox" value="300" name="menu3" /></td>
		</tr>
		<tr>
			<td>장바구니 초기화</td>
			<td><input type="checkbox" name="init" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="장바구니에 담기" /></td>
			<td></td>
		</tr>
	</table>
</form>