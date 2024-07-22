package com.asmin.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) {
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				PreparedStatement preparedStatement = con.prepareStatement("insert into emp2 values(?,?,?,?)");
				){
			preparedStatement.setInt(1, 111);
			preparedStatement.setString(2, "ASMIN");
			
			Date d1 = Date.valueOf("2002-03-27");
			preparedStatement.setDate(3, d1);
			
			java.util.Date d2 = new java.util.Date();
			long time = d2.getTime();
			Date d3 = new Date(time);
			preparedStatement.setDate(4, d3);
			
			int rowCount = preparedStatement.executeUpdate();
			if(rowCount == 1) {
				System.out.println("Employee Inserted Successfully");
			}else {
				System.out.println("Employee Insertion Faliure");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
