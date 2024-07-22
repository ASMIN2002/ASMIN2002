class Mytk extends Thread{
	public void run() {
		System.out.println("run method executed by Thread : "+Thread.currentThread().getName() );
	}
}
public class K {
	public static void main(String[] args) {
		Mytk mytk = new Mytk();
		mytk.start();
		System.out.println("main method executed by Thread : "+Thread.currentThread().getName());
	}

}
