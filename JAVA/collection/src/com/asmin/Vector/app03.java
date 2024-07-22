package com.asmin.Vector;

import java.util.Vector;

public class app03 {
	public static void main(String[] args) {
		Vector vector = new Vector();
		System.out.println(vector.capacity()); // 10
		
		for(int i =1;i<=11;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());// 20
		for(int i = 12;i<=21;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());// 40
		for(int i = 22; i<=41;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());// 80

	}

}
