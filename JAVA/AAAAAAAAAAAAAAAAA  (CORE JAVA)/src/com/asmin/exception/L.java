package com.asmin.exception;

import java.util.Date;

// example with
public class L {
	public static void main(String[] args) {
		try {
			// float f = 100/0;
			
			// Date date = null;
			// System.out.println(date.toString());
			
		}catch(ArithmeticException | NullPointerException e) {
			e.printStackTrace();
			
		}

	}

}
