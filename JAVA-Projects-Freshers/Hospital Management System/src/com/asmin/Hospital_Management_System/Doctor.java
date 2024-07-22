package com.asmin.Hospital_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Doctor {
	private Connection connection;	

	
	public Doctor(Connection connection) {
		this.connection= connection;
		
	}
	
	
	public void viewDoctor() {
		String query = "select * from doctor";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("Doctors   : ");
			System.out.println("+----+-------------+-------------------+");
			System.out.println("| ID | NAME        | Specialization    |");
			System.out.println("+----+-------------+-------------------+");
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String  specialization = resultSet.getString("specialization");
				System.out.printf("| %-2s | %-11s | %-17s |\n",id,name,specialization);
				System.out.println("+----+-------------+-------------------+");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean getDoctordetails(int id) {
		String query = "SELECT * FROM doctor WHERE id=?";
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
