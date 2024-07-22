package com.asmin.b;

public class Main
{
		public String testmethod1() { // isosm
			System.out.println(35); // 1 - 35
			return new Main().testmethod3(new Main().testmethod2())+new Main().testmethod4("here"); // 30 + osm
		}
		public int testmethod2() 
		{
			System.out.println(25); // 2 - 25
			return 25+5;
		}
		public String testmethod3(int a)
		{
			System.out.println(15); // 4 - 15
			return "is";
		}
		public String testmethod4(String s) // here
		{
			System.out.println(45); // 3 - 45
			return "OSM";
		}
	public static void main(String[] args) {
		Main t = new Main();
		System.out.println("JAVA"+t.testmethod1()); // javaisosm

	}

}
