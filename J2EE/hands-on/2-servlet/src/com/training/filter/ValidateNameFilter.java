package com.training.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidateNameFilter implements Filter {

	FilterConfig config;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {

		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("Filter Invoked Pre Actions <br />");

		//Get config parameter from Filter Config
		boolean isMaintenance = Boolean.valueOf(config.getInitParameter("isMaintenace"));

		if (isMaintenance) {
			out.print("<h1>Site is under maintenance</h1>");
		} else {
			filterChain.doFilter(req, res);
		}
		
		out.println("Filter Invoked Post Actions <br />");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}

}
