package com.asmin.opps;

class Cf{
	static {
		System.out.println("Class Loading ... ");
	}
	Cf(){
		System.out.println("Object Creating.... ");
	}
}
public class Class_ForName_Method {
	public static void main(String[] args)throws ClassNotFoundException{
		Class cls = Class.forName("Cf");
	}

}
