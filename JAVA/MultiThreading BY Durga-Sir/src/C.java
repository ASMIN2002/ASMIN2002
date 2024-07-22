class Mytb extends Thread{
	public void run() {
		System.out.println("0-arg RUN");
	}
	public void run(int i) {
		System.out.println("int-arg RUN");
	}
}
public class C {
		public static void main(String[] args) {
		Mytb mytb = new Mytb();
		mytb.start();
		

	}

}
// start() always go for "no-arg" method