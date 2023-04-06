package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_Game {
	public static void main(String[] args) {

		int random = new Random().nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 100사이의 정수를 입력하세요.");

		int total = 0;
		while (true) {
			int inputdata = Integer.parseInt(sc.nextLine());
			total++;
			
			if (inputdata < random) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (inputdata > random) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("총 입력 횟수는 : " + total + "번입니다.");
				break;
			}
		}

	}
}
