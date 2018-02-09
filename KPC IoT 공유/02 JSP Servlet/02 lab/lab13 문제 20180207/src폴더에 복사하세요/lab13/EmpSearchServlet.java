package lab13;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbcex.emp.EmpDAO;
import jdbcex.emp.EmpVO;

@WebServlet("/lab13/EmpSearchServlet")
public class EmpSearchServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptno = request.getParameter("deptno");
		EmpDAO deptDao = new EmpDAO();
		ArrayList<EmpVO> list = deptDao.getEmpList(Integer.parseInt(deptno));
        if(list!=null  ){
        	request.setAttribute("list", list  );
        }
        RequestDispatcher rd 
        = request.getRequestDispatcher("empList.jsp");
        rd.forward(request, response) ;
	}
}
