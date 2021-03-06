package com.sd.shop.action;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sd.fw.mvc.Action;
import com.sd.fw.mvc.HttpUtil;
import com.sd.shop.vo.ProductVO;
import com.sd.shop.vo.SessionVO;

public class OrderAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		/****************************
		    주문 / 결제 Action 구현  
		****************************/ 	 
			
		request.setAttribute("msg", "주문 관련 기능을  구현해야합니다. \\n [com.sd.shop.action.OrderAction]");
		HttpUtil.forward(request, response, "/jsp/back.jsp");
	}

}
