package com.asmin.Anonymous_Inner_class;
interface I{
	void m1();
	void m2();
	void m3();
}
public class app01 {
	public static void main(String[] args) {
		I i = new I() {
			public void m1() {
				System.out.println("M1-AIC");
			}
			public void m2() {
				System.out.println("M2-AIC");
			}
			public void m3() {
				System.out.println("M3-AIC");
			}
		};
		i.m1();
		i.m2();
		i.m3();
		

	}

}
