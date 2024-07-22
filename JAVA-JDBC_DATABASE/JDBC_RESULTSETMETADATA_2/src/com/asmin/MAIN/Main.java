package com.asmin.MAIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Main {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from emp1");
		
		ResultSetMetaData metaData = resultSet.getMetaData();
		
		int count = metaData.getColumnCount();
		
		for(int index = 1;index<=count;index++) {
			System.out.print(metaData.getColumnName(index)+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------");

		while(resultSet.next()) {
			for(int index=1;index<=count;index++) {
				
				System.out.print(resultSet.getString(index)+"\t");
			}
			System.out.println();
		}
	}

}
