package _lab13;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbcex.emp.EmpDAO;
import jdbcex.emp.EmpVO;

@WebServlet("/_lab13/EmpLoginServlet")
public class EmpLoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String empno = request.getParameter("empno");
		  String ename = request.getParameter("ename");
		  EmpDAO dao = new EmpDAO(); 
		 
		  EmpVO vo =  dao.getEmp(Integer.parseInt(empno));
		  if (vo !=null && vo.getEname().equals(ename))//로그인 성공 
		  {   
		     HttpSession session = request.getSession();
		     session.setAttribute("user", vo) ; 
		  }
		  RequestDispatcher rd 
          = request.getRequestDispatcher("main.jsp");
		  rd.forward(request, response) ;
	}
}
