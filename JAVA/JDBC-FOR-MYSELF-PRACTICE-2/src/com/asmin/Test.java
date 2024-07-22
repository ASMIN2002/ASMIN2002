package com.asmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Statement;

public class Test {

	public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SERVICES","root","Asmin@2002");
	
	PreparedStatement ps = con.prepareStatement("insert into worker values(?,?,?,?,?)");
	System.out.println("NYC");

	}

}
