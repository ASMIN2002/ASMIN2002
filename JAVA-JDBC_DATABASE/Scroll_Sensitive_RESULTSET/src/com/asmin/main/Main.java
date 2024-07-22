package com.asmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try(
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = statement.executeQuery("select * from emp1");	
						
				){
			
			System.out.println("Employee Details Before Updation");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------");
			
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("eno")+"\t");
				System.out.print(resultSet.getString("ename")+"\t");
				System.out.print(resultSet.getFloat("esal")+"\t");
				System.out.print(resultSet.getString("eaddr")+"\n");

			}
			System.out.println("Application is in pause state , go to the database and perform updation");
			System.out.println("Do not forget to commit operation");
			System.in.read();
			
			resultSet.beforeFirst();
			
			System.out.println("Employee Details After Updation");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------");
			
			while(resultSet.next()) {
				resultSet.refreshRow();
				System.out.print(resultSet.getInt("eno")+"\t");
				System.out.print(resultSet.getString("ename")+"\t");
				System.out.print(resultSet.getFloat("esal")+"\t");
				System.out.print(resultSet.getString("eaddr")+"\n");

			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
