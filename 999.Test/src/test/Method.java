package test;

public class Method {
	public static void main(String[] args) {
		Method mt = new Method();
		mt.동생한테용돈(10000);
		int money = mt.라면심부름(100000);
		System.out.println("심부름 하고 나서 내가 받은 금액 : " + money);
	}

	// 리턴이 필요한 경우
	public int 라면심부름(int money) {
		System.out.println("동생한테 라면 심부름 시킴" + money + "원을 줌 == 결과가 필요함");
		System.out.println("수고비와 재료비가 깎임 50000");
		money -= 50000;
		return money;
	}

	// 리턴이 필요없는 경우
	public void 동생한테용돈(int money) {
		money = 20000; // 어떤 기능에 의해서 값의 바뀜
		System.out.println("동생한테 용돈 " + money + "원줌 == 결과가 필요없음");
		System.out.println(money + "원은 메소드내부에서만 존재하고 그 외에서는 메모리에 존재 X");
	}

}
