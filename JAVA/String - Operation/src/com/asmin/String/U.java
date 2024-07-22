package com.asmin.String;

public class U {

	public static void main(String[] args) {
		String str = new String("ASMIN KULDEEP JENA");
		String[] st = str.split(" ");
		for(int index = 0;index<st.length;index++) {
			System.out.println(st[index]);
		}

	}

}
