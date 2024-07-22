package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

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
	public Student createStu() {
		Student std = new Student();
		std.setRollno(1);
		std.setName("RAJU");
		// std.setAddress(createAdd());
		return std;
	}

}
