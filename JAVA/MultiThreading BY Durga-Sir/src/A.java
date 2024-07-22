class MyThread extends Thread{
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}
public class A {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		for(int i = 0;i<10;i++) {
			System.out.println("MAIN THREAD");
		}

	}

}
