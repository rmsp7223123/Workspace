package test;

public class MethodTest {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.기부(50000);
		String toy = mt.장난감심부름("로봇");
		System.out.println("동생이 사온 것 : " + toy);
	}

	public String 장난감심부름(String toy) {
		System.out.println("동생한테 " + toy + "(을)를 사오라고 함");
		toy = "인형";
		return toy;
	}

	public void 기부(int money) {
		System.out.println(money + "원을 기부함.");
	}

	public int a() {
		return 0;
	}

	public int a(int b) {
		return 0;
	}

	public int a(int b, int c) {
		return 0;
	}

	public int a(int b, int c, int d) {
		return 0;
	}

	public int a(int b, int c, int d, int e) {
		return 0;
	}

	public int a(int b, int c, int d, int e, int f) {
		return 0;
	}

	public int a(int b, int c, int d, int e, int f, int g) {
		return 0;
	}
}
