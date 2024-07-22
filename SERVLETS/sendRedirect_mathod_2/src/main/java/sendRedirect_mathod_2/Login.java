package sendRedirect_mathod_2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name1");
		String pass = request.getParameter("pass1");
		PrintWriter out = response.getWriter(); 
		
		if (name.equals("asmin") && pass.equals("1234")) 
		{
			request.setAttribute("name_key", "ASMIN KULDEEP");
			
			RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		}
		else 
		{
			response.setContentType("text/html");
			out.print("<h2 style='  color:red'>Login Failed<h2/>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}

	}

}
