package com.asmin.MultiThreading;
class AB extends Thread{
	@Override
	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println("JoinMethod   : "+i);
		}
	}
}
public class JoinMethoed extends AB{
public static void main(String[] args) {
	}

}