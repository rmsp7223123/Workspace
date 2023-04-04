import java.util.Scanner;

public class Test_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자만 입력해주세요. 숫자외에 값은 오류가 발생합니다.");
		String inputdata = sc.nextLine();
		//sc.nextLine==String
		
		// 콘솔창을 통해 입력받아온 String 데이터를 int로 바꾼후 해당 숫자가
		// 짝수인지 홀수인지 판단해 콘솔창에 출력 1=> 홀 2=> 짝
		// 콘솔창을 통해 String 데이터를 (숫자)두개 입력받는다.
		
		// 각각의 숫자는 num1과 num2로 구분
		// 두숫자의 더하기 빼기 곱하기 나누기 한 결과를 출력
		// 두숫자 중 더 큰숫자가 어떤 숫자인지 표시
		
		int a = Integer.parseInt(inputdata);
		String result1 = a % 2 == 1 ? "홀수" : "짝수";
		System.out.println(result1);
		// String result = Integer.parseInt(sc.nextLine()) % 2 ==1 ? "홀수" : "짝수";
		// System.out.println(Integer.parseInt(sc.nextLine()) % 2 ==1 ? "홀수" : "짝수");
		 		
		int num1 = Integer.parseInt(sc.nextLine()); // 엔터키 입력시 입력된 데이터를
		int num2 = Integer.parseInt(sc.nextLine()); // 바로 숫자로 변환하고 int에 할당
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		
		String result2 = num1 == num2 ? "같음" :num1 < num2 ? "num2가 더 큼" : "num1가 더 큼";
		System.out.println(result2);
	}
}
