package pack05_etc;

import java.util.Scanner;

public class Ex01_Break {
	public static void main(String[] args) {
		// break문은 제어문을 종료하고 빠져나가는 기능
		// 무한루프하는 반복문 밑에 코드가 있으면 에러
		while (true) {
			while (true) {
				break; // 하나의 제어문에 해당
			}
			break;
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("루프중");
			if (a == -1) {
				System.out.println("종료");
				break;
			} else if (a == 1) {
				System.out.println("1번 메뉴에 대한 코딩");
			} else {
				System.out.println("잘못된 입력");
			}
		}

		System.out.println("출력");

	}// main
}// class
