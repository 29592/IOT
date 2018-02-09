package day01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String n =  request.getParameter("username");
	  String p =  request.getParameter("phone");
	  String e =  request.getParameter("email");
	  String b =  request.getParameter("birthday");
	  String path =  request.getParameter("path");
	  String sports1 =  request.getParameter("sports1");
	  String sports2 =  request.getParameter("sports2");
	  String sports3 =  request.getParameter("sports3");
	  String sports4 =  request.getParameter("sports4");
	  String sports5 =  request.getParameter("sports5");
	  String sports6 =  request.getParameter("sports6");
	  String contact =  request.getParameter("contact"); 
	  if (n!=null) System.out.println("이름 " + n );
	  if (p!=null) System.out.println("전화번호 " + p );
	  if (e!=null) System.out.println("email " + e );
	  if (b!=null) System.out.println("생일 " + b );
	  if (path!=null) System.out.println("알게된 경로 " + path) ;
	  System.out.println("좋아하는 스포츠 ");
	  if (sports1!=null) System.out.println(sports1+" " );
	  if (sports2!=null) System.out.println(sports2+" " );
	  if (sports3!=null) System.out.println(sports3+" " );
	  if (sports4!=null) System.out.println(sports4+" " );
	  if (sports5!=null) System.out.println(sports3+" " );
	  if (sports6!=null) System.out.println(sports4+" " );
	  if (contact!=null) System.out.println("연락방법 "+contact);
	}
}
