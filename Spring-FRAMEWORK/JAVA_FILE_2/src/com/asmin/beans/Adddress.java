package com.asmin.beans;

public class Adddress
{
	private int houseno;
	private String city;
	private int pincode;
	
	public int getHouseno() {
		return houseno;
	}
	public String getCity() {
		return city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Adddress [houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}