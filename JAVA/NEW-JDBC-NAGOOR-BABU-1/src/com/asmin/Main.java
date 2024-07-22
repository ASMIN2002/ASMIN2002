package com.asmin;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {

	public static void main(String[] args) {
		try(
				FileOutputStream fileOutputStream = new FileOutputStream("E:/abc/xyz/stu.csv");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT","root","Asmin@2002");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from stu");
				) {
			
			String data = "Sid,SName,SEmail,SFavSub,gender,loc\n";
			while (resultSet.next()){
				data = data + resultSet.getInt("Sid")+",";
				data = data + resultSet.getString("SName")+",";
				data = data + resultSet.getString("SEmail")+",";
				data = data + resultSet.getString("SFavSub")+",";
				data = data + resultSet.getString("gender")+",";
				data = data + resultSet.getString("loc")+"\n";
			}
			fileOutputStream.write(data.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
