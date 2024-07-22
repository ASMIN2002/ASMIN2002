package com.asmin.opps;

class NT{
	static {
		System.out.println("Class Loading  ... ");	
	}
	NT(){
		System.out.println("Object Creating ...");
	}
}

public class NewInstance {
	public static void main(String[] args)throws Exception {
		Class cls = Class.forName("NT");
		Object obj = cls.newInstance();

	}

}
