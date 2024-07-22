package com.asmin.opps;

class SUP{
	void m1() {
		System.out.println("SUPER CLASS");
	}
}
class SUB extends SUP{
	void m2() {
		System.out.println("SUB CLASS");
	}
}
public class DownCasting {
	public static void main(String[] args) {
		// SUP sup = new SUP();
		// SUB sub = sup;   ---- > error
		
		//	SUP sup = new SUP();
        //  SUB sub = (SUB)sup;  ----- > classCastException 
		
		SUP sup = new SUB();
		SUB sub = (SUB)sup;   //   .....> correct
		
		sub.m1();
		sub.m2();

	}

}
