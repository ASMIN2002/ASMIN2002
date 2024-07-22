package com.asmin.practice_multi_threading;

class Join extends Thread{
	public void run() {
		for(int i = 0;i< 10;i++) {		
			System.out.println("Child Thread  ");
		}
	}
}
public class Join_Method {
		public static void main(String[] args)throws Exception {
			Join join = new Join();
			join.start();
			join.join();
			for(int i = 0;i< 10;i++) {
				System.out.println("Main Thread  ");
			}
		}
}
