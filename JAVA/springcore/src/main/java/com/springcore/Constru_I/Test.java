package com.springcore.Constru_I;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Constru_I/ConstructConfig.xml");
		Persion p = (Persion)context.getBean("persion");
		System.out.println(p);
		
		Addition add = (Addition)context.getBean("add");
		add.doSum();
		
	}

}
