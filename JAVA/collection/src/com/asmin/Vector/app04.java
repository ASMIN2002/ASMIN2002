package com.asmin.Vector;

import java.util.Vector;

public class app04 {
	public static void main(String[] args) {
		Vector vector = new Vector(10,5);
		System.out.println(vector.capacity()); // 10
		
		for(int i =1;i<=11;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());// 20
		for(int i = 12;i<=16;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());// 40
		for(int i = 17; i<=22;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());// 80

	}

}
