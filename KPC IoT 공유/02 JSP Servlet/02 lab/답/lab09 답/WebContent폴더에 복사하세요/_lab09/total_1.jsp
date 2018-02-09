<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>비회원 장바구니</h1>
<!-- 총 가격 합 구함.  (누적은 안됨) 다른 페이지에 출력 -->

<br/><br/>
장바구니에 담을 제품을 선택하세요<br/><br/>
<form action="result.jsp">
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