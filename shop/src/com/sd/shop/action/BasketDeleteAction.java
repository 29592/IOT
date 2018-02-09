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

public class BasketDeleteAction extends Action {

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
		if(!isLogin) { //�α��� ���� ���� ���
			request.setAttribute("msg", "������ ������ϴ�.");
			path = "/jsp/back.jsp";
		} else {
			HashMap<String, ProductVO> map = (HashMap)session.getAttribute("basket"); 
			if(map == null){
				session.setAttribute("basket", new HashMap());
				map = (HashMap)session.getAttribute("basket");
			}
			
			map.remove(goodsCode);
				 
			request.setAttribute("msg", "��ٱ��Ͽ��� �����Ͽ����ϴ�."); 
			path = "/jsp/back.jsp";
		}
		
		HttpUtil.forward(request, response, path);
	}

}
