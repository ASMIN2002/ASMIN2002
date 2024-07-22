package com.asmin.String;

public class S {
	public static void main(String[] args) {
		String str = new String("ASMIN KULDEEP JENA");
		byte[] bytes = str.getBytes();
		for(int index=0;index<bytes.length;index++) {
			System.out.println(bytes[index]+"  ======> "+(char)bytes[index]);
		}

	}

}
