
public class Test_01 {
	public static void main(String[] args) {
		int a;
		byte b;
		long c;
		double d;
		float e;
		String f;
		char g;
		a = 1;
		b = 2;
		c = 3L;
		d = 4.4;
		e = 5.5F;
		f = "AAA";
		g = 'a';
		int aa = 10;
		byte bb = 11;
		long cc = 12L;
		double dd = 1.3;
		float ee = 1.4F;
		String ff = "FFF";
		char gg = 'e';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(ff);
		System.out.println(gg);
		
		String numStr = "123";
		int numStr1 = Integer.parseInt(numStr) +10;
		System.out.println(numStr1);
		String numStr2 = ""+ numStr1;
		System.out.println(numStr2 + 10);
	}
}
