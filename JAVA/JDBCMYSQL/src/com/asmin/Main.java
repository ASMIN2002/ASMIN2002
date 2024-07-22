package com.asmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args)throws Exception{
		
	
	String name1="MANAS";
	String email1 = "manas@123";
	String pass1 = "MANAS123";
	String gender1 = "male";
	String loc1 = "BIHAR";
	
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","Asmin@2002");
		
		PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, loc1);
		
		
		
		int i = ps.executeUpdate();
		if(i>0){
			System.out.println("SUCCESS");
		}else {
			System.out.println("FAILED");
		}		
		con.close();
	}

}
