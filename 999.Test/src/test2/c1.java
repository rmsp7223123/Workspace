package test2;

import java.util.Random;

public class c1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] numbers = new int[10];
		int a = ran.nextInt(10);
		int sum = 0;
		for (int i = 0; i < a; i++) {
			int b = ran.nextInt(10);
			numbers[i] = b;
			sum += b;

			System.out.println(numbers[i]);
		}
		System.out.println("총합 : " + sum);

	}
}
