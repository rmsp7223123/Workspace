package pack09_Scanner;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 = sc.nextLine();
		String data2 = sc.nextLine();
		int a = Integer.parseInt(data1);
		int b = Integer.parseInt(data2);
		System.out.println(a + b);	
		System.out.println(Integer.parseInt(data1) + Integer.parseInt(data2));
		int sum = Integer.parseInt(data1) + Integer.parseInt(data2);
		System.out.println(sum);
	}

}
