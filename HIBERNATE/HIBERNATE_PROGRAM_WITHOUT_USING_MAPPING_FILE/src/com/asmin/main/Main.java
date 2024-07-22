package com.asmin.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.asmin.beans.Employee;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		
		configuration.setProperty("hibernate.connection.driver_class", "oracle.jdbc.OracleDriver");
		configuration.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521/orcl");
		configuration.setProperty("hibernate.connection.username", "system");
		configuration.setProperty("hibernate.connection.password", "asmin");
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		// configuration.addAnnotatedClass(Employee.class);
		configuration.addResource("Employee.hbm.xml");
		 
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
