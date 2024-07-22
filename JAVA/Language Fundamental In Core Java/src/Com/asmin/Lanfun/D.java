package Com.asmin.Lanfun;

public class D {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i++ - ++i); // 10++ - ++10 = 10 - 12 = 2
		System.out.println();
		
		int j =6;
		System.out.println(--j+--j-++j); // 5+4-5=4
		System.out.println();
		
		int k = 30;
		System.out.println(k);    // 30
		System.out.println(k++);  // 30
		System.out.println(++k);  // 32
		System.out.println(k--);  // 32
		System.out.println(--k);  // 30
		System.out.println(k);	  // 30
		System.out.println();
		
		int l = 7;
		System.out.println(--l+--l*--l+l--); // 6+5*4+4 = 6+20+4 = 30
		System.out.println();
		
		int m = 8;
		System.out.println(--m+--m/m++-++m*m--); // 7+6/6-8*8=7+1-8*8=7+1-64=8-64= -56
		System.out.println();
		
		int n = 7;
		System.out.println(--n*--n+--n%3+n++*--n);// 6*5+4%3+4*4 = 6*5+1+4*4= 30+1+16=47
		System.out.println();
		
		int o = 6;
		System.out.println((--o-++o)*(++o-++o)+(--o+--o)*(++o+--o)); // (5-6)*(7-8)+(7+6)*(7+6)=-1*-1+13*13 =1+13*13=170   
		System.out.println();
		
		
		
		
		
	}

}
