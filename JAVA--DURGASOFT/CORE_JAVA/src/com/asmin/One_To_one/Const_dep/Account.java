package com.asmin.One_To_one.Const_dep;

public class Account{
	private String accNo;
	private String accHolderName;
	private String accType;
	private long balance;
	
	public Account(String accNo, String accHolderName, String accType, long balance){
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public void getAccountDetails() {
		System.out.println("Account Details");
		System.out.println("---------------");
		System.out.println("Account Number       : "+accNo);
		System.out.println("Account Holder Name  : "+accHolderName);
		System.out.println("Account Type         : "+accType);
		System.out.println("Account Balance      : "+balance);
	}
	 
	
}
