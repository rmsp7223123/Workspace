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
		if (dataA > dataB) {
			System.out.println("data A : " + dataA);
			System.out.println("data B : " + dataB);
			for (int i = dataB; i<dataA; i++) {
				sum += dataB++;
			}
			System.out.println("총합: " +(sum+dataA));
		} else if (dataA < dataB) {
			for (int i = dataA; i<dataB; i++) {
				sum += dataA++;
			}
			System.out.println("총합: " +(sum+dataB));
		} else {
			sum = dataA + dataB;
			System.out.println("누적합 : " + sum);
		}
	}
}
