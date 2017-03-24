package com.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author lperumalm
 * Session 4
 */
public class ProfileController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String VIEW_PROFILE_PAGE = "profile.jsp";

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Profile Page GET Method Called "+req.getParameter("uname"));
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("uname");
		out.print("<h1>Welcome <h1><h2>"+username+" </h2>");
		
		//req.getRequestDispatcher(VIEW_PROFILE_PAGE).forward(req, resp);
	}

}
