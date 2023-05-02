package pack01.thread;

import java.awt.Toolkit;

public class Ex01_Thread {
//	main <- 자바의 시작점인 이유는 메인쓰레드이기때문
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i<5; i++) {
			toolkit.beep();
			System.out.println("ASDASD");
			try {
				Thread.sleep(1*2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
