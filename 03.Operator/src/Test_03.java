import java.util.Scanner;

public class Test_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputdata = sc.nextLine();
		
		// 콘솔창을 통해 입력받아온 String 데이터를 int로 바꾼후 해당 숫자가
		// 짝수인지 홀수인지 판단해 콘솔창에 출력 1=> 홀 2=> 짝
		// 콘솔창을 통해 String 데이터를 (숫자)두개 입력받는다.
		
		// 각각의 숫자는 num1과 num2로 구분
		// 두숫자의 더하기 빼기 곱하기 나누기 한 결과를 출력
		// 두숫자 중 더 큰숫자가 어떤 숫자인지 표시
		
		int a = Integer.parseInt(inputdata);
		String result1 = a % 2 == 1 ? "홀수" : "짝수";
		System.out.println(result1);
		
		int num1 = 10, num2 = 11;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		int result2 = num1 > num2 ? num1 : num2 ;
		System.out.println("더 큰 숫자는 " + result2+" 입니다");
	}
}
