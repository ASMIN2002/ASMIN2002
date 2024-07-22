package com.asmin.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				PreparedStatement preparedStatement = connection.prepareStatement("select * from webapps");
				ResultSet resultSet = preparedStatement.executeQuery();
				FileWriter fileWriter = new FileWriter("E:\\\\xml\\\\new-web.xml");  
				
				){
			resultSet.next();
			String appname = resultSet.getString("appname");
			Reader reader = resultSet.getCharacterStream("depl_desc");
			
			int val = reader.read();
			while(val != -1) {
				fileWriter.write(val);
				val = reader.read();
			}
			
			System.out.println("Web Application Details");
			System.out.println("-----------------------------");
			System.out.println("Application Name     : "+appname);
			System.out.println("DEPL DESC            : E:\\\\\\\\xml\\\\\\\\new-web.xml");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
