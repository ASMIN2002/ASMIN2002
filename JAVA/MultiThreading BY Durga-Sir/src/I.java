class Myti extends Thread{
	public void run() {
		System.out.println("CHILD THREAD");
}
}
public class I {

	public static void main(String[] args) {
		Myti myti = new Myti();
		Thread t1 = new Thread(myti);
		t1.start();
		System.out.println("MAIN THREAD");

	}

}
