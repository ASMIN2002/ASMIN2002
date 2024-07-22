class Mytj extends Thread{
	
}
public class J {
	public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Mytj mytj = new Mytj();
	System.out.println(mytj.getName());
	Thread.currentThread().setName("ASMIN");
	System.out.println(Thread.currentThread().getName());
	//System.out.println(10/0);

	}

}
// getname() and setname() using in Multithreading