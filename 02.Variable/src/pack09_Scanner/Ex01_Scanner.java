package pack09_Scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner(입력) => 자바(출력) => 콘솔창
		Scanner sc = new Scanner(System.in); // 클래스의 초기화 식
		// 외부에서 들어오는 데이터를 사용해 보기위해 외워서 사용
		System.out.println("대기 할 건지?");
		String inputData = sc.nextLine();
		System.out.println("여기까지 왔는지?");
		int inputData1 = Integer.parseInt(inputData)+10;
		System.out.println(inputData1);
	}
}
