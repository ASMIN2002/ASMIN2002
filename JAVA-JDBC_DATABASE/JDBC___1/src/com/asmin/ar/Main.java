package com.asmin.ar;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main{
	public static void main(String[] args) {
		try (
				FileOutputStream fileOutputStream = new FileOutputStream("E:/abc/xyz/emp.csv");
				 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from emp1");
				
				){
			      
			String data = "eno,ename,esal,eaddr\n";
			while(resultSet.next()) {
				data = data+resultSet.getInt("eno")+",";
				data = data+resultSet.getString("ename")+",";
				data = data+resultSet.getFloat("esal")+",";
				data = data+resultSet.getString("eaddr")+"\n";
			}
			
			fileOutputStream.write(data.getBytes());
			System.out.println("Successfull");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
