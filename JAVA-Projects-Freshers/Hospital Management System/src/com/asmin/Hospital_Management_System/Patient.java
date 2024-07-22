package com.asmin.Hospital_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {
	
		private Connection connection;	
		private Scanner scanner;
		
		public Patient (Connection connection,Scanner scanner) {
			this.connection= connection;
			this.scanner=scanner;
		}
		public void addPatient() {
			System.out.print("Enter Patient Name   : ");
			String name = scanner.next();
			System.out.print("Enter Patient Age    : ");
			int age = scanner.nextInt();
			System.out.print("Enter Patient Gender : ");
			String gender = scanner.next();
			
			try {
				String query = "insert into pat(name,age,gender) values(?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, name);
				preparedStatement.setInt(2, age);
				preparedStatement.setString(3, gender);
				
				int effectedRows = preparedStatement.executeUpdate();
				if(effectedRows > 0) {
					System.out.println("Added Successfully .....");
				}else {
					System.out.println("Failed ... ");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public void viewPatient() {
			String query = "select * from pat";
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				ResultSet resultSet = preparedStatement.executeQuery();
				System.out.println("Patients   : ");
				System.out.println("+----+-------------+-------+------------+");
				System.out.println("| ID | NAME        | AGE   | GENDER     |");
				System.out.println("+----+-------------+-------+------------+");
				while(resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					int age = resultSet.getInt("age");
					String gender = resultSet.getString("gender");
					System.out.printf("| %-2s | %-11s | %-5s | %-10s |\n", id,name,age,gender);
					System.out.println("+----+-------------+-------+------------+");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public boolean getPatientdetails(int id) {
			String query = "SELECT * FROM PAT WHERE id=?";
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, id);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					return true;
				}else {
					return false;
				}
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			return false;
			
		}
}
