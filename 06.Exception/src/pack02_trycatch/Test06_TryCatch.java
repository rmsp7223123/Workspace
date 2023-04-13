package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test06_TryCatch {
	public static void main(String[] args) {
		int sum = 0;
		int inputdata;
		int random;
		System.out.println("1부터 10사이의 숫자(난이도)를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		try {
			inputdata = Integer.parseInt(sc.nextLine());
			random = new Random().nextInt(inputdata) + 1;
			System.out.println(inputdata + "단계 입니다.");
			System.out.println(inputdata + " 이하의 숫자를 입력해주세요.");
			int[] array = new int[inputdata];
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요.");
		}
		while (true) {
			try {
				sum++;
				inputdata = Integer.parseInt(sc.nextLine());
				random = new Random().nextInt(inputdata) + 1;
				if (inputdata == random) {
					System.out.println("입력하신 값 : " + inputdata + "번 정답입니다.");
				} else {
					System.out.println("입력하신 값 : " + inputdata + "번 오답입니다.");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요");
			}

		}
		System.out.println("총입력횟수 : " + sum);
	}
}
