package com.asmin.Metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Main {
	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from emp1");
		
		ResultSetMetaData metaData =(ResultSetMetaData) resultSet.getMetaData();
		
		int columnCount = metaData.getColumnCount();
		System.out.println(columnCount);
		
		for(int index=1;index<+columnCount;index++) {
			
			System.out.println("Column Name       : "+metaData.getColumnName(index));
			System.out.println("Column Type       : "+metaData.getColumnTypeName(index));
			System.out.println("Column Size       : "+metaData.getColumnDisplaySize(index));
			System.out.println("-----------------------------");
			
		}
	}

}
