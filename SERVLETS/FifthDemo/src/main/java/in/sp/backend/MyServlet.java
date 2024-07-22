package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String myname = request.getParameter("name1");
		String myemail= request.getParameter("email1");
		
		System.out.println("NAME   : "+myname);
		System.out.println("EMAIL  : "+myemail);
		
		PrintWriter out = response.getWriter();
		out.println("NAME   : "+myname);
		out.println("EMAIL  : "+myemail);
		
	}
}
