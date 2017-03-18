package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author lperumalm
 * 
 *         Servlet interface needs to be implemented for creating any servlet
 *         [either directly or indirectly). It provides 3 life cycle methods
 *         that are used to initialize the servlet, to service the requests, and
 *         to destroy the servlet and 2 non-life cycle methods.
 *
 */
public class SevletExample implements Servlet {

	ServletConfig config = null;

	/*
	 * initializes the servlet. It is the life cycle method of servlet and
	 * invoked by the web container only once.
	 * 
	 * @see javax.servlet.Servlet#init(javax.servlet.ServletConfig)
	 */
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("servlet is initialized");
	}

	/*
	 * provides response for the incoming request. It is invoked at each request
	 * by the web container.
	 * 
	 * @see javax.servlet.Servlet#service(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse)
	 */
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");

	}

	/*
	 * is invoked only once and indicates that servlet is being destroyed.
	 * 
	 * @see javax.servlet.Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("servlet is destroyed");
	}

	/*
	 * returns the object of ServletConfig.
	 * 
	 * @see javax.servlet.Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return config;
	}

	/*
	 * returns information about servlet such as writer, copyright, version etc.
	 * 
	 * @see javax.servlet.Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		return "copyright 2007-1010";
	}

}
