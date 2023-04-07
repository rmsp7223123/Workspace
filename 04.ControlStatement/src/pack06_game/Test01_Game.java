package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_Game {
	public static void main(String[] args) {

		int random = new Random().nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
//		System.out.println("1부터 100사이의 정수를 입력하세요.");
//
//		int total = 0;
//		while (true) {
//			int inputdata = Integer.parseInt(sc.nextLine());
//			total++;
//			
//			if (inputdata < random) {
//				System.out.println("더 큰 수를 입력하세요.");
//			} else if (inputdata > random) {
//				System.out.println("더 작은 수를 입력하세요.");
//			} else {
//				System.out.println("정답입니다.");
//				System.out.println("총 입력 횟수는 : " + total + "번입니다.");
//				break;
//			}
//		}
//		
//		for (int i = 0; i<1; i++) {
//			i = 0; i가 증가해도 다시 0으로 바꾸게 해 무한루프 반복.
//		}
//		for (int i = 0; i<1; i--) {
//			i 를 증가시키지 않음
//		}
//		for (;;) {
//			for문의 무한루프 식 == while(true)
//		}
		System.out.println("HighLow게임을 시작합니다.");
		System.out.println("숫자를 입력해 정답을 맞춰주세요.");
		int  count = 0;
		for (;;) {
			int userNum = Integer.parseInt(sc.nextLine());
			count ++;
			if (userNum == random) {
				System.out.println("정답입니다.");
				break;
			} else if (userNum < random) {
				System.out.println("더 큰수를 입력해주세요.");
			} else {
				System.out.println("더 작은수를 입력해주세요.");
			}
		}
		System.out.println("총 시도 횟수는 : " + count + "번입니다.");
	}
}
