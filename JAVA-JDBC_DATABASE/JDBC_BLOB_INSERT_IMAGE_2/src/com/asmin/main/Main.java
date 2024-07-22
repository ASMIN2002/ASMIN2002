package com.asmin.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		try(  
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				PreparedStatement preparedStatement = connection.prepareStatement("select * from empimg");
				ResultSet resultSet = preparedStatement.executeQuery();
				FileOutputStream fileOutputStream = new FileOutputStream("E:\\image\\newtiger.jpg");
				){
			resultSet.next();
			InputStream inputStream = resultSet.getBinaryStream("IMAGE");
			int val = inputStream.read();
			while(val != -1) {
				fileOutputStream.write(val);
				val = inputStream.read();
			}
			System.out.println("Employee Details");
			System.out.println("--------------------");
			System.out.println("Employee Number        : "+resultSet.getInt("eno"));
			System.out.println("Employee Name          : "+resultSet.getString("ename"));
			System.out.println("Employee Image         : E:\\\\image\\\\newtiger.jpg");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
