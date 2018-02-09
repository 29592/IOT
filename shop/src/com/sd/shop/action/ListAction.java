package com.sd.shop.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sd.fw.mvc.Action;
import com.sd.fw.mvc.HttpUtil;
import com.sd.shop.dao.CategoryDAO;
import com.sd.shop.dao.ProductDAO;

public class ListAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ProductDAO gdao = ProductDAO.getInstance();
	
		String categoryCode = request.getParameter("categoryCode");
		String goodsName = request.getParameter("goodsName");
		String startPrice = request.getParameter("startPrice");
		String endPrice = request.getParameter("endPrice");
		int istartPrice = 0;
		int iendPrice = 0;
		try{
			istartPrice = Integer.parseInt(startPrice);
		}catch(Exception ex){}
		try{
			iendPrice = Integer.parseInt(endPrice);
		}catch(Exception ex){}
		
		ArrayList list = null;
		
//		if(goodsName != null || startPrice != null || endPrice != null){ // 상세조회시
//			list = gdao.getGoodsList(categoryCode, goodsName, istartPrice, iendPrice);
//		}else{
			list = gdao.getGoodsList(categoryCode); // 일반조회시
//		}
		
		CategoryDAO cdao = CategoryDAO.getInstance();
		ArrayList categoryList = cdao.getCategoryList();
		
		
		request.setAttribute("list", list);
		request.setAttribute("categoryList", categoryList);
		HttpUtil.forward(request, response, "/jsp/list.jsp");
	}

}
