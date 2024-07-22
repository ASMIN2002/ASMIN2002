package com.asmin.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.asmin.beans.Address;
import com.asmin.beans.Student;

@Configuration
public class ConfigFile
{
	@Bean
	public Address createAdd(){
		Address addr = new Address(111,"BLS",56765);
		return addr;
	}
	
	@Bean
	public Student createStd() {
		Student std = new Student(1,"SUCHI",createAdd());
		return std;
	}

}
