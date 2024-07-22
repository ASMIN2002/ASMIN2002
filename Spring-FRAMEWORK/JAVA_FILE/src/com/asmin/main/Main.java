package com.asmin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.asmin.beans.Student;
import com.asmin.resources.ConfigFile;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Student st = context.getBean(Student.class);
		st.display();
	}
}
