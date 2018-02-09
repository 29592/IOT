package com.sd.shop.action;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sd.fw.mvc.Action;
import com.sd.fw.mvc.HttpUtil;
import com.sd.shop.dao.ProductDAO;
import com.sd.shop.vo.ProductVO;
import com.sd.shop.vo.SessionVO;

public class BasketAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String goodsCode = request.getParameter("goodsCode");
		
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
			
			ProductVO vo = (ProductVO)map.get(goodsCode);
			if(vo == null){
				ProductDAO gdao = ProductDAO.getInstance();
				ProductVO goods = gdao.getGoods(goodsCode);
				goods.setBasketCount(1);
				map.put(goodsCode, goods);
			}else{
				vo.setBasketCount(vo.getBasketCount() + 1);
			}
			
			request.setAttribute("msg", "장바구니에 담았습니다.");
			path = "/jsp/back.jsp";
		}
		HttpUtil.forward(request, response, path);
	}

}
