<%@page import="jdbcex.emp.EmpDAO"%>
<%@page import="jdbcex.emp.EmpVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"     pageEncoding="utf-8"%>
<%  
  request.setCharacterEncoding("utf-8");
  String ename = request.getParameter("ename");
  String empno = request.getParameter("empno");
  out.print(ename +" : " +  ename.length());
  String job = request.getParameter("job");
  EmpVO vo = new EmpVO();
  vo.setEmpNo (Integer.parseInt(empno));
  vo.setEname (ename) ;
  vo.setJob (job) ;
  
  EmpDAO dao = new EmpDAO();
  dao.insertEmp(vo);
%>
