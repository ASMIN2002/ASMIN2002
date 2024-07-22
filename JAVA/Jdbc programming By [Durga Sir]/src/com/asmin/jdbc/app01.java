package com.asmin.jdbc;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class app01{
	public static void main(String[] args) throws Exception{
	
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","asmin");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from SCHOOL");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		con.close();

	}

}
		