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
//		
//		Transaction transaction = session.beginTransaction();
//		Employee employee = new Employee();
//		employee.setEno(333);
//		employee.setEname("DURGA");
//		employee.setEsal(7000);
//		employee.setEaddr("ODISHA");
//		session.save(employee);
//		transaction.commit();
//		System.out.println("SUCCESSFULLY");
		
		Employee pkValue= new Employee();
		pkValue.setEno(333);
		pkValue.setEname("DURGA");
		Employee employee = (Employee)session.get(Employee.class, pkValue);
		if(employee != null) {
			System.out.println("Employee Details");
			System.out.println("-----------------");
			System.out.println("Employee Number  : "+employee.getEno());
			System.out.println("Employee Name    : "+employee.getEname());
			System.out.println("Employee Salary  : "+employee.getEsal());
			System.out.println("Employee Address : "+employee.getEaddr());
		}else {
			System.out.println("DOES NOT EXIST");
		}
		session.close();
		sessionFactory.close();
	}

}
