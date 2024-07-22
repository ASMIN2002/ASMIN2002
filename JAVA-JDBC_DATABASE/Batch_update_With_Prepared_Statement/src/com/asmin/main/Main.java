package com.asmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) {

		try(
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				PreparedStatement preparedStatement = connection.prepareStatement("insert into emp1 values(?,?,?,?)");
				) {
			
			preparedStatement.setInt(1, 111);
			preparedStatement.setString(2, "ASMIN");
			preparedStatement.setFloat(3, 5000);
			preparedStatement.setString(4, "HYD");
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 222);
			preparedStatement.setString(2, "CHINU");
			preparedStatement.setFloat(3, 6000);
			preparedStatement.setString(4, "BNGL");
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 333);
			preparedStatement.setString(2, "MEGHNA");
			preparedStatement.setFloat(3, 8000);
			preparedStatement.setString(4, "NETH");
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 444);
			preparedStatement.setString(2, "RITU");
			preparedStatement.setFloat(3, 6000);
			preparedStatement.setString(4, "BIHAR");
			preparedStatement.addBatch();
			
			int[] rowCount = preparedStatement.executeBatch();
			for(int rowCounts : rowCount) {
				System.out.println("RowCounts    : "+rowCounts);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
