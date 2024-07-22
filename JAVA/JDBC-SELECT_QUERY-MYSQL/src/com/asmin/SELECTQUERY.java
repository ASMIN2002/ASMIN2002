package com.asmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SELECTQUERY {

	public static void main(String[] args)throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","Asmin@2002");
		
		PreparedStatement ps = con.prepareStatement("select * from emp");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String name1 = rs.getString("name");
			System.out.println(name1);
			
			String email1 = rs.getString("email");
			System.out.println(email1);
			
			String pass1 = rs.getString("pass");
			System.out.println(pass1);
			
			String gender1 = rs.getString("gender");
			System.out.println(gender1);
			
			String loc1 = rs.getString("loc");
			System.out.println(loc1);
			
			System.out.println();
					
		}
		con.close();
	}

}
