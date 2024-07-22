package com.asmin.test;

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
		employee.setEno(777);
		employee.setEname("ASMIN");
		employee.setEsal(3000);
		employee.setEaddr("BNGL");
		employee.setEemail("asminkuldeep6@gmail.com");
		session.save(employee);
		transaction.commit();
		System.out.println("SUCCESS DON'T WORRY");
		session.close();
		sessionFactory.close();

	}

}
