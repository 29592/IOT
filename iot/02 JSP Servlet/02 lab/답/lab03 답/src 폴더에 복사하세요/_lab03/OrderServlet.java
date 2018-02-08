package _lab03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lab03/OrderServlet")
public class OrderServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int total = 0;
		response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    request.setCharacterEncoding("UTF-8");
		
	    if (request.getParameter("init") != null) {
		} else {
			String book1 = request.getParameter("book1");
			String book2 = request.getParameter("book2");
			String book3 = request.getParameter("book3");
			String book4 = request.getParameter("book4");
			if (book1 != null) {
				int price = Integer.parseInt(book1) * Integer.parseInt(request.getParameter("book1qty"));
				total = total + price;
			}
			if (book2 != null) {
				int price = Integer.parseInt(book2) * Integer.parseInt(request.getParameter("book2qty"));
				total = total + price;
			}
			if (book3 != null) {
				int price = Integer.parseInt(book3) * Integer.parseInt(request.getParameter("book3qty"));
				total = total + price;
			}
			if (book4 != null) {
				int price = Integer.parseInt(book4) * Integer.parseInt(request.getParameter("book4qty"));
				total = total + price;
			}
		}
		System.out.println("총 주문 금액 " + total);
		out.print("총 주문 금액 " + total); 
		 
		out.print("<body>");
		out.print("<h3>눈에 띄는 새책</h3>");
		out.print("<form action=\"/02jspServlet/lab03/OrderServlet\" method=\"post\">");
		out.print("<table border=\"1\">");
		out.print("<tr>");
		out.print("<td><img src=\"/02jspServlet/_lab03/book1.jpg\" /></td>");
		out.print("<td><b>스페인은 가우디다</b><br>김희곤 저 | 오브제</td> ");
		out.print("<td>14,400원</td> ");
		out.print("<td>주문<br/><input type=\"checkbox\" name=\"book1\" value=\"14400\"/></td> ");
		out.print("<td>수량<br/> ");
		out.print("<select name=\"book1qty\"> ");
		out.print("<option>0</option>   ");
		out.print("<option>1</option>");    
		out.print("<option>2</option>");   
		out.print("<option>3</option>");  
		out.print("</select> ");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><img src=\"/02jspServlet/_lab03/book2.jpg\" /></td>");
		out.print("<td><b>우리 안의 식민사관 </b><br>이덕일 저 | 만권당</td>");
		out.print("<td>16,200원</td>");
		out.print("<td>주문<br/><input type=\"checkbox\" name=\"book2\" value=\"16200\"/></td> ");
		out.print("<td>수량<br> ");
		out.print("<select name=\"book2qty\">"  );
		out.print("<option>0</option>" );
		out.print("<option>1</option>" );
		out.print("<option>2</option>" );
		out.print("<option>3</option>" );
		out.print("</select> " );
		out.print("</td> " );
		out.print("</tr> " );
		out.print("<tr> " );
		out.print("<td><img src=\"/02jspServlet/_lab03/book3.jpg\" /></td>   " );
		out.print("<td><b>우리 성씨와 족보 이야기</b><br>박홍갑 저 | 산처럼</td> " );
		out.print("<td>12,250원</td> " );
		out.print("<td>주문<br/><input type=\"checkbox\" name=\"book3\" value=\"12250\"/></td> " );
		out.print("<td>수량<br>" );
		out.print("<select name=\"book3qty\"> " );
		out.print("<option>0</option>  " );
		out.print("<option>1</option>  " );
		out.print("<option>2</option>  " ); 
		out.print("<option>3</option>  " );
		out.print("</select> " );
		out.print("</td> " );
		out.print("</tr> " );
		out.print("<tr>  " );
		out.print("<td><img src=\"/02jspServlet/_lab03/book4.jpg\" /></td> " );
		out.print("<td><b>이이제이의 만화 한국현대사 1</b><br>굽시니스트 글,그림/이이제이 원작 | 왕의서재</td> " );
		out.print("<td>12,150원</td>  " );
		out.print("<td>주문<br/><input type=\"checkbox\" name=\"book4\" value=\"12250\"/></td> " ); 
		out.print("<td>수량<br>  " );
		out.print("<select name=\"/02jspServlet/lab03/book4qty\"> " );
		out.print("<option>0</option>  " );
		out.print("<option>1</option>  " );
		out.print("<option>2</option> " );
		out.print("<option>3</option> " );  
		out.print("</select>" );
		out.print("</td>" );
		out.print("</tr>" );
		out.print("</table>" );
		out.print("<br> <input type=\"submit\" value=\"주문하기\" /> 총 주문금액 : " + total);
		out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ");
	    out.print("	초기화<input type=\"checkbox\" name=\"init\"  />  ");
	    out.print("</form>  " );
	    out.print("</body> " );
	    out.print("</html> " );
	}
}
