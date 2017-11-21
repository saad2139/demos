package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.revature.controllers.ReimbursementController;

public class DispatcherServlet extends DefaultServlet{

	private static final long serialVersionUID = -4309074987629377240L;

	private ReimbursementController rc = new ReimbursementController();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String actualURL = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(actualURL);
		
		System.out.println("server get requested");
		
		if(actualURL.startsWith("/Static")) {
			super.doGet(request, response);
            return;
		}
			
		
	}
}
