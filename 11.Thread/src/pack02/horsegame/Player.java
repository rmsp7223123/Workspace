package pack02.horsegame;

public class Player extends Thread {
//	어떤 쓰레드가먼저 끝나는지에 따라서 등수를 내는 경마게임
	int num; // 선수번호(n)
	int speed; // 말의 속도(Random)

	public Player(int num, int speed) {
		this.num = num;
		this.speed = speed;
	}

	// thread.start(); 작업은 반드시 run메소드에 구현
	@Override
	public void run() {
		int hereLocation = 0;
		while (hereLocation < 100) {
			hereLocation += speed;
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			;
		}
		
		PlayMain.rank++;
		System.out.println(PlayMain.rank + "등 " + num + "번말");
		if(PlayMain.rank == 1 && PlayMain.user_input == num) {
			System.out.println("정답");
		} else if(PlayMain.rank == 1 && PlayMain.user_input != num){
			System.out.println("오답");
		}

	}
}
