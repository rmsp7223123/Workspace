package pack04_While;

public class Ex01_While {
	public static void main(String[] args) {
		// for (1. 반복에 사용 할 변수 초기화 식 2. 조건식(TRUE일 때 동작) 4. 증감식 {
		// 3. 실제 반복할 코드(구간)
		// }
		
		
		// for문 : 반복 횟수를 정확히 알 때 수에 의해서 반복 시키는 경우
		// while문 : 반복 횟수를 정확하게 모를 때 조건에 의해서 반복시키는 경우
		// 1. 변수 초기화 식
		// while (2. 조건식) {
		// 반복하는 구간
		// 3. 증감식 or break를 이용한 반복문 종료
		// }

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		int a = 1;
		while (a <= 50) {
			System.out.println(a);
			a += 2;
		}
	}
}
