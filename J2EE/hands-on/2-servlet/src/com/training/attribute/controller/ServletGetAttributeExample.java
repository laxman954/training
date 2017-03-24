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
public class ServletGetAttributeExample extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
		ServletContext context = getServletContext();
		String trainingName = (String) context.getAttribute(ServletConstants.TRAINING_NAME);

		PrintWriter out = resp.getWriter();
		out.print("Servlet Attribute Value for <b>" + ServletConstants.TRAINING_NAME + "</b> from attribute <b> "
				+ trainingName + " </b>");
	}

}
