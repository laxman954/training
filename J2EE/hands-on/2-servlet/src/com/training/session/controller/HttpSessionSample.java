package com.training.session.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionSample extends HttpServlet {

	private static final String SESSION_PROFILE_JSP = "sessionProfile.jsp";
	private static final String SESSION_LOGIN_JSP = "sessionlogin.jsp";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		if (session.getAttribute("uname") == null) {
			resp.sendRedirect(SESSION_LOGIN_JSP);
		} else {
			req.getRequestDispatcher(SESSION_PROFILE_JSP).forward(req, resp);
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String username = req.getParameter("uname");
		String password = req.getParameter("password");

		PrintWriter out = resp.getWriter();

		String[] usernames = { "lekshmana", "sudha", "kokila" };

		if (Arrays.asList(usernames).contains(username) && "admin123".equals(password)) {

			// Getting session and set attribute to that
			HttpSession session = req.getSession();
			session.setAttribute("uname", username);
			// Setting session to expiry in 15 mins
			session.setMaxInactiveInterval(15 * 60);
			session.setAttribute("lastVisited", new Date(session.getLastAccessedTime()).toString());
			RequestDispatcher dispatcher = req.getRequestDispatcher(SESSION_PROFILE_JSP);
			dispatcher.forward(req, resp);
			
		} else {
			out.print("<h1>Please Check Your username or password </h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher(SESSION_LOGIN_JSP);
			dispatcher.include(req, resp);
		}
	}

}
