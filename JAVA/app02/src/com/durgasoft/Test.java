package com.durgasoft;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args)throws Exception {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","Manager123");
		Statement statement = connection.createStatement();
		String primaryKeyColumns="";
		int primaryKeyColumnsCount = 0;
		System.out.print("Table Name   : ");
		String tableName = bufferedReader.readLine();
		String query = "Create Table "+tableName+"(";
		while(true) {
			System.out.print("Column Name           : ");
			String columnName = bufferedReader.readLine();
			
			System.out.print("Column Type           : ");
			String columnType = bufferedReader.readLine();
			
			System.out.print("Column Size           : ");
			String columnSize = bufferedReader.readLine();
			
			System.out.print("Primary Key[Yes/No]   : ");
			String primaryKeyOption = bufferedReader.readLine();
			
			if(primaryKeyOption.equalsIgnoreCase("Yes")) {
				primaryKeyColumnsCount = primaryKeyColumnsCount + 1;
				if(primaryKeyColumnsCount == 1) {
					primaryKeyColumns = primaryKeyColumns+columnName;
				}else {
					primaryKeyColumns = primaryKeyColumns+","+columnName;
				}	
			}
			query = query +columnName+ " " +columnType+ "("+columnSize+"),";
			
			System.out.print("One more column[Yes/No]     : ");
			String option = bufferedReader.readLine();
			if(option.equalsIgnoreCase("Yes")) {
				continue;
			}else {
				query = query+"primary key("+primaryKeyColumns+"))"; 
				break;
			}		 
		}
		//System.out.println(query);
		statement.executeQuery(query);
		System.out.println("Table "+tableName+" is created successfully");
		bufferedReader.close();
		connection.close();
	}

}
