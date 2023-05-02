package pack01.thread;

import java.awt.Toolkit;

public class YoutubeThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("유튜브를 재생중입니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
