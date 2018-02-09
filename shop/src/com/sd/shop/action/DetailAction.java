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
import com.sd.shop.vo.CategoryVO;
import com.sd.shop.vo.ProductVO;

public class DetailAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ProductDAO gdao = ProductDAO.getInstance();
	
		String goodsCode = request.getParameter("goodsCode");
	
		ProductVO goods = gdao.getGoods(goodsCode);
		
		CategoryDAO cdao = CategoryDAO.getInstance();
		ArrayList<CategoryVO> categoryList = cdao.getCategoryList();

		
		request.setAttribute("goods", goods);
		request.setAttribute("categoryList", categoryList);
		HttpUtil.forward(request, response, "/jsp/detail.jsp");
	}

}
