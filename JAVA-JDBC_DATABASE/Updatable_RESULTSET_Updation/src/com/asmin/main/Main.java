package com.asmin.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("select * from emp1");
		) {
			while(resultSet.next()) {
				float esal = resultSet.getFloat("esal");
				if(esal<10000) {
					esal = esal + 500;
					resultSet.updateFloat(3, esal);
					resultSet.updateRow();
					System.out.println("Employee "+resultSet.getInt("eno")+" Updaed SuccessFully");
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
