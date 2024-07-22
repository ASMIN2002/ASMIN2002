package com.asmin.Main;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {

	static {
		System.out.println("Welcome Servlet : Servlet Loading");
	}
	
	public WelcomeServlet(){
		System.out.println("WelcomeServlet : Servlet Instantiation");
	}
	
	public void init() throws ServletException{
		System.out.println("WelcomeServlet : Servlet Initialization");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("WelcomeServlet : Request Processing");
	}
	public void destroy() {
		System.out.println("WelcomeServlet : Servlet De-Instantiation");
	}
	
}

