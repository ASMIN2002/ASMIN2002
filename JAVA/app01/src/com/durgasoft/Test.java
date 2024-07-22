package com.durgasoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test{

	public static void main(String[] args)throws Exception {
		//Load and register Driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		//Establish the connection between Java application and database
		Connection connection = DriverManager.getConnection("jdbc:odbc:asmin", "SCOTT", "tiger");
		
		// Create Statement object
		Statement statement = connection.createStatement();
		
		//Write and execute Sql queries
		statement.executeUpdate("create table emp1(ENO number(5) primary key,ENAME varchar2(10),ESAL float(5), EADDR varchar2(10))");
		System.out.println("Table emp1 is created");
		
		//close the resources
		statement.close();
		connection.close();
		
	}

}
