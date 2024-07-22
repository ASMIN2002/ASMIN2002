package com.springcore.Constru_I;

public class Persion {
		private String name;
		private int pid;
		
		public Persion(String name,int pid) {
			this.name = name;
			this.pid = pid;
		}

		@Override
		public String toString() {
			
			return this.name+" : "+this.pid;
		}
		
}
