package com.training.attribute.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.common.constants.ServletConstants;

/**
 * @author lperumalm
 * Session 6
 */
public class ServletSetAttributeExample extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
		ServletContext context = getServletContext();
		
		context.setAttribute(ServletConstants.TRAINING_NAME, "JAVA/J2EE 1 Set Attribute Training");
		PrintWriter out = resp.getWriter();
		out.print("<h1> Sample Servlet Set Attribute </h1>");
		out.println("<a href='s-getattribute' />Click here </a> To get Training Name");
	}

}