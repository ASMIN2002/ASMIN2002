package Com.asmin.Lanfun;

public class C {
	public static void main(String[] args) {
	int i = 0b1010 + 010;
	int j = 010 + 0xb0;
	
	System.out.println(i);
	System.out.println(j);
	
	
	}
}
// 1010 = 0*2p0 + 1+2p1 + 0*2p2 + 1*2p3 = 2+8 = 10;
// 010 = 0*8p0 + 1*8p1 = 8; 
// Answer  = 10 + 8 = 18;

// 010 = 0*8p0 + 1*8p1 = 8 ;
// 1a = 11*16p1 = 176 + 8 = 184;