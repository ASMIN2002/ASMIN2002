 package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConf;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);
		
		Student st = context.getBean(Student.class);
		st.display();
	}
}
