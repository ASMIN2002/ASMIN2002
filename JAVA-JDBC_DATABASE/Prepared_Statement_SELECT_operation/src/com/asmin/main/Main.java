package com.asmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 try(
				 
			Scanner s = new Scanner(System.in);	 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
			PreparedStatement ps = con.prepareStatement("select * from emp1");
			){
			 
			ResultSet resultSet = ps.executeQuery();
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("---------------------------");
			
			while(resultSet.next()) {
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
