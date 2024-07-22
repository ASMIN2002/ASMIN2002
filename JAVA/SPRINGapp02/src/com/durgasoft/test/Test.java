package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgsoft.beans.Welcome;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Config.xml");
		Welcome welcome = (Welcome) applicationContext.getBean("welcome");
		String message = welcome.sayWelcome();
		System.out.println(message);
	}

}
