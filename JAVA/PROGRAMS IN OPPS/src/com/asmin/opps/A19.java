package com.asmin.opps;

// to return current class object by using this keyword

class AB19{
	AB19 getvalue(){
		AB19 a = new AB19();    // increase code Duplication 
		return a;
	}
	AB19 getval() {
		return this;
	}
}
public class A19 {
	public static void main(String[] args) {
		AB19 a1 = new AB19();
		System.out.println(a1);
		System.out.println();
		System.out.println(a1.getvalue());
		System.out.println(a1.getvalue());
		System.out.println(a1.getvalue());
		System.out.println();
		
		System.out.println(a1.getval());
		System.out.println(a1.getval());
		System.out.println(a1.getval());
	}

}
