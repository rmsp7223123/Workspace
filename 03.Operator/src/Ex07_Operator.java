
public class Ex07_Operator {
	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		boolean result1 = num1 == num2; // true
		boolean result2 = num1 != num2; // false
		boolean result3 = num1 <= num2; // true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		
		// 식을 연결 ※ : 논리 연산자 ( 여러개의 조건을 판단)
		// 최종적인 결과 true 또는 false의 결과만 나온다
		// 조건식 A && 조건식 B : 조건식 A와B 둘다 참인경우에만 true
		// 조건식 A || 조건식 B : 조건식 A와B 둘 중 하나라도 참일경우 true
		System.out.println("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		// 하나의 false가 발생한 순간 뒤에 조건은 비교하지않음
		System.out.println(10 > 5 && 5 > 3); // True
		System.out.println(10 > 5 && 5 < 3); // False
		System.out.println(5 > 10 && 20 > 5); // False 
		System.out.println(5 > 10 && 5 > 20); // False
		
		// 하나의 true가 발생한 순간 뒤에 조건은 비교하지않음
		System.out.println(10 > 5 || 5 > 3); // True
		System.out.println(10 > 5 || 5 < 3); // True
		System.out.println(5 > 10 || 20 > 5); // True 
		System.out.println(5 > 10 || 5 > 20); // False
		
		System.out.println(10 > 5 && 20 > 5 || 5 > 10);
	}
}
