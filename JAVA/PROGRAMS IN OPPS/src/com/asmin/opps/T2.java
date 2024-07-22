package com.asmin.opps;

// best example of sharebility used in static variable  

class Tiku2{
	int i = 10;
	static int j = 10;
}
public class T2 {
	public static void main(String[] args) {
		Tiku2 t1= new Tiku2();
		System.out.println(t1.i+"    "+t1.j);  // 10     10
		t1.i=t1.i+1;
		t1.j=t1.j+1;
		System.out.println(t1.i+"    "+t1.j);  // 11     11
		System.out.println();
		
		Tiku2 t2 = new Tiku2();
		System.out.println(t2.i+"    "+t2.j);	// 10	 11
		t2.i=t2.i+1;
		t2.j=t2.j+1;
		System.out.println(t1.i+"    "+t1.j);	// 11     12
		System.out.println(t2.i+"    "+t2.j);	// 11	  12
		System.out.println();
		
		Tiku2 t3 = new Tiku2();
		System.out.println(t3.i+"    "+t3.j);	// 10     12
		t3.i=t3.i+1;
		t3.j=t3.j+1;
		System.out.println(t1.i+"    "+t1.j);	// 11     13
		System.out.println(t2.i+"    "+t2.j);	// 11     13
		System.out.println(t3.i+"    "+t3.j);   // 11     13

	}

}




//          output

//			10    10
//			11    11
//
//			10    11
//			11    12
//			11    12
//
//			10    12
//			11    13
//			11    13
//			11    13
