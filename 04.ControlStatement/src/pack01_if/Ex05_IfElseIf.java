package pack01_if;

public class Ex05_IfElseIf {
	public static void main(String[] args) {
		// if else 문으로는 어떤 조건을 줄 때 true 인지와 false인지 두가지 경우만 만들 수 있음
		// if(조건식 A) {
		// 조건식 A가 TURE일 때 실행할 코드
		// } else if(조건식 B) {
		// 조건식A가 TRUE가 아니고 조건식B일 때 실행할 코드
		// }
		// else {
		// if와 else if의 모든 조건이 TRUE가 아닐때 실행할 코드
		// }
		int score = 7;
		if (score >= 90) {
			System.out.println("A");
		}
		if (score >= 80 && score <= 89) {
			System.out.println("B");
		}
		if (score >= 70 && score <= 79) {
			System.out.println("C");
		}
		if (score <= 69) {
			System.out.println("D");
		}

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	} // main
} // class
