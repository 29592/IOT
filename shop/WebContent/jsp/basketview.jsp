<%
    //history.go(-1)로 이동하는 경우에도, 페이지를 새로 읽는다. (No cache)
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires",0);
	response.setHeader("Cache-Control","no-Cache");
%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sd.shop.vo.*"%>
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
	</tr>
</table>

<h3> 장바구니 목록보기</h3>
 
<table width=800 border=0>
	<tr>
		<td width=140 valign=top><b>category</b><br><br>
		<a href=list.do>전체보기</a><br><br>
		<%
			String categoryCode = request.getParameter("categoryCode");
			String goodsName = request.getParameter("goodsName");
			String startPrice = request.getParameter("startPrice");
			String endPrice = request.getParameter("endPrice");

			ArrayList categoryList = (ArrayList) request.getAttribute("categoryList");
			for (int i = 0; i < categoryList.size(); i++) {
				CategoryVO cvo = (CategoryVO) categoryList.get(i);
				String param = "categoryCode=" + cvo.getCategoryNo();

				if (goodsName != null) {
					param = param + "&goodsName="
							+ HttpUtil.encoding(goodsName);
				}

				if (startPrice != null) {
					param = param + "&startPrice=" + startPrice;
				}

				if (endPrice != null) {
					param = param + "&endPrice=" + endPrice;
				}
		%> <a href=list.do?<%=param %>><%=cvo.getCategoryNm()%></a><br><br>
		<%
			} // for
		%>
		</td>
		<td width=660 valign="top">

		<table border=0 width=660>
		     <tr>
				<td bgcolor=black width="240" height="30"><font color=white>상품이름</font></td>
				<td bgcolor=black width="100"><font color=white>단가</font></td>
				<td bgcolor=black width="80"><font color=white>수량</font></td>
				<td bgcolor=black width="100"><font color=white>금액</font></td> 
				<td bgcolor=black><font color=white>삭제</font></td> 
			</tr> 
			<%
				HashMap list = (HashMap) request.getAttribute("list");
				Iterator iter = list.values().iterator();
				int i = 0;
				int totPrice = 0;
				int prdPrice = 0;
				while (iter.hasNext()) {
					ProductVO gvo = (ProductVO) iter.next();
					String bgColor = null;
					if (i % 2 == 0)
						bgColor = "#efefef";
					else
						bgColor = "#fefefe";
					i++;

					String param = "goodsCode=" + gvo.getPrdNo();

					if (categoryCode != null) {
						param = param + "&categoryCode=" + categoryCode;
					}

					if (goodsName != null) {
						param = param + "&goodsName="
								+ HttpUtil.encoding(goodsName);
					}

					if (startPrice != null) {
						param = param + "&startPrice=" + startPrice;
					}

					if (endPrice != null) {
						param = param + "&endPrice=" + endPrice;
					}
					
					prdPrice = gvo.getSellPrcUnit() * gvo.getBasketCount(); //상품단가 * 주문수량
					totPrice += prdPrice;
			%>
			<tr>
				<td bgcolor=<%=bgColor %> height="25"><a href=detail.do?<%=param %>><%=gvo.getPrdNm()%></a></td>
				<td bgcolor=<%=bgColor %> align="right"><%=Util.moneyFormat( gvo.getSellPrcUnit() )%> 원</td>
				<td bgcolor=<%=bgColor %>><%=gvo.getBasketCount()%></td>
				<td bgcolor=<%=bgColor %> align="right"><%=Util.moneyFormat( prdPrice )%> 원</td> 
				<td bgcolor=<%=bgColor %>><a href=basketdelete.do?goodsCode=<%=gvo.getPrdNo() %>>삭제</a></td>
			</tr>
			<%
				}
			%>
		</table>
<br>		
		<table border=1 width=660>
			<tr>
				<td bgcolor=#efefef width="240">주 문  총 액</td>
				<td align="right"><%=Util.moneyFormat( totPrice )%> 원</td>
			</tr>
		</table> 
<br>
		<a href=order.do>주문하기</a></td>
	</tr>
</table>

</center>
</body>
</html>
