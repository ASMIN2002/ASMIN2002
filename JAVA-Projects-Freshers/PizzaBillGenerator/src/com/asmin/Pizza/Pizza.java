package com.asmin.Pizza;

public class Pizza {

	private int price;
	private Boolean veg;
	
	private int extraCheese = 100;
	private int ExtraTopping = 100;
	private int beg = 20;
	
	private int basePizza;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedFortakeAway = false;
	
	
	public Pizza(Boolean veg) {
		this.veg = veg;
		
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		basePizza=this.price;
	}
	
	public void addExtraCheese() {
		
		isExtraCheeseAdded = true;
		this.price += extraCheese;
		
	}
	public void addExtraTopping() {
		
		isExtraToppingsAdded = true;
		this.price += ExtraTopping;
	}
	
	public void takeAway() {
		
		isOptedFortakeAway = true;
		this.price += beg;
		
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Pizza   : "+basePizza);
		
		if(isExtraCheeseAdded) {
			bill += "Extra Cheese Added: "+extraCheese+ "\n";
		}

		if(isExtraToppingsAdded) {
			bill += "Extra Toppings Added: "+ExtraTopping+ "\n";
		}

		if(isOptedFortakeAway) {
			bill += "Take Away : "+beg+ "\n";
		}
		
		bill += "Bill  : "+this.price+ "\n";
		System.out.println(bill);
	}
	
	

}
