package com.asmin.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asmin.Student.Student;

public class Main {
	public static void main(String[] args) {
		
		//String pp = "/com/asmin/Resources/web.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/asmin/Resources/web.xml");
		
		Student std = (Student)context.getBean("sid");
		std.display();
	}

}
