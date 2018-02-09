<%
    //history.go(-1)로 이동하는 경우에도, 페이지를 새로 읽는다. (No cache)
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires",0);
	response.setHeader("Cache-Control","no-Cache");
%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ page import="com.sd.shop.vo.*" %>      
<%@ page import="com.sd.fw.util.Util"%>
<%
	boolean isLogin = false;
	String memId = null;
	String memNm = null;
	
	SessionVO svo = (SessionVO)session.getAttribute("user");
	if(svo!=null) {
		isLogin = true;
	}
	
	if(isLogin) {
		memId = svo.getMemId();
		memNm = svo.getMemNm();
	}
	

%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.sd.fw.mvc.HttpUtil"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>:: 온라인 쇼핑몰</title>
<STYLE TYPE="text/css"> 
	td {font-family:   Times, 굴림체; font-size:11pt;} 
</STYLE> 
</head>
<body>
<center>

<table width=800 border=0>
	<tr>
	    <td width="120"><%= isLogin ? memNm+"님" : "" %></td>
		<td align=right>&nbsp;</td>
		<td width="100" align="right">
		<%if(isLogin) { %>
		    <a href=logout.do>Log-Out</a>
		<%} else { %>
			<a href=loginform.do>Log-In</a>
		<%} %>
		</td>
		<td width="100"><a href=board.do>게시판</a></td>
		<td width="100"><a href=basketview.do>장바구니 보기</a></td>
	</tr>
</table>

<h3> 상품 상세보기</h3> 

<table width=800 border=0>
<tr>
<td width=140 valign=top>
<b>category</b><br><br>
<a href=list.do>전체보기</a><br><br>
<%

String categoryCode = request.getParameter("categoryCode");
String goodsName = request.getParameter("goodsName");
String startPrice = request.getParameter("startPrice");
String endPrice = request.getParameter("endPrice");


ArrayList categoryList = (ArrayList)request.getAttribute("categoryList");
for(int i = 0; i < categoryList.size(); i++){
	CategoryVO cvo = (CategoryVO)categoryList.get(i);
	String param = "categoryCode=" + cvo.getCategoryNo();
	
	if(goodsName != null){
		param = param + "&goodsName=" + HttpUtil.encoding(goodsName);
	}
	
	if(startPrice != null){
		param = param + "&startPrice=" + startPrice;
	}
	
	if(endPrice != null){
		param = param + "&endPrice=" + endPrice;
	} 
%>
<a href=list.do?<%=param %>><%=cvo.getCategoryNm() %></a><br><br>
<%
} // for
%>
</td>
<td width=660>

<table border=0 width=660>
<%
	ProductVO goods = (ProductVO)request.getAttribute("goods");
%>

<tr>
<td width=200 bgcolor=#efefef>이름</td><td bgcolor=#fefefe align="left"><%=goods.getPrdNm() %></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>가격</td><td bgcolor=#fefefe align="left"><%=Util.moneyFormat( goods.getSellPrcUnit() )%> 원</td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>상세정보</td><td align="left"><%=goods.getPrdDes() %></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>이미지</td><td bgcolor=#fefefe align="left"><img src=images/products/<%=goods.getImgGenFileNm() %>></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>A/S 가능 여부</td><td align="left"><%="Y".equals(goods.getAsFlg())?"가능":"불가"%></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>반품 가능 여부</td><td align="left"><%="Y".equals(goods.getReturnFlg())?"가능":"불가"%></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>판매시작일</td><td align="left"><%=Util.dateFormat( goods.getSellStartDt() )%></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>판매종료일</td><td align="left"><%=Util.dateFormat( goods.getSellEndDt() )%></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>배송 제약사항</td><td align="left"><%=goods.getDlvConstraint() %></td>
</tr>
<tr>
<td width=200 bgcolor=#efefef>등록일</td><td align="left"><%=Util.dateFormat( goods.getRegDtm() )%></td>
</tr>

</table>
<br>
<a href=basket.do?goodsCode=<%=goods.getPrdNo() %>>장바구니 담기</a> &nbsp;&nbsp;
<a href=javascript:history.go(-1)>이전 화면</a>&nbsp;&nbsp;


</td>
</tr>
</table>

</center>
</body>
</html>
