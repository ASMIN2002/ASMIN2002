package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/CollectionConfig.xml");
		Emp emp1 = (Emp)context.getBean("emp1");
		
		System.out.println(emp1.getEname());
		System.out.println(emp1.getPhn());
		System.out.println(emp1.getAddr());
		System.out.println(emp1.getCourses());
		

	}

}