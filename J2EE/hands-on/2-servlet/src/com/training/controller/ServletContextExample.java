package com.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextExample extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		String driverName = context.getInitParameter("DriverName");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.print("DriverName from context Param <b>"+driverName+"</b>");
	}
}
