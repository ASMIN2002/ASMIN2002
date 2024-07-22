package com.durgasoft.MainException;

class S{
	 private S() {
		System.out.println("A-CON-PRIVATE");
	}
}
public class IlligalAccessException {

	public static void main(String[] args)throws Exception {
		Class cls = Class.forName("com.durgasoft.MainException.IlligalAccessException");
		Object obj = cls.newInstance();
		System.out.println(cls);
	}

}
