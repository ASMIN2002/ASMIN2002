package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServlet;

@Controller
public class MyController 
{
	// @RequestMapping(value="/helloPage", method =RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() 
	{
		System.out.println("Open hello Page");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
	}
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		return "about-us";
	}
	
	@GetMapping("/myForm")
	public String openMyFormpage() {
		return "my-form";
	}
	
	@PostMapping("/submitForm")
	public String handleMyForm(HttpServlet request) {
		
		String myname = request.getInitParameter("name1");
		String myemail = request.getInitParameter("email1");
		String myphone = request.getInitParameter("phone1");
		
		System.out.println("Name   : "+myname);
		System.out.println("Email Id   : "+myemail);
		System.out.println("Phone   : "+myphone);
		
		return "profile";
	}
}
