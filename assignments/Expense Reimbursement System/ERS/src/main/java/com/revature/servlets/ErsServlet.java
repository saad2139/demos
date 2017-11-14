package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

public class ErsServlet extends DefaultServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		System.out.println("doGet");
		super.doGet(request, response);
	}
	
	@Override
	protected void doPut(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException
	{
		System.out.println("doPut");
		super.doPut(arg0, arg1);
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException
	{
		System.out.println("service");
		super.service(arg0, arg1);
	}
}