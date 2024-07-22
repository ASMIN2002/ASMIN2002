package com.asmin.Main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asmin.beans.Employee;

public class Main {
	public static void main(String[] args) {
		
		String tpath = "/com/asmin/Resources/web.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(tpath);
		
		Employee e1 = (Employee)context.getBean("eid1");
		e1.display();
		
		System.out.println();
		System.out.println("==================");
		System.out.println();
		
		Employee e2 = (Employee)context.getBean("eid2");
		e2.display();
	}

}
