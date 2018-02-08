package _lab13;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbcex.emp.EmpDAO;
import jdbcex.emp.EmpVO;

@WebServlet("/_lab13/EmpInsertServlet")
public class EmpInsertServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("UTF-8");
		  String ename 	= request.getParameter("ename");
		  String empno 	= request.getParameter("empno");
		  String job 	= request.getParameter("job");
		  String deptno 	= request.getParameter("deptno");
		  
		  EmpVO vo = new EmpVO();
		  vo.setEmpNo (Integer.parseInt(empno)); //숫자
		  vo.setEname (ename) ;
		  vo.setJob (job) ;
		  vo.setDeptNo(Integer.parseInt(deptno)) ;//숫자
		  
		  EmpDAO dao = new EmpDAO();
		  dao.insertEmp(vo);
		  
		  ArrayList<EmpVO> list = dao.getEmpList(vo.getDeptNo());
	      if(list!=null  ){
	        	request.setAttribute("list", list  );
	      }
	        
		  RequestDispatcher rd 
          = request.getRequestDispatcher("empList.jsp");
          rd.forward(request, response) ;
		
	}
}
