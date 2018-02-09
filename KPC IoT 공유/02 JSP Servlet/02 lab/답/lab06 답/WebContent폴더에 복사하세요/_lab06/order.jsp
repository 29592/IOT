<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
 <% String product1 = request.getParameter("product1");
	String product2 = request.getParameter("product2");
	String product3 = request.getParameter("product3");
	String product4 = request.getParameter("product4");
	String product5 = request.getParameter("product5");
	String product6 = request.getParameter("product6");
	
	int sum = 0; 
	
	if (product1!=null) {
		out.println("콜라 선택 : " + product1+ "원 <br/>");
		sum = sum + Integer.parseInt(product1);
	}
	if (product2!=null) {
		out.println("사이다 선택 : " + product2+ "원 <br/>");
		sum = sum + Integer.parseInt(product2);
	}
	if (product3!=null) {
		out.println("환타 선택 : " + product3+ "원 <br/>");
		sum = sum + Integer.parseInt(product3);
	}
	if (product4!=null) {
		out.println("밀키스 선택 : " + product4+ "원 <br/>");
		sum = sum + Integer.parseInt(product4);
	}
	if (product5!=null) {
		out.println("봉봉 선택 : " + product5+ "원 <br/>");
		sum = sum + Integer.parseInt(product5);
	}
	if (product6!=null) {
		out.println("맥스웰 선택 : " + product6+ "원 <br/>");
		sum = sum + Integer.parseInt(product6);
	}
	out.print("선택한 음료의  총합  : " + sum  +"원<br/>");
	
	if(request.getParameter("input") == null || request.getParameter("input").trim().equals(""))
	   out.print("사용자가 금액을 입력하지 않았습니다. "   +"<br/>");
	else{
		try{
			int input = Integer.parseInt(request.getParameter("input"));
			out.print("사용자가 입력한 금액 :  " + input  +"원<br/>");
			out.print("       남은 금액 :  " + (input - sum ) +"원<br/>");
		}catch (Exception e) {
			out.print("금액은 숫자로 입력해야 합니다."  );
		}
	}
 %>
</body>
</html>