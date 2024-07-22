package com.asmin.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		
		try(
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
			// Statement statement = connection.createStatement();
			PreparedStatement statement = connection.prepareStatement("select * from register where uname = ? and upwd = ?");	
				) {
			
			System.out.print("User name   : ");
			String uname = bufferedReader.readLine();
			
			System.out.print("Password    : ");
			String upwd = bufferedReader.readLine();
			
		    //ResultSet resultSet = statement.executeQuery("select * from register where uname = '"+uname+"' and upwd = '"+upwd+"'");
			
			statement.setString(1, uname);
			statement.setString(2, upwd);
			
			ResultSet resultSet = statement.executeQuery();
			boolean b = resultSet.next();
			
			if(b == true) {
				System.out.println("Login Success");
			}else {
				System.out.println("Login Failed");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
