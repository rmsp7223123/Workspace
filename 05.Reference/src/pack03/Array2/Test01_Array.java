package pack03.Array2;

import java.util.Random;
import java.util.Scanner;

public class Test01_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임이 시작됐습니다.");
		System.out.println("1부터 10사이의 숫자(난이도)를 입력해주세요.");
		int inputdata = Integer.parseInt(sc.nextLine());
		int random = new Random().nextInt(inputdata)+1;
		int sum = 0;
		if (inputdata < 1 || inputdata >10) {
			System.out.println("잘못 입력하셨습니다. 게임을 종료합니다.");
		} else {
			System.out.println(inputdata + "단계 입니다.");
			int[] array = new int[inputdata];
			while (true) {
				sum++;
				System.out.println(inputdata + " 이하의 숫자를 입력해주세요.");
				int inputdata2 = Integer.parseInt(sc.nextLine());
				if (inputdata2 == random) {
					System.out.println("입력하신 값 : "+ inputdata2 +" 정답입니다.");
				} else {
					System.out.println("입력하신 값 : "+ inputdata2 + " 오답입니다.");
					continue;
				}break;
			}
			System.out.println("총입력횟수 : " +sum);
		}
	}
}
