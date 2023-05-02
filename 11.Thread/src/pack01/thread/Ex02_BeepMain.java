package pack01.thread;

public class Ex02_BeepMain {
	public static void main(String[] args) {
//		Ex02_BeepTask eb = new Ex02_BeepTask(); == 인스턴스화
		Runnable eb = new Ex02_BeepTask(); // 같은 구조를 가지고 있기 때문에(run)
//		객체를 생성할 때 쓰이는 메소드 : 생성자 메소드
//		생성자 메소드는 클래스의 이름이 똑같다.
//		메소드이기 때문에 오버로딩(같은 이름으로 타입이나 파라미터 개수를 바꿔서 중첩시키는것)이 가능
		Thread thread = new Thread(eb);
		thread.start();
		System.out.println("XXXXXXXXXXXXXXXXXXX");
		for (int i = 0; i< 5; i++) {
			System.out.println("띠로롱");
			try {
				Thread.sleep(1000); // 메인 쓰레드의 휴지(main메소드에 잠깐의 텀)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
