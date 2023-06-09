package pack08_Casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10;
		double dNum = iNum; // 더 큰타입에 작은 타입을 담으면 자동 변환이 일어남(자동 형변환)
		System.out.println(iNum);
		System.out.println(dNum);
		// 작은 타입(int) => 큰 타입(double)로 자동 형변환
		// 묵시적 형변환, UpCasting
		double dNum2 = 30.5;
		// int iNum2 = dNum2; 큰 타입 => 작은 데이터 타입
		int iNum2 = (int)dNum2;
		// 명시적 형변환, DownCasting ==> Casting의 일반적인 의미
		System.out.println(dNum2);
		System.out.println(iNum2);
		// DownCasting은 표현할 수 없는 데이터를 버려버리는 문제가 발생.
		// long => int, int => float
		// 같은 숫자를 표현하는 데이터 타입끼리는 가능함.
		int num1 = 600;
		byte num2 = (byte)num1;
		System.out.println(num1);
		int num5 = 600;
		float num6 = num5;
		System.out.println(num6);
		float a = 50.512F;
		int b = (int)a;
		System.out.println(b);
		//UpCasting
	}
}
