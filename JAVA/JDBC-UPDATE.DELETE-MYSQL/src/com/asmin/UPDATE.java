package com.asmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UPDATE{

	public static void main(String[] args) throws Exception{
		
		String loc="PUNE";
		String email="nabin@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","Asmin@2002");
		PreparedStatement ps = con.prepareStatement("update emp set loc=? where email=?");
		ps.setString(1, loc);
		ps.setString(2, email);		
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("UPDATE SUCCESSFULLY");
		}else {
			System.out.println("UPDATE FAILED");
		}		
	}
}
