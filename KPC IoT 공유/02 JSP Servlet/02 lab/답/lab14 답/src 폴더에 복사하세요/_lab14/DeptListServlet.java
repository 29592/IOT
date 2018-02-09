package _lab14;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbcex.dept.DeptDAO;
import jdbcex.dept.DeptVO;

@WebServlet("/aaaa")
public class DeptListServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    DeptDAO dao = new DeptDAO(); 
	    ArrayList<DeptVO> list = dao.getDeptList(); 
	    request.setAttribute("list", list);
	    
	    RequestDispatcher rd = 
	    		request.getRequestDispatcher("/_lab14/deptList.jsp");
	    rd.forward(request, response);
	}
}










