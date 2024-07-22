package com.asmin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asmin.beans.Employee;

public class Main {
	public static void main(String[] args) {
		
		String s = "/com/asmin/resources/web.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(s);
		
		Employee emp = (Employee)context.getBean("ed");
		emp.display();
	}

}
