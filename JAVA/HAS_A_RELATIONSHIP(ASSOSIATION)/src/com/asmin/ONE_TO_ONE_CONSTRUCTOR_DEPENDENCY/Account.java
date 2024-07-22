package com.asmin.ONE_TO_ONE_CONSTRUCTOR_DEPENDENCY;

public class Account {
	
	private String accno;
	private String accholderName;
	private String accType;
	private long balance;
	
	public Account(String accno, String accholderName, String accType, long balance) {
		this.accno = accno;
		this.accholderName = accholderName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public void getAccountdetails() {
		System.out.println("Account Details");
		System.out.println("-------------------");
		System.out.println("Account Number  : "+accno);
		System.out.println("Account Holder name  : "+accholderName);
		System.out.println("Account Type  : "+accType);
		System.out.println("Account Balance  : "+balance);
	}
	
	
}
