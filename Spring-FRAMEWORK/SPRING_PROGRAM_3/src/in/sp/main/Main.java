package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.Student;

public class Main {

	public static void main(String[] args)
	{
		String p_path = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(p_path);

		Student std = (Student)context.getBean("student");
		std.display();
	}

}
