<%@page import="jdbcex.dept.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  ArrayList<DeptVO> list 
        = (ArrayList<DeptVO>)request.getAttribute("list");
    for(DeptVO vo : list){
    	out.print(vo.getDeptNo()+" "+vo.getDname()+" "+vo.getLoc()) ;
    }
%>