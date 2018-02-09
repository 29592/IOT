package com.sd.fw.mvc;

import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {
	public static void forward(HttpServletRequest request, HttpServletResponse response, String path){
		try{
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request, response);
		}catch(Exception ex){
			System.out.println("forward 오류 : " + ex);
			throw new RuntimeException("forward 오류 : " + ex);
		}
	} // redirect
	
	public static void redirect(HttpServletResponse response, String path){
		try{
			response.sendRedirect(path);
		}catch(Exception ex){
			System.out.println("redirect 오류 : " + ex);
			throw new RuntimeException("redirect 오류  : " + ex);
		}
	} // forward
	
	public static String encoding(String url){
		try{
			url = URLEncoder.encode(url, "euc-kr");
		}catch(Exception ex){
			System.out.println("URL 인코딩 시  오류 : " + ex);
			throw new RuntimeException("URL 인코딩 시  오류 : " + ex);			
		}
		return url;
	}
	
	public static void main(String args[]){
		String str = "한글 사랑";
		str = HttpUtil.encoding(str);
		System.out.println(str);
	}
}
