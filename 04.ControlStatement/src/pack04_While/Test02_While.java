package pack04_While;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
		int a = 0;
		while (a <= 4) {
			int b = 0;
			a++;
			System.out.println();
			while (b < a) {
				b++;
				System.out.print("★");
			}
		}

		Scanner sc = new Scanner(System.in);
		int userNum = Integer.parseInt(sc.nextLine());
		int i = 2;

		if (userNum < 2) {
			System.out.println("오류");
		} else {
			while (i <= userNum) {
				int j = 0;
				System.out.println(i + " 단 ");
				i++;
				while (j <= 8) {
					j++;
					System.out.print(i + " X " + j + " = " + (i * j) + " ");
				}
				System.out.println();
			}

		}
	}
}
