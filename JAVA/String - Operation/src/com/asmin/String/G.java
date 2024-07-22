package com.asmin.String;



public class G{

	public static void main(String[] args) {
		byte[] bytes = {65 ,66 ,67 ,68 ,69 ,70};
		String str = new String(bytes, 1, 3);
		System.out.println(str);
		
	}

}
