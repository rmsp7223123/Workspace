package test2;

import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a 숫자를 입력해주세요.");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("b 숫자를 입력해주세요.");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println(a == b ? "같다" : a < b ? "작다" : "크다");

		System.out.println(a == 0 ? "0입니다" : a % 2 == 1 ? "홀수" : "짝수");
	}
}
