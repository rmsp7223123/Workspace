package pack01_Variable;

public class Ex03_Variable {
	public static void main(String[] args) {
		int value = 30;
		int result = value + 10;
		System.out.println(result);
		// 숫자형 변수들은 사칙연산이 가능
		// 재할당 (변수를 계속 만드는게 아닌 값을 다시 줘서 바꿈)
		result = 1+1+10;
		System.out.println(result);
		result = 123+123;
		System.out.println(result);
		result = 456-123;
		System.out.println(result);
		result = 123*123;
		System.out.println(result);
		result = 456/123;
		System.out.println(result);
		
		result = value; // 같은 타입의 변수는 값을 담을 수 있다.
	}

}
