package com.asmin.multiThreading;

class Shot extends Thread{
	public void show() {
		for(int i =0;i<10;i++) {
			System.out.println("Shot");
		}
	}
}
class Miss extends Thread{
	public void show() {
		for(int i =0;i<10;i++) {
			System.out.println("Miss");
		}
	}
}

public class M2 {
	public static void main(String[] args) {
		Shot s = new Shot();
		Miss m = new Miss();
		
		s.show();
		m.show();

	}

}