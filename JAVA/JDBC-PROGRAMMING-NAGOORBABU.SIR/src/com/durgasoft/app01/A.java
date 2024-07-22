package com.durgasoft.app01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Iterator;

public class A {

	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT","root","Asmin@2002");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from stu");
		ResultSetMetaData metadata = resultSet.getMetaData();
		int columncount = metadata.getColumnCount();
		System.out.println(columncount);
		for (int columnIndex = 1;columnIndex<=columncount;columnIndex++){
			System.out.println("COLUMN NAME    : "+metadata.getColumnName(columnIndex));
			System.out.println("COLUMN TYPE    : "+metadata.getColumnType(columnIndex));
			System.out.println("COLUMN SIZE    : "+metadata.getColumnDisplaySize(columnIndex));
			System.out.println("----------------------------------");
		}
	}

}
