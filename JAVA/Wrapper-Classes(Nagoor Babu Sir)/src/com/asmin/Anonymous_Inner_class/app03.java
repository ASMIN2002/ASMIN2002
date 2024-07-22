package com.asmin.Anonymous_Inner_class;

public class app03 {

	public static void main(String[] args) {
		Object object = new Object() {
			@Override
			public String toString() {	
				return "ASMIN KULDEEP JENA";
			}
		};
		System.out.println(object);

	}

}
