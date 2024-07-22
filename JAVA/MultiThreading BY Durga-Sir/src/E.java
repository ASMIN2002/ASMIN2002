class Myte extends Thread{
	public void start() {
		System.out.println("START METHOD");
	}
	public void run() {
		System.out.println("RUN METHOD");
	}
}
public class E {
	public static void main(String[] args) {
		Myte myte = new Myte();
		myte.start();
		System.out.println("MAIN METHOD");

	}

}
// produced by only main thread
// it is not recommended to override start() otherwise don't go multithreading concept 