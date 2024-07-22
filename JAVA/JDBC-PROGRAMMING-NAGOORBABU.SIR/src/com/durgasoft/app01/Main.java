package com.durgasoft.app01;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT","root","Asmin@2002");
		DatabaseMetaData metaData = connection.getMetaData();
		System.out.println(metaData.getDatabaseProductName());
		System.out.println(metaData.getDatabaseProductVersion());
		System.out.println(metaData.getDatabaseProductName());
		System.out.println(metaData.getDatabaseMinorVersion());
		System.out.println(metaData.getDatabaseMajorVersion());
		System.out.println(metaData.getSQLKeywords());
		System.out.println(metaData.getNumericFunctions());
		System.out.println(metaData.getStringFunctions());
		System.out.println(metaData.supportsBatchUpdates());
		System.out.println(metaData.supportsStoredProcedures());
	}

}
