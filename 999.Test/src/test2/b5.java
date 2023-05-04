package test2;

import java.util.Scanner;

public class b5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A값을 입력해주세요.");
		int dataA = Integer.parseInt(sc.nextLine());
		System.out.println("B값을 입력해주세요.");
		int dataB = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int sumA = 0;
		int sumB = 0;
		// dataA 10 : dataB : 8
		// 8             10
		if(dataA > dataB) {
			int tempInt = dataA;
			dataA = dataB;
			dataB = tempInt;
		}
		for (int i = dataA; i <= dataB; i++) {
			if(i == dataB) {
				System.out.print(i + " = ");
			}else {
				System.out.print(i + " + ");				
			}
			sum+=i;
		}
		System.out.println(sum);
		
		
//		if (dataA > dataB) {
//			System.out.println("data A : " + dataA);
//			System.out.println("data B : " + dataB);
//			for (int i = 1; i <= dataB; i++) {
//				sumB += i;
//			}
//			for (int i = 1; i <= dataA; i++) {
//				sumA += i;
//			}
//			sum = sumB + sumA;
//			System.out.println("총합은 : " + sum);
//
//		} else if (dataA < dataB) {
//			System.out.println("data A : " + dataA);
//			System.out.println("data B : " + dataB);
//			for (int i = 1; i <= dataB; i++) {
//				sumB += i;
//			}
//			for (int i = 1; i <= dataA; i++) {
//				sumA += i;
//			}
//			sum = sumB + sumA;
//			System.out.println("총합은 : " + sum);
//
//		} else {
//			sum = dataA + dataB;
//			System.out.println("총합 : " + sum);
//		}
	}
}
