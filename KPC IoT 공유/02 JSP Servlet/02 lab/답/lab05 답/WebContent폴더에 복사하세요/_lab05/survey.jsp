<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>설문 조사 시스템</title>
</head>
<body>
<form name="surveyForm"  action="lab05.jsp" >
<h1>설문 조사</h1>
<h4>신상 정보:</h4>
<table>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" /></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="phoneNumber" /></td>
	</tr>
	<tr>
		<td>이메일 주소</td>
		<td><input type="text" name="email" /></td>
	</tr>
	<tr>
		<td>생일</td>
		<td><input type="text" name="birthday" /></td>
	</tr>
</table>
<h4>어떤 경로로 알게 되었습니까?</h4>
<input type="radio" name="source" value="article">기사 <input
	type="radio" name="source" value="ad">광고 
	<input type="radio"	name="source" value="etc">기타

<h4>좋아하는 스포츠는 무엇입니까?</h4>
<table>
	<tr>
		<td><input type="checkbox" name="tennis">테니스</td>
		<td><input type="checkbox" name="golf">골프</td>
		<td><input type="checkbox" name="basketball">농구</td>
	</tr>
	<tr>
		<td><input type="checkbox" name="soccer">축구</td>
		<td><input type="checkbox" name="squash">스쿼시</td>
		<td><input type="checkbox" name="bowling">볼링</td>
	</tr>
</table>
<p>연락방법 <select name="contactVia">
	<option value="email">email</option>
	<option value="phone">phone</option>
	<option value="sms">SMS</option>
</select></p>
<p><input type="checkbox" name="agree" checked> 개인정보 활용에
동의합니다.</p>
<input type="submit" value="Submit"></form>
</body>
</html>
