package com.asmin.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.asmin.beans.Employee;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee employee = (Employee)session.get(Employee.class, 111);
		if(employee != null) {
			
			System.out.println("Employee Details");
			System.out.println("------------------");
			System.out.println("Employee Number    : "+employee.getEno());
			System.out.println("Employee Name      : "+employee.getEname());
			System.out.println("Employee Salary    : "+employee.getEsal());
			System.out.println("Employee Address   : "+employee.getEaddr());
			
		}else {
			System.out.println("Employee Does Not Exist");
		}
		session.close();
		factory.close();
	 

	}

}
