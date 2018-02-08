<%@ page import="jdbcex.dept.DeptDAO"%>
<%@ page import="jdbcex.dept.DeptVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"     pageEncoding="EUC-KR"%>
<%  
  String dname = request.getParameter("dname");
  String deptno = request.getParameter("deptno");
  String loc = request.getParameter("loc");
  DeptVO vo = new DeptVO();
  vo.setDeptNo(Integer.parseInt(deptno));
  vo.setDname(dname) ;
  vo.setLoc(loc) ;
  
  DeptDAO dao = new DeptDAO();
  dao.insertDept(vo);
  %>
