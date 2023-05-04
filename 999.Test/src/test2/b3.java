package test2;

import java.util.Scanner;

public class b3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A값을 입력해주세요");
		int dataA = Integer.parseInt(sc.nextLine());
		System.out.println("B값을 입력해주세요");
		int dataB = Integer.parseInt(sc.nextLine());
		if (dataA > dataB) {
			System.out.println("data A : " + dataA + " data B : " + dataB);
			System.out.println(dataA + ">" + dataB);
		} else if (dataA < dataB) {
			System.out.println("data A : " + dataA + " data B : " + dataB);
			System.out.println(dataA + "<" + dataB);
		} else {
			System.out.println("data A : " + dataA + " data B : " + dataB);
			System.out.println(dataA + "=" + dataB);
		}
	}
}
