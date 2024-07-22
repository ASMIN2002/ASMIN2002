package com.asmin.game;

public class Player2 extends Player1{

	private int health;
	private boolean armour;
	
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.health = health;
		this.armour = armour;
	}

	@Override
	public void damageByGun1() {
		if(armour) {
			this.health -= 20;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is On. Got hit by Gun 1, health is reduced by 20 "+"new Health is "+this.health);
		}
		if(!armour) {
			this.health -= 30;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is Off. Got hit by Gun 1, health is reduced by 30 "+"new Health is "+this.health);
		}
		if(this.health==0) {
			System.out.println(getName()+" is Dead.");
		}
	}

	@Override
	public void damageByGun2() {
		if(armour) {
			this.health -= 40;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is On. Got hit by Gun 1, health is reduced by 40 "+"new Health is "+this.health);
		}
		if(!armour) {
			this.health -= 50;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is Off. Got hit by Gun 1, health is reduced by 50 "+"new Health is "+this.health);
		}
		if(this.health==0) {
			System.out.println(getName()+" is Dead.");
		}
		
	}

	@Override
	public void heal() {
		super.heal();
	}
	
	
	
}
