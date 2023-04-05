package pack03_For;

import java.util.Scanner;

public class Ex03_DebugFor {
	public static void main(String[] args) {
		// bug : 알수없는 오류가 나오면서 프로그램이 정상작동 하지 않을 때
		// debug : ↑ 오류를 찾아 바로잡는 과정
		// 브레이크 포인트(중단점) : 프로그램은 위에서 아래로 순차적으로 동작
		// 특정 줄(스택)에 멈추고 해당하는 동작전에 변수나 상황을 먼저 확인을 할 수있는 점(포인트)
		// 1~10번째 줄까지 프로그램이 진행 됨. ↑를 이용해 특정줄(n)에서 멈춤.
		Scanner sc = new Scanner(System.in);
		String inputdata = sc.nextLine();
		int userNum = Integer.parseInt(inputdata); // 숫자 외의 값이 입력되면 int형으로 바꾸다가 오류발생
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		for (int a = 1; a<=10; a++) { // 반복문 스택(줄)에 브레이킹 포인트를 걸면 안 될 확률이 높음
			System.out.print(a);
		}
	}
}
