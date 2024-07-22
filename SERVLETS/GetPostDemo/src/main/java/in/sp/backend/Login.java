package in.sp.backend;

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

		String name =(String)request.getParameter("name1");
		String pass =(String)request.getParameter("pass1");
		
		if(name.equals("asmin") && pass.equals("1234")) {
			System.out.println("Login SuccessFull");
		}else {
			System.out.println("Login failed");
		}
	}

}
