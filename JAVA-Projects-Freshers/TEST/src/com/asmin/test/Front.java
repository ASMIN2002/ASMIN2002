package com.asmin.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Front {
	Scanner s = new Scanner(System.in);
	public void register() {
		
		
		System.out.print("Enter New UserName   : ");
		String uname = s.next();
		System.out.print("Enter NEW Password   : ");
		String upwd = s.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse","root","Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into reg values(?,?)");
			preparedStatement.setString(1, uname);
			preparedStatement.setString(2, upwd);
			int count = preparedStatement.executeUpdate();
			if(count > 0) {
				System.out.println("Registration Successfully");
			}else {
				System.out.println("Regtration Failed");
			}
			
		}catch(Exception e) {
			
		}
		
	}
	public void login() {
		System.out.print("Enter New UserName   : ");
		String uname = s.next();
		System.out.print("Enter NEW Password   : ");
		String upwd = s.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse","root","Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from reg where username=? and password =?");
			preparedStatement.setString(1, uname);
			preparedStatement.setString(2, upwd);
			
			try {
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next() ) {
					System.out.println("Login Success");
				}else {
					System.out.println("Login Failed");
				}
			}catch(Exception e) {
				System.out.println("Id and Password Does not Match");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}