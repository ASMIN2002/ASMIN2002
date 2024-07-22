package com.asmin.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");

				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("select * from emp1");
		) {
			resultSet.moveToInsertRow();
			
			while(true) {
				System.out.print("Employee Number    : ");
				int eno = Integer.parseInt(bufferedReader.readLine());
				
				System.out.print("Employee Name      : ");
				String ename = bufferedReader.readLine();
				
				System.out.print("Employee Salary    : ");
				float esal =Float.parseFloat(bufferedReader.readLine());
				
				System.out.print("Employee Address   : ");
				String eaddr = bufferedReader.readLine();
				
				resultSet.updateInt(1, eno);
				resultSet.updateString(2, ename);
				resultSet.updateFloat(3, esal);
				resultSet.updateString(4, eaddr);
				
				resultSet.insertRow();
				
				System.out.println("Employee "+eno+" Inserted Successfully");
				System.out.println("One More Employee ? [Yes/No]");
				
				String userOption = bufferedReader.readLine();
				if(userOption.equalsIgnoreCase("Yes")) {
					continue;
				}else {
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
