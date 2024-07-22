package com.asmin01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DELETE {

	public static void main(String[] args)throws Exception {
		
		String email1 = "raju123@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","Asmin@2002");
		
		PreparedStatement ps = con.prepareStatement("delete from emp where email=?");
		ps.setString(1, email1);
		
		int i = ps.executeUpdate();
		if(i > 0) {
			System.out.println("DELETE successfully");
		}else {
			System.out.println("DELETE failed");
		}
		

	}
	

}
