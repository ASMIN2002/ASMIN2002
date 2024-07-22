package com.asmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class Check{

	public static void main(String[] args) throws Exception{	
		
		Scanner s = new Scanner(System.in);
		
		while (true){		
		
		System.out.print("Enter Your id           : ");
		int sid = s.nextInt();
		
		System.out.print("Enter Your Name         : ");
		String sname = s.next();
		
		System.out.print("Enter Your Email        : ");
		String semail = s.next();
		
		System.out.print("Enter Your Fav-Subject  : ");
		String sfavsub = s.next();
	
		System.out.print("Enter Your Gender       : ");
		String gender = s.next();
			
		System.out.print("Enter Your Location     : ");
		String loc = s.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT","root","Asmin@2002");
		
		PreparedStatement ps = con.prepareStatement("insert into stu values(?,?,?,?,?,?)");
		ps.setInt(1, sid);
		ps.setString(2, sname);
		ps.setString(3, semail);
		ps.setString(4, sfavsub);
		ps.setString(5, gender);
		ps.setString(6, loc);
		
		int i = ps.executeUpdate();
		if(i>0){
			System.out.println("Your informations are added Successfully");
		}else {
			System.out.println("Not added , Please try again");
			
		}
		System.out.println();
		con.close();
		}
		
	}
}


