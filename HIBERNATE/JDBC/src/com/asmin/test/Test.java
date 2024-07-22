package com.asmin.test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

	public static void main(String[] args)throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","asmin");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into emp1 values(?,?,?,?)");
		preparedStatement.setInt(1, 112);
		preparedStatement.setString(2, "CHINU");
		preparedStatement.setFloat(3, 8000);
		preparedStatement.setString(4, "BNGL");
		
		int count = preparedStatement.executeUpdate();
		if(count > 0) {
			System.out.println("EMPLOYEE INSERTED SUCCESSFULLY");
		}else {
			System.out.println("EMPLOYEE INSERTION FAILED");
		}
		
		
	}

}
