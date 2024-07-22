class Mytc extends Thread{

}
public class D {
	public static void main(String[] args) {
	Mytc mythread = new Mytc();
	mythread.start();

	}

}
// Highly Recommended to override run() otherwise don't go for multithreading concept 