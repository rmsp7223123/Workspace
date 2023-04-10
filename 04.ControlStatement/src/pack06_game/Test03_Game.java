package pack06_game;

import java.util.Scanner;

public class Test03_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int lan, mat, eng;
			while(true) {
				System.out.println("국어 점수를 입력해주세요.");
				lan = Integer.parseInt(sc.nextLine());
				if (lan < 0 || lan > 100) {
					System.out.println("오류입니다. 다시입력해주세요.");
					continue;
				}
				break;
			}
			while(true) {
				System.out.println("영어 점수를 입력해주세요.");
				eng = Integer.parseInt(sc.nextLine());
				if (eng < 0 || eng > 100) {
					System.out.println("오류입니다. 다시입력해주세요.");
					continue;
				}
				break;
			}
			while(true) {
				System.out.println("수학 점수를 입력해주세요.");
				mat = Integer.parseInt(sc.nextLine());
				if (mat < 0 || mat > 100) {
					System.out.println("오류입니다. 다시입력해주세요.");
					continue;
				}
				int sum;
				sum = lan + mat + eng;
				int avg;
				avg= sum / 3;
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + avg);
				break;
			}
			break;
		}
	}
}
