package com.asmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		
		Connection mysqlcon = null;
		Connection Orclcon = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Orclcon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ce","scott","asmin");
			mysqlcon= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
			
			Orclcon.setAutoCommit(false);
			mysqlcon.setAutoCommit(false);
			
			Statement orst = Orclcon.createStatement();
			Statement myst = mysqlcon.createStatement();
			
			int rowConut1 = orst.executeUpdate("update account set balance = balance - 500 where accno = 'abc124'");
			int rowConut2 = myst.executeUpdate("update account set balance = balance + 500 where accno = 'xyz124'");
			
			if(rowConut1 == 1 && rowConut2 == 1) {
				Orclcon.commit();
				mysqlcon.commit();
				System.out.println("Successfull");
			}else {
				Orclcon.rollback();
				mysqlcon.rollback();
				System.out.println("Failed");
			}
			
		}catch(Exception e) {
			
			try {
				
				Orclcon.rollback();
				mysqlcon.rollback();
				System.out.println("Failed");
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}finally {
			try {
				
				Orclcon.close();
				mysqlcon.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}