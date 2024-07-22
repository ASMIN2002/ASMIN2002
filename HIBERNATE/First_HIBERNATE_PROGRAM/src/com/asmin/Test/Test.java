package com.asmin.Test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.asmin.beans.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEno(1);
		employee.setEname("ASMIN");
		employee.setEsal(2000);
		employee.setEaddr("HYD");
		session.save(employee);
		transaction.commit();
		System.out.println("Employee Inserted Successfully");
		session.close();
		factory.close();
	}

}
