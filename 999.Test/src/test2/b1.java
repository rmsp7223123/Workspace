package test2;

import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		if (a % 2 == 1) {
			System.out.println("남자");
		} else if (a <= 0) {
			System.out.println("오류");
		} else {
			System.out.println("여자");
		}
	}
}
