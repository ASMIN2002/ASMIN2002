package com.asmin.Method_local_inner_class;
class A3{
	void m1() {
		interface I{
			void m2();
			void m3();
			void m4();
		}
		class I2 implements I{
			public void m2() {
				System.out.println("M2 - I");
			}
			public void m3() {
				System.out.println("M3 - I");
			}
			public void m4() {
				System.out.println("M4 - I");
			}
		}
		I i = new I2();
		i.m2();
		i.m3();
		i.m4();
	}
}
public class app03 {

	public static void main(String[] args) {
		A3 a = new A3();
		a.m1();

	}

}
