class Mytg extends Thread{
	
}
public class G {

	public static void main(String[] args) {
		Mytg mytg = new Mytg();
		mytg.start();
		System.out.println("MAIN THREAD");
		mytg.start();
	}
}

// Exception at runtime = java.lang.IllegalThreadStateException