package com.training.io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletStreamSample extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("image/jpeg");

		ServletOutputStream sos = resp.getOutputStream();

		FileInputStream fis = new FileInputStream(new File(
				"/Users/lperumalm/dev/project/personal/training/repo/training/J2EE/hands-on/2-servlet/src/sample-image.jpg"));
		BufferedInputStream bis = new BufferedInputStream(fis);

		BufferedOutputStream bos = new BufferedOutputStream(sos);
		int ch;
		while ((ch = bis.read()) != -1) {
			System.out.print(ch);
			bos.write(ch);
		}

		bis.close();
		fis.close();
		bos.close();
		sos.close();
	}
}
