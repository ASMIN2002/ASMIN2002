package com.asmin.opps;

// method chaining 
class B20{
	B20 m1(){
		System.out.println("m1-B");
		return this;
	}
    B20 m2(){
		System.out.println("m2-B");
		return this;
	}
    B20 m3(){
    	System.out.println("M3-B");
    	return this;
    }
    void m4(){
    	System.out.println("M4-B");
    }	
}

public class A20 {
	public static void main(String[] args) {
		B20 b = new B20();
		b.m1().m2().m3().m4();
		System.out.println();
		
		b.m1()
		     .m2()
		     .m3()
		      .m4();
		

	}

}
