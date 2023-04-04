package pack01_if;

import java.util.Scanner;

public class Test02_DiceGame {
	public static void main(String[] args) {
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그 외에는 시작");
		Scanner sc = new Scanner(System.in);
		String inputdata = sc.nextLine();
		int a = Integer.parseInt(inputdata);
		if (a == -1) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("주사위 게임을 시작합니다.");
			System.out.println("사용자가 주사위를 굴릴 차례입니다. (굴리기 ENTER)");
			sc.nextLine(); // 엔터키를 누를때까지 대기
			int userNum = (int) (Math.random() * 6) + 1; // (1~6)
			System.out.println("사용자의 수 : " + userNum);
			System.out.println("컴퓨터가 주사위를 굴립니다. (진행 ENTER)");
			sc.nextLine();
			int comNum = (int) (Math.random() * 6) + 1; // (1~6)
			System.out.println("컴퓨터의 수 : " + comNum);
			if (userNum > comNum) {
				System.out.println("사용자의 수 : " + userNum + " 컴퓨터의 수 : " + comNum + " 사용자가 이겼습니다.");
			}  else if (userNum == comNum) {
				System.out.println("사용자의 수 : " + userNum + " 컴퓨터의 수 : " + comNum + " 비겼습니다.");
			} else {
				System.out.println("사용자의 수 : " + userNum + " 컴퓨터의 수 : " + comNum + " 컴퓨터가 이겼습니다.");
			}
		}
		
		
	}
}
