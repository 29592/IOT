package _lab02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lab02/loginServlet")
public class loginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String id=   request.getParameter("id");
	  String pw=   request.getParameter("pw"); 
	  String nextPage="/_lab02/login_form.html";
	  if(id!=null&&id.equals("scott")&&pw!=null&&pw.equals("tiger")){
		  nextPage="/_lab02/main.html";
	  }
	  RequestDispatcher rd = request.getRequestDispatcher(nextPage) ;
	  rd.forward(request, response);
	}
}
