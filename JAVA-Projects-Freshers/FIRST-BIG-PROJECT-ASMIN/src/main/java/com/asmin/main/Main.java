package com.asmin.main;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body style='background-color: yellow'>");
		out.println("<h1 style='text-align: center;align-items: center;'>");
		out.println("<marquee direction='left'>");
		out.println("LET'S  STUDY  WITH  ASMIN");
		out.println("</marquee></h1>");
		out.println("<hr style='border: 2px solid rgb(0, 0, 0);'>");
		out.println("<div style='height: 150px; width: 1520px;margin: 50px 0px;'>");
		out.println("<h2 style='color: green;margin: auto;padding: auto;'>");
		out.println(
				"<a href='register.html' style='text-decoration: none;margin: 20px 20px;float: left; border: 3px solid blue;'>");
		out.println("REGISTER HERE</a></h2>");
		out.println("<h2 style='color: green;margin: auto;padding: auto;'>");
		out.println(
				"<a href='login.html' style='text-decoration: none;margin: 20px 20px;float: right; border: 3px solid blue;'>");
		out.println("LOGIN HERE</a></h2></div>");
		out.println("<div><h2 style='border: 2px solid black;\'>");
		out.println("Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quas reiciendis iusto magni alias nisi eius, ab veritatis dolores laborum dicta molestiae nesciunt harum architecto a neque nam saepe atque accusamus iure odio. Atque, consequuntur ratione!lorem34 Lorem ipsum dolor sit amet consectetur adipisicing elit. Doloribus rem vitae asperiores odio, architecto cumque ut reiciendis laborum quis quidem dicta aut nisi quaerat error dignissimos officia obcaecati ducimus, quos saepe distinctio commodi qui! Fugit necessitatibus explicabo sequi fuga hic doloremque quo, natus nulla tempora veniam mollitia amet nobis voluptate!lorem34 Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium dignissimos sit minus voluptates tenetur amet ullam unde possimus sint cumque. Ab aliquam, vel adipisci quidem molestias neque est ea velit consequatur hic error! Quidem. lorem34 Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde recusandae earum inventore, corporis rerum nisi. Praesentium ad beatae, voluptas ipsum atque quo corrupti quibusdam nam laborum eius vero quidem natus delectus reprehenderit maxime quos?");
		out.println("</h2></div>");
		out.println("<footer style='text-align: center;align-items: center;'>");
		out.println("copyright @2024 reserved</footer>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("SUCCESS");

	}
}