package com.asmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 try(
				 
			Scanner s = new Scanner(System.in);	 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
			PreparedStatement ps = con.prepareStatement("delete from emp1 where esal < ?");
			){
			 
			System.out.print("Enter Salary Range    : ");
			float srange = s.nextFloat();
			
			ps.setFloat(1, srange);
			int rowcount = ps.executeUpdate();
			
			System.out.println("Employee Deleted    : "+rowcount);	 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
