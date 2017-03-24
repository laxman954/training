package com.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lperumalm
 * Session 4
 */
public class LoginController extends HttpServlet{
	
	private static final long serialVersionUID = 3837085715644496028L;
	
	private static final String VIEW_LOGIN_FORM_JSP = "loginform.jsp";
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Login GET Method Called");
		req.getRequestDispatcher(VIEW_LOGIN_FORM_JSP).forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
		String username = req.getParameter("uname");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		String[] usernames = {"lekshmana","sudha","kokila"};
		
		if(Arrays.asList(usernames).contains(username) 
				&& "admin123".equals(password)){
			RequestDispatcher dispatcher = req.getRequestDispatcher("profile");
			dispatcher.forward(req, resp);
		}else{
			out.print("<h1>Please Check Your username or password </h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher(VIEW_LOGIN_FORM_JSP);
			dispatcher.include(req, resp);
		}
	}

}
