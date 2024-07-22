package com.asmin.main;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Main extends HttpServlet {

	static {
		System.out.println("Servlet Loading");
	}
	public Main() {
		System.out.println("Servlet Instantiation");
	}
	public void init() {
		System.out.println("Servlet Initialization");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Servlet : request Processing");
	}
	
	public void destroy() {
		System.out.println("Servlet De-Instantiation");
	}

}
