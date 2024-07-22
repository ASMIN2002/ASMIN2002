package com.asmin.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		LocalTime localTime = LocalTime.now();
		int hour = localTime.getHour();
		
		String msg = "";
		if(hour < 12) {
			msg = "Good Morning!";
		}else if(hour < 17) {
			msg = "Good AfterNoon!";
		}else {
			msg = "Good Evening!";
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:red; text-align:center'>");
		out.println("Hello Clint : "+msg);
		out.println("</h1></body></html>");
	
	}

}
