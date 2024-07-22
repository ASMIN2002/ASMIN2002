class MyTa extends Thread{
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}
public class B {
	public static void main(String[] args) {
		MyTa myThread = new MyTa();
		myThread.run();
		for(int i = 0;i<10;i++) {
			System.out.println("MAIN THREAD");
		}
	}
}
