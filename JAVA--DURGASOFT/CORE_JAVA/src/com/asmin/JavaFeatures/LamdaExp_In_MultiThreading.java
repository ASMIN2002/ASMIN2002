package com.asmin.JavaFeatures;

//     NORMAL PROGRAM

//class WelcomeThread implements Runnable{
//	@Override
//	public void run() {
//		for(int i = 0;i<10;i++) {
//			System.out.println("Welcome Thread . ");
//		}
//		
//	}
//}

public class LamdaExp_In_MultiThreading {
	public static void main(String[] args) {

		// ANONOMOUS INNER CLASS

//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("Welcome Thread . ");
//				}
//
//			}
//		};
//		Thread thread = new Thread(runnable);
//		thread.start();

		// LAMDA EXPRESSION

//		Runnable runnable = ()-> {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("Welcome Thread . ");
//				}	
//		};
//		
//		Thread thread = new Thread(runnable);
//		thread.start();
//		
//	}
//}

		
		// SEND LAMDA EXPRESSION AS PARAMETER
		
		 new Thread(

				() -> {
					for (int i = 0; i < 10; i++) {
						System.out.println("Welcome Thread . ");
					}
				}).start();;

	}
}