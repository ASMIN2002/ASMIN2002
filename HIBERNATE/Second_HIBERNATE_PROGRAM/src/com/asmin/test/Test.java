package com.asmin.test;

import java.sql.Connection;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.asmin.beans.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEno(111);
		employee.setEname("ASMIN");
		employee.setEsal(5000);
		employee.setEaddr("BNGL");
		
		session.save(employee);
		transaction.commit();
		System.out.println("SUCCESS");
		session.close();
		sessionFactory.close();

	}

}
