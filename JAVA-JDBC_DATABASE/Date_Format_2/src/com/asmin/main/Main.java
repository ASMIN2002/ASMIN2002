package com.asmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		try(
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from emp2");
			ResultSet resultSet = preparedStatement.executeQuery();	
				) {
			resultSet.next();
			System.out.println("Employee Details");
			System.out.println("----------------------");
			System.out.println("Employee Number    : "+resultSet.getInt("ENO"));
			System.out.println("Employee Name      : "+resultSet.getString("ENAME"));
			System.out.println("Employee DOB       : "+resultSet.getDate("DOB"));
			System.out.println("Employee DOJ       : "+resultSet.getDate("DOJ"));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
