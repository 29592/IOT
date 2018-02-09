<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sd.shop.vo.*"%> 
<%@ page import="com.sd.fw.util.Util"%>
<%
	boolean isLogin = false;
	String memId = null;
	String memNm = null;
	String memCd = null;
	
	SessionVO svo = (SessionVO)session.getAttribute("user");
	if(svo!=null) {
		isLogin = true;
	}
	
	if(isLogin) {
		memId = svo.getMemId();
		memNm = svo.getMemNm();
		memCd = svo.getMemCd();
	}
	

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.sd.fw.mvc.HttpUtil"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>:: �¶��� ���θ� �Խ���</title>
<STYLE TYPE="text/css"> 
	td {font-family:   Times, ����ü; font-size:11pt;} 
</STYLE> 
</head>
<body>

<center>

<table width=800 border=0>
	<tr>
	    <td width="120"><%= isLogin ? memNm+"��" : "" %></td>
		<td align=right>&nbsp;</td>
		<td width="100" align="right">
		<%if(isLogin) { %>
		    <a href=logout.do>Log-Out</a>
		<%} else { %>
			<a href=loginform.do>Log-In</a>
		<%} %>
		</td>
		<td width="100"><a href=list.do>��ǰ ���</a></td>
		<td width="100"><a href=basketview.do>��ٱ��� ����</a></td>
	</tr>
</table>




<table width=800 border=0>

	<tr>
		
		<td width=660 valign="top">

		<table border=0 width=660>
			<tr>
			    <td width="100" bgcolor=black height="30"><font color=white>�̹���</font></td>
				<td width="220" bgcolor=black><font color=white>��ǰ�̸�</font></td>
				<td width="100" bgcolor=black><font color=white>����</font></td>
				<td width="100" bgcolor=black><font color=white>A/S ����</font></td>
				<td width="120" bgcolor=black><font color=white>�����</font></td>
			</tr>
			<%
				ArrayList list = (ArrayList) request.getAttribute("list");
				for (int i = 0; i < list.size(); i++) {
					ProductVO gvo = (ProductVO) list.get(i);
					String bgColor = null;
					if (i % 2 == 0)
						bgColor = "#efefef";
					else 
						bgColor = "#fefefe";

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
			%> 
			<tr>
			    <td bgcolor="ffffff"><img src=images/products/<%=gvo.getImgGenFileNm() %> width="60"></td>
				<td bgcolor=<%=bgColor %>><a href=detail.do?<%=param %>><%=gvo.getPrdNm()%></a></td>
				<td bgcolor=<%=bgColor %> align="right"><%=Util.moneyFormat( gvo.getSellPrcUnit() )%> ��</td>
				<td bgcolor=<%=bgColor %>><%="Y".equals(gvo.getAsFlg())?"����":"�Ұ�"%></td>
				<td bgcolor=<%=bgColor %>><%=Util.dateFormat( gvo.getRegDtm() )%></td>
			</tr>
			<%
				}
			%>
		</table>

		</td>
	</tr>
</table>

</center>
</body>
</html>