package com.asmin.main;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) {
		
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				PreparedStatement preparedStatement = connection.prepareStatement("insert into webapps values(?,?)");
				     
				){
			preparedStatement.setString(1, "app02");
			File file = new File("E:\\xml\\web.xml");
			FileReader fileReader = new FileReader(file);
			preparedStatement.setCharacterStream(2, fileReader , file.length());
			preparedStatement.executeUpdate();
			System.out.println("Web application data inserted successfully");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
