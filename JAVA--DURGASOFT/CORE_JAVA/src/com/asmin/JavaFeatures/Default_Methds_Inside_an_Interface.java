package com.asmin.JavaFeatures;


interface Driver{ // SUN MICROSYSTEM
	public default void getDriverClass() {
		System.out.println("sun.jdbc.odbc.JdbcOdbcDriver");
	}
}

class JdbcOdbcDriver implements Driver{
	public void getDriverClass() {  // SunMicroSystem
		System.out.println("sun.jdbc.odbc.JdbcOdbcDriver");
	}
}

class OracleDriver implements Driver{ // Oracle Vendors
	public void getDriverClass() {
		System.out.println("oracle.jdbc.OracleDriver");
	}
}

class MySQLDriver implements Driver{ // MySQL Vendors
	public void getDriverClass() {
		System.out.println("com.mysql.cj.jdbc.Driver");
	}
}

class MSAccessDriver implements Driver{ // Microsoft
	
}

public class Default_Methds_Inside_an_Interface {
	public static void main(String[] args) {
		Driver oracleDriver = new OracleDriver();
		oracleDriver.getDriverClass();
		
		Driver mySqlDriver = new MySQLDriver();
		mySqlDriver.getDriverClass();
		
		Driver msaccessDriver = new MSAccessDriver();
		msaccessDriver.getDriverClass();
		
	}
}
