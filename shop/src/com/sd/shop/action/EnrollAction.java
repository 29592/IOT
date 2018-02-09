package com.sd.shop.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sd.fw.mvc.Action;
import com.sd.fw.mvc.HttpUtil;
import com.sd.shop.dao.CategoryDAO;
import com.sd.shop.dao.MemDAO;
import com.sd.shop.dao.ProductDAO;
import com.sd.shop.vo.MemVO;
import com.sd.shop.vo.ProductVO;
import com.sd.shop.vo.SessionVO;

public class EnrollAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String prd_no = request.getParameter("prd_no");
		String prd_nm = request.getParameter("prd_nm");

		ProductDAO dao = new ProductDAO();
		ProductVO vo = dao.getGoods(prd_no); 
		if(vo != null){
			String message = "상품번호가 겹칩니다.";
			request.setAttribute("message", message);
			HttpUtil.forward(request, response,"enrollform.do");
			return;
		}else {
			dao.setGoods(prd_no, prd_nm);
		}
		 
		HttpUtil.redirect(response, "list.do");
		
		
	}

}
