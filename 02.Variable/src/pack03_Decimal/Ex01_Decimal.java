package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		// int 이상의 값을 담을 수 있는 정수형 데이터 타입이 존재
		long l1;
		long l2 = 1234567890123456789L; // 숫자+long타입이라는 구분자가 존재
		System.out.println(l2);
		
		// 실수형 데이터타입 : float, double
		// float은 long과 마찬가지로 구분자F를 붙여야함.
		float f1;
		f1 = 1.2345F;
		System.out.println(f1);
		double d1;
		d1 = 1.23456;
		System.out.println(d1);
		// 대표적으로 쓰이는 정수 = int, 소수 = double
		
	}

}
