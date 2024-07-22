package com.durgasoft.MainException;

public class ArithmeticException{

	public static void main(String[] args) {
		try {
			System.out.println("ASMIN KULDEEP JENA");
			//int num = 7 / 0;
			System.out.println("CHINMAY KUMAR JENA");
			System.out.println("NABIN KULDEEP JENA");
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.getMessage());
//			System.out.println("CATCH BLOCK");
		}finally {
			System.out.println("FINALLY BLOCK");
		}

	}		
}
 