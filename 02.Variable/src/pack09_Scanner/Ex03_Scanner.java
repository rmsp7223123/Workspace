package pack09_Scanner;

import java.util.Scanner;

public class Ex03_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 = sc.nextLine();
		double a = Double.parseDouble(data1)+10;
		System.out.println(a);
	}
}
