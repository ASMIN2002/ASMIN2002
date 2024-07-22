package com.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifeCycle/Config.xml");
		
		context.registerShutdownHook();
		Book b1 = (Book)context.getBean("book");
		System.out.println(b1);
		
		

		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Pepsi p1= (Pepsi)context.getBean("pepsi");
		System.out.println(p1);
		
		System.out.println();
		Example ex = (Example)context.getBean("exm");
		System.out.println(ex);
	}

}
