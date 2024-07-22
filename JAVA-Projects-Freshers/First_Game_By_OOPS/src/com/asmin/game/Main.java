package com.asmin.game;

public class Main {

	public static void main(String[] args) {

		// Player1 player1 = new Player1("ASMIN", "M416", 100);
//		System.out.println(player1.getName());
//    	System.out.println(player1.getHealth());
//		System.out.println(player1.getWeapon());
//		
//		player1.damageByGun1();
//		player1.damageByGun1();
//		player1.damageByGun2();
//		player1.heal();
		
		Player2 player2 = new Player2("CHINU", "AWM", 100, true);
		// player2.damageByGun1();
		player2.damageByGun2();
		player2.heal();
		player2.damageByGun1();
		
		
	}

}
