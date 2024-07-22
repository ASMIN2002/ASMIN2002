package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConf {
	@Bean
	public Address createAdd() {
		Address addr = new Address();

		addr.setHouseno(111);
		addr.setCity("ODISHA");
		addr.setPincode(456765);

		return addr;
	}
	
	@Bean
	public Subjects createSub() {
		Subjects sub = new Subjects();
		
		List<String> sub_list = new ArrayList<String>();
		sub_list.add("JAVA");
		sub_list.add("PYTHON");
		sub_list.add("C++");
		
		sub.setSubjects(sub_list);
		
		return sub;
	}

	@Bean
	public Student createStu() {
		Student std = new Student();
		std.setRollno(1);
		std.setName("RAJU");
		// std.setAddress(createAdd());  // manually DI
		// std.setSubjects(createSub()); // manually DI
		return std;
	}

}
