package com.asmin.opps;

class Aa{
	int i,j,k;
	Aa(){
		
	}
	Aa(int x){
		i = x;
	}
	Aa(int x,int y){
		i=x;
		j=y;
	}
	Aa(int x,int y,int z){
		i=x;
		j=y;
		k=z;
	}
	void add() {
		System.out.println("ADDITION   : "+(i+j+k));
	}
}
public class A11 {
	public static void main(String[] args) {
		Aa a = new Aa();
		a.add();
		
		Aa a1 = new Aa(10);
		a1.add();
		
		Aa a2 = new Aa(10,20);
		a2.add();
		
		Aa a3 = new Aa(10,20,30);
		a3.add();
	}

}
