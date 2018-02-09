package com.sd.shop.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sd.fw.mvc.Action;
import com.sd.fw.mvc.HttpUtil;
import com.sd.shop.dao.MemDAO;
import com.sd.shop.vo.MemVO;
import com.sd.shop.vo.SessionVO;

public class LoginAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("password");
		 
		MemDAO dao = new MemDAO();
		MemVO vo = dao.getCustomer(id, passwd); 
		if(vo == null){
			String message = "아이디 또는 패스워드가 틀렸습니다.";
			request.setAttribute("message", message);
			HttpUtil.forward(request, response,"loginform.do");
			return;
		}
		 
		
		SessionVO svo = new SessionVO();
		svo.setMemId(vo.getMemId()); 
		svo.setMemNm(vo.getMemNm());
		svo.setMemCd(vo.getMemCd()); 
		svo.setEmail(vo.getEmail()); 
		
		HttpSession session = request.getSession();
		session.setAttribute("user", svo);
		session.setAttribute("basket", null); 

		HttpUtil.redirect(response, "list.do");
	}

}
