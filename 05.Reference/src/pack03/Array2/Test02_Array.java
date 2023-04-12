package pack03.Array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test02_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("랜덤한 숫자 맞추기 게임!");
		System.out.println("난이도를 선택해주세요");
		int level = Integer.parseInt(sc.nextLine());
		int[] gameArray = new int[level];
		String[] gameResults = new String[level];
		for (int i = 0; i < gameResults.length; i++) {
			gameResults[i] = "?";
		}
		int random = new Random().nextInt(level);
		
		gameArray[random] = 1; // 랜덤하게 한군데만 바뀜
		System.out.println(Arrays.toString(gameArray));
		while(true) {
			System.out.println("1부터 " + gameArray.length + "까지의 값을 입력");
			for (int i = 0; i < gameResults.length; i++) {
				System.out.print(gameResults[i] + " ");
			}
			System.out.println();
			int userNum = Integer.parseInt(sc.nextLine())-1;
			if(gameArray[userNum] == 1) {
				System.out.println("정답");
				break;
			} else {
				gameResults[userNum] = "X";
				System.out.println("오답");
				continue;
			}
		}
	}
}
