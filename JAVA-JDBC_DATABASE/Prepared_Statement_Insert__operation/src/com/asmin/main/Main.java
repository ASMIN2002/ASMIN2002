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
			PreparedStatement ps = con.prepareStatement("insert into emp1 values(?,?,?,?)");
			){
			 
			 while(true) {
				 System.out.print("Enter Employee No   : ");
				 int eno = s.nextInt();
				 
				 System.out.print("Enter Employee Name : ");
				 String ename = s.next();
				 
				 System.out.print("Enter Employee SAL  : ");
				 float esal = s.nextFloat();
				 
				 System.out.print("Enter Employee ADDR : ");
				 String eaddr = s.next();
				 
				 ps.setInt(1, eno);
				 ps.setString(2, ename);
				 ps.setFloat(3, esal);
				 ps.setString(4, eaddr);
				 
				 ps.executeUpdate();
				 System.out.println("Employee Inserted Successfully");
				 System.out.println();
				 System.out.print("OneMore Employee[yes/no]");
				 String user=s.next();
				 
				 if(user.equalsIgnoreCase("yes")) {
					 continue;
				 }else {
					 break;
				 }
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
