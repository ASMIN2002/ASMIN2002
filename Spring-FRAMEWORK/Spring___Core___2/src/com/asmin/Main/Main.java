package com.asmin.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asmin.bean.Student;

public class Main {
	public static void main(String[] args) {
		
		String pth = "/com/asmin/Resources/web.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(pth);
		
		Student std = (Student)context.getBean("sid");
		std.display();
	}

}
