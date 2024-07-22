package com.asmin.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color: green;text-align:center;'>");
		out.println("Welcome to Servlet Programming");
		out.println("<hr></h1></body></html>");	
	}
}