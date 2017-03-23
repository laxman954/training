package com.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigController extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletConfig config = getServletConfig();
		
		String applicationName = config.getInitParameter("application-name");
		
		out.print("Applicaiton name from servlet Config <b>" +applicationName+"</b>");
		
		String localeName = config.getInitParameter("local-name");
		
		out.print("<br />Locale name from servlet Config <b>" +localeName+"</b>");
		
		
		out.print("<br /><br /> Get All Elements <br />");
		Enumeration<String> configParams = config.getInitParameterNames();
		while (configParams.hasMoreElements()) {
			String name = (String) configParams.nextElement();
			out.print(" Element name  : "+name +" Value : "+config.getInitParameter(name)+"<br />");
		}
	}
	
}
