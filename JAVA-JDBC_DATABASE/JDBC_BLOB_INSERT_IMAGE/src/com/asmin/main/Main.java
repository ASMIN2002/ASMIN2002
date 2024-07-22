package com.asmin.main;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) {
		try(
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into empimg values(?,?,?)");				
				){
			preparedStatement.setInt(1, 111);
			preparedStatement.setString(2, "ASMIN");
			
			File file = new File("E:\\jdbc_images\\tiger.avif");
			FileInputStream fileInputStream = new FileInputStream(file);
			
			preparedStatement.setBinaryStream(3, fileInputStream, file.length());
			preparedStatement.executeUpdate();
			System.out.println("Employee inserted Successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
