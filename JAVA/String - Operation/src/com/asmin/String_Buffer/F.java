package com.asmin.String_Buffer;

public class F {

	public static void main(String[] args) {
		
				StringBuffer sb = new StringBuffer();
				System.out.println(sb.capacity());
				sb.ensureCapacity(67);
				System.out.println(sb.capacity());// (if we provide value less then 16 then capacity value is 16)
												  // (if we provide value in between 17 and 34 then capacity value we will get 34)
											      // (if we provide value greater then 34 then we will get capacity value which we provided)

			}

}
