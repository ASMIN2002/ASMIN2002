package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean("stu1")
	public Student stdId1(){
		Student std = new Student();
		
		std.setName("KULDEEP");
		std.setRollno(1001);
		std.setEmail("kuldeep@gmail.com");
		 
		return std;
	}
	@Bean("stu2")
	public Student stdId2(){
		Student std = new Student();
		
		std.setName("Kumar");
		std.setRollno(1002);
		std.setEmail("kumar@gmail.com");
		 
		return std;
	}
}
