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
			PreparedStatement ps = con.prepareStatement("update emp1 set esal=esal+? where esal<?");
			){
			 
			 System.out.print("Bonus Amount   : ");
			 int bonus = s.nextInt();
			 
			 System.out.print("Salary Range   : ");
			 float srange = s.nextFloat();
			 
			 ps.setInt(1, bonus);
			 ps.setFloat(2, srange);
			 
			 int rowCount = ps.executeUpdate();
			 System.out.println("Employee Updated   : "+rowCount);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
