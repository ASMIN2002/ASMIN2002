package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfig 
{
	@Bean
	public Address createAdrObj() {
		Address addr = new Address();
		
		addr.setHouseno(111);
		addr.setCity("ODISHA");
		addr.setPincode(756019);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		std.setRollno(100);
		std.setName("MEGHNA");
		std.setAddress(createAdrObj());
		return std;
	}

}
