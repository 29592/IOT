package com.sd.shop.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sd.fw.mvc.Action;
import com.sd.fw.mvc.HttpUtil;
import com.sd.shop.dao.CategoryDAO;
import com.sd.shop.dao.ProductDAO;
import com.sd.shop.vo.ProductVO;
import com.sd.shop.vo.SessionVO;

public class BasketViewAction extends Action {

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
		
		HttpSession session = request.getSession();
		
		String path = "";
		boolean isLogin = false;
		SessionVO svo = (SessionVO)session.getAttribute("user");
		if(svo!=null) {
			isLogin = true;
		}
		if(!isLogin) { //로그인 하지 않은 경우
			request.setAttribute("msg", "먼저 로그인을 해야합니다.");
			path = "/jsp/back.jsp";
		} else {
		
			HashMap<String, ProductVO> map = (HashMap)session.getAttribute("basket");
	 
			if(map == null){
				session.setAttribute("basket", new HashMap());
				map = (HashMap)session.getAttribute("basket");
			}
	
			CategoryDAO cdao = CategoryDAO.getInstance();
			ArrayList categoryList = cdao.getCategoryList();
			
			
			request.setAttribute("list", map);
			request.setAttribute("categoryList", categoryList);
			path = "/jsp/basketview.jsp";
		}
		HttpUtil.forward(request, response, path);
	}

}
