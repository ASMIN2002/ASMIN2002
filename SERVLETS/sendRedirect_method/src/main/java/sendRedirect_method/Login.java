package sendRedirect_method;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String search =(String)request.getParameter("search1");
		
		//response.sendRedirect("https://www.google.com");
		response.sendRedirect("https://www.google.com/search?q="+search);

	}

}

