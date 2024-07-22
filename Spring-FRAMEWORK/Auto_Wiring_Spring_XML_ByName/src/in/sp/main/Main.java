package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args){
		
		String s = "/in/sp/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(s);
		
		Student sd = (Student)context.getBean("std");
		sd.display();
	}

}
