package com.asmin.MAIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args)throws Exception {
		try(
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("select * from emp1");
				
				){
			
			System.out.println("Employee Details In Forward Direction");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("----------------------------");
			
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("eno")+"\t");
				System.out.print(resultSet.getString("ename")+"\t");
				System.out.print(resultSet.getFloat("esal")+"\t");
				System.out.print(resultSet.getString("eaddr")+"\n");
				
			}
			System.out.println();
			
			
			System.out.println("Employee Details In Backward Direction");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("----------------------------");
			
			while(resultSet.previous()) {
				
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
