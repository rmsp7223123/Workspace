package test2;

import java.util.Scanner;

public class b4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("0보다 크고 100보다 작은 숫자를 입력해주세요.");
			int iData = Integer.parseInt(sc.nextLine());
			if (iData > 0 && iData < 100) {
				System.out.println("입력된 데이터 : " + iData);
				for (int i = 1; i <= iData; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("★");
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
