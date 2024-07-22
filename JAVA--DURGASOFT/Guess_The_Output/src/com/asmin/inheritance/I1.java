package com.asmin.inheritance;
class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int gear,int speed) { // 3,100
		this.gear = gear;
		this.speed = speed;
	}	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	public String toString() {
		return ("No of gears are "+gear+"\n"
				+"speed of bicycle is "+speed);
	}
}
class MoutainBike extends Bicycle{
	public int seatHeight;
	public MoutainBike(int gear,int speed,int startHeight) { // 3,100,25
		super(gear,speed);// 3, 100
		seatHeight = startHeight; // 25
	}
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	@Override
	public String toString() {
		return (super.toString() + "\nseat Height Is "
				+ seatHeight);
	}
}
public class I1 {
	public static void main(String[] args) {
		MoutainBike mb = new MoutainBike(3, 100, 25);
		System.out.println(mb.toString());

	}
}

// No of Gears are 3 
// Speed of the Bicycle is 100
// seat height is 25