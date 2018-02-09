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

public class LogoutAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		

		HttpSession session = request.getSession();
		session.removeAttribute("user");
		session.removeAttribute("basket");

		HttpUtil.redirect(response, "list.do");
	}

}
