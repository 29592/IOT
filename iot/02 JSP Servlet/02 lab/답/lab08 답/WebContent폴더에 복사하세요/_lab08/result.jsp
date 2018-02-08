<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
  <% String num1= request.getParameter("num1");
     String num2= request.getParameter("num2");
     try{
     int n1 = Integer.parseInt(num1);
     int n2 = Integer.parseInt(num2);
     
     String operator = request.getParameter("operator");
     out.print("결과 : ");
     
          if("plus".equals(operator)) out.print( n1+n2);
     else if("subtract".equals(operator)) out.print(n1-n2);
     else if("multiply".equals(operator)) out.print(n1*n2);
     else if("divide".equals(operator)) out.print(n1/n2);
     }catch(Exception e){
    	 out.print("숫자가 입력되어야합니다. ");
     }
  %>
 <br/> <a href=input.html>다시 계산</a> 
</body>
</html>