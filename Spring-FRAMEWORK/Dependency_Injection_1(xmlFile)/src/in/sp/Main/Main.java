package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args)
	{
		String s = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(s);
		
		Student std = (Student)context.getBean("stdid");
		std.display();

	}

}
 