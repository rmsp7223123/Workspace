package pack03_For;

import java.util.Scanner;

public class Ex04_ForFor {
	public static void main(String[] args) {
//		 제어문은 무한하게 중첩이 가능 (순서 상관 X)
//		for (int a = 1; a <= 10; a++) {
//			System.out.print(a);
//			for (int b = 1; b <= 10; b++) {
//				System.out.print(b);
//			}
//		
//		for (int i = 2; i <= 9; i++) {
//			System.out.println();
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(i + " X " + j + " = " + (i * j) + " ");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		for (int a = 1; a <= 9; a++) {
			for (int b = 2; b<= 9; b++) {
				System.out.println(a * b);
			}
		}
		
	}
}
