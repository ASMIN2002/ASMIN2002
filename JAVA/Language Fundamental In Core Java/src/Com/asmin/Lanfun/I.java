package Com.asmin.Lanfun;

class I{
	public static void main(String[] args){
		int i = 0B1001;   // 1*2p0 + 0*2p1 + 0*2p2 + 1*2p3 =  1 +  8 =9
		int j = 0b1111;   // 1*2p0 + 1*2p1 + 1*2p2 + 1*2p3 =  1+2+4+8 = 15
		System.out.println(i);
		System.out.println(j);
		
		int k = 0101;	// 1*8p0 + 0*8p1 + 1*8p2 = 0+0+64+0 = 64 + 1 = 65
		System.out.println(k);

		int l = 0123; // 
		System.out.println(l);

		int a = 0;
		System.out.println(a);

		int b = 0x1764;	// 4*16p0 + 6*16p1 + 7*16p2 + 1*16p3 =  4+96+1792+4096=5988;
		System.out.println(b);

		int c = 0X12;  // 2*16p0 + 1*16p1 = 2+16 = 18;
		System.out.println(c);
}
}