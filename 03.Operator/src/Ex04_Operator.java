
public class Ex04_Operator {
	public static void main(String[] args) {
		// 사칙연산 + 나머지
		// 연산을 먼저하기 위한 구분자 ==> ()
		int value1 = 5, value2 = 2;
		System.out.println("value1 + value2 : " + (value1 + value2));
		System.out.println("value1 - value2 : " + (value1 - value2));
		// String - int가 불가능하기 때문에 소괄호로 연산 우선순위를 준다.
		System.out.println("value1 * value2 : " + (value1 * value2));
		System.out.println("value1 / value2 : " + (value1 / value2));
		System.out.println("나머지는 %로 구한다 : " + (value1 % value2));
		
	}
}
