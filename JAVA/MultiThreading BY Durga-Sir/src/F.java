class Mytf extends Thread{
	public void start() {
		super.start();
		System.out.println("START METHOD");
	}
	public void run() {
		System.out.println("RUN METHOD");
	}
}
public class F{
	public static void main(String[] args) {
		Mytf mytf = new Mytf();
		mytf.start();
		System.out.println("MAIN METHOD");
	}
}
// we can override start() by using super.start();
