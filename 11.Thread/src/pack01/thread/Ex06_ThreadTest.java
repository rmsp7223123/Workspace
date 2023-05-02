package pack01.thread;

public class Ex06_ThreadTest {
	public static void main(String[] args) {
		YoutubeThread yt = new YoutubeThread();
		MelonThread mt = new MelonThread();
		yt.start();
		mt.start();
	}
}
