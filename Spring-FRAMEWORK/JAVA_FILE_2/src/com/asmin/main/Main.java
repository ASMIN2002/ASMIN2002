package com.asmin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asmin.beans.Student;

public class Main {
	public static void main(String[] args) {
		String s = "/com/asmin/config/web.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(s);
		
		Student st= (Student)context.getBean("std");
		st.display();

	}

}
