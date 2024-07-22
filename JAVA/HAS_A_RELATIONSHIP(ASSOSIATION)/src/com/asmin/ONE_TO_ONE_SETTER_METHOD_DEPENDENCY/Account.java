package com.asmin.ONE_TO_ONE_SETTER_METHOD_DEPENDENCY;

public class Account {
		private String accno;
		private String accHolderName;
		private String accType;
		private long balance;
		public String getAccno() {
			return accno;
		}
		public void setAccno(String accno) {
			this.accno = accno;
		}
		public String getAccHolderName() {
			return accHolderName;
		}
		public void setAccHolderName(String accHolderName) {
			this.accHolderName = accHolderName;
		}
		public String getAccType() {
			return accType;
		}
		public void setAccType(String accType) {
			this.accType = accType;
		}
		public long getBalance() {
			return balance;
		}
		public void setBalance(long balance) {
			this.balance = balance;
		}
		
		
		
		
}
