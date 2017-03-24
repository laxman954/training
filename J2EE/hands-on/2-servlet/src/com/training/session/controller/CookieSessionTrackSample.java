package com.training.session.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieSessionTrackSample extends HttpServlet{
	
	private static final String COOKIE_LOGIN_FORM_JSP = "cookielogin.jsp";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Cookie Login GET Method Called");
		
		if(checkCookieLoginEnabled(req)){
			req.getRequestDispatcher("search.jsp").forward(req, resp);
		}
		
		req.getRequestDispatcher(COOKIE_LOGIN_FORM_JSP).forward(req, resp);
	}

	private boolean checkCookieLoginEnabled(HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		
		if(cookies != null){
			for(Cookie cookie:cookies){
				if("LOGIN_TOKEN".equals(cookie.getName())){
					String token =  cookie.getValue();
					if("0987387".equals(token))
						return true;
				}
			}
		}
		
		return false;
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
		String username = req.getParameter("uname");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		String[] usernames = {"lekshmana","sudha","kokila"};
		
		
		if(Arrays.asList(usernames).contains(username) 
				&& "admin123".equals(password)){
			
			Cookie cookie = new Cookie("LOGIN_TOKEN","0987387");
			//Specify in seconds
			cookie.setMaxAge(1000);
			resp.addCookie(cookie);
			RequestDispatcher dispatcher = req.getRequestDispatcher("search.jsp");
			dispatcher.forward(req, resp);
		}else{
			out.print("<h1>Please Check Your username or password </h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher(COOKIE_LOGIN_FORM_JSP);
			dispatcher.include(req, resp);
		}
	}
}
