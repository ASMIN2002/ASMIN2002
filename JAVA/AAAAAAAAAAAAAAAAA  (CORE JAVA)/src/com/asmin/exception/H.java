package com.asmin.exception;

// Handle Exception by try-actch-finally

public class H {
	public static void main(String[] args) {
		try {
			int i = 100/0;
		}catch(Exception e) {
		 	e.printStackTrace();      // by Using printStackTrace();
		 	System.out.println();
		 	
		 	System.out.println(e);	  // by Using System.out.println(e);
		 	System.out.println();
		 	
		 	System.out.println(e.getMessage());  // by using e.getMessage();
		 	System.out.println();
		 	
		}finally {
			System.out.println("ASMIN");
		}

	}

}
