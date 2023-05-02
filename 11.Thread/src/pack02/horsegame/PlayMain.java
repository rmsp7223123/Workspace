package pack02.horsegame;

import java.util.Random;
import java.util.Scanner;

public class PlayMain {
	public static int rank = 0;
	public static int user_input = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("잠시후 경기가 시작됩니다.");
		System.out.println("몇번말(1~5)이 1등할지 골라주세요");
		user_input = Integer.parseInt(sc.nextLine());

		Player p1 = new Player(1, new Random().nextInt(10) + 1);
		Player p2 = new Player(2, new Random().nextInt(10) + 1);
		Player p3 = new Player(3, new Random().nextInt(10) + 1);
		Player p4 = new Player(4, new Random().nextInt(10) + 1);
		Player p5 = new Player(5, new Random().nextInt(10) + 1);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();

	}
}
