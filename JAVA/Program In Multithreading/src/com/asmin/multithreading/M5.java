mpackage com.asmin.multithreading;

public class M5 {

	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		Thread thread = new Thread();
		System.out.println(Thread.activeCount());
		thread.start();
		System.out.println(Thread.activeCount());
	}
}
