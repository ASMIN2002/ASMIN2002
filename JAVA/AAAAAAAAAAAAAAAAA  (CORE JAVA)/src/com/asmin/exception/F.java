package com.asmin.exception;

class F1{
	
}
class F2 extends F1{
	
}
public class F {
	public static void main(String[] args) {
		F2 f =(F2) new F1();                   // ClassCastException

	}

}
