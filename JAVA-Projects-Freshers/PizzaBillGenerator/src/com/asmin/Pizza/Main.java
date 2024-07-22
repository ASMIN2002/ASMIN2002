package com.asmin.Pizza;

public class Main {
	public static void main(String[] args) {
		
//		Pizza pizza = new Pizza(true);
	
//		pizza.addExtraCheese();
//		pizza.addExtraTopping();
//		pizza.takeAway();
//		pizza.getBill();
		
		DeluxPizza dp = new DeluxPizza(false);
		dp.addExtraCheese();
		dp.addExtraTopping();
		dp.getBill();
	}

}
