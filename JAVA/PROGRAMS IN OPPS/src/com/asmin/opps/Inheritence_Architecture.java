package com.asmin.opps;
abstract class Account{
	
}
class SavingsAccount extends Account{
	public void getSavingsAccoutnDetails() {
		System.out.println("Savings Account Details .....");
	}
}
class CurrentAccount extends Account{
	public void getCurrentAccountDetails() {
		System.out.println("Current account Details .....");
	}
}
class Bank extends Account{
	public Account getAccount() {
		Account account = new SavingsAccount();
		return account;
	}
}
public class Inheritence_Architecture {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Account account = bank.getAccount();
		SavingsAccount savingsAccount = (SavingsAccount)account;
		savingsAccount.getSavingsAccoutnDetails();
	}

}
