package pack06_game;

import java.util.Scanner;

public class Test02_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			int lan, mat, eng;
//			while(true) {
//				System.out.println("국어 점수를 입력해주세요.");
//				lan = Integer.parseInt(sc.nextLine());
//				if (lan < 0 || lan > 100) {
//					System.out.println("오류입니다. 다시입력해주세요.");
//					continue;
//				}
//				break;
//			}
//			while(true) {
//				System.out.println("영어 점수를 입력해주세요.");
//				eng = Integer.parseInt(sc.nextLine());
//				if (eng < 0 || eng > 100) {
//					System.out.println("오류입니다. 다시입력해주세요.");
//					continue;
//				}
//				break;
//			}
//			while(true) {
//				System.out.println("수학 점수를 입력해주세요.");
//				mat = Integer.parseInt(sc.nextLine());
//				if (mat < 0 || mat > 100) {
//					System.out.println("오류입니다. 다시입력해주세요.");
//					continue;
//				}
//				int sum;
//				sum = lan + mat + eng;
//				double avg;
//				avg= (double)sum / 3;
//				System.out.println("총점 : " + sum);
//				System.out.println("평균 : " + avg);
//				break;
//			}
//			break;
//		}
		
		int kor = -1, eng= -1, mat = -1; // -1이면 입력x 상태
		System.out.println("국어 점수를 입력해주세요.");
		while (kor == -1) {
			kor = Integer.parseInt(sc.nextLine());
			if ( kor > 0 && kor <= 100) {
				System.out.println("국어 성적입력완료");
			} else {
				System.out.println("잘못 입력하셨습니다. 1~100사이의 숫자를 넣어주세요.");
				kor = -1;
			}
		}
		System.out.println("영어 점수를 입력해주세요.");
		while (eng == -1) {
			eng = Integer.parseInt(sc.nextLine());
			if ( eng > 0 && eng <= 100) {
				System.out.println("영어 성적입력완료");
			} else {
				System.out.println("잘못 입력하셨습니다. 1~100사이의 숫자를 넣어주세요.");
				eng = -1;
			}
		}
		System.out.println("수학 점수를 입력해주세요.");
		while (mat == -1) {
			mat = Integer.parseInt(sc.nextLine());
			if ( mat > 0 && mat <= 100) {
				System.out.println("수학 성적입력완료");
			} else {
				System.out.println("잘못 입력하셨습니다. 1~100사이의 숫자를 넣어주세요.");
				mat = -1;
			}
		}
		int sum = kor + eng + mat;
		double avg = (double)sum / 3;
		
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
}
}
