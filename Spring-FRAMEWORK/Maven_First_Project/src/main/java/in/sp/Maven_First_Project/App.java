package in.sp.Maven_First_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	String s = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(s);
        
        Student st=(Student)context.getBean("std");
        st.display();
    }
}
