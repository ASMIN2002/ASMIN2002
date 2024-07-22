package com.asmin.Metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
		DatabaseMetaData data = connection.getMetaData();
		System.out.println(data.getDatabaseProductName());
		System.out.println(data.getDatabaseProductVersion());
		System.out.println(data.getDriverMajorVersion());
		System.out.println(data.getDriverMinorVersion());
		System.out.println(data.getSQLKeywords());
		System.out.println(data.getNumericFunctions());
		System.out.println(data.getStringFunctions());
		System.out.println(data.supportsBatchUpdates());
		System.out.println(data.supportsStoredProcedures());		
	}

}
