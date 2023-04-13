package pack02_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01_TryCatch {
	public static void main(String[] args) {
//		try {
//			예외(오류)가 발생할 가능성이 있는 코드(코드 자체는 정상);
//			Integer.parseInt(sc.nextLine()); <== 사용자의 입력을 숫자로 바꾸는 기능
//		} catch (Exception e) {
//			예외가 발생할 시 처리할 코드(대안코드)	
//		}(선택) finally {
//			무조건 한번 실행되어야 하는 코드가 있다면 넣어줌.
//			데이터베이스의 연결을 해제하거나, 세션을 끊는다.
//		}
		
		Scanner sc = new Scanner(System.in);
		try {
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("오류가발생");
		}
		System.out.println("A");
		
//		[에러의종류]
//		1. 하드웨어적인 에러 : 치명적인에러 -> 프로그램이 실행이 안됨(그래픽카드,메모리 등등의 물리적)
//		2. 소프트웨어적인 에러 : 가벼운 에러 -> 예외(Exception)
//								 Oracle에서는 모든 예외들을 클래스로 만들어 제공
//								 ex) NullPointerException : null인 상태에서 기능사용(참조X)
//		
//		[예외의 종류]
//		1. 미확인 예외(실행예외)
//			-프로그램을 실행 해봐야지만 예외가 발생하는지 알 수 있음
//			-프로그래머의 실수, 경험에 의해서 발생 : 디버깅(오류수정) 작업이 쉽다.
//			
//		2. 확인 예외(일반예외)
//			-프로그램 작성중(코딩)에 반드시 예외처리를 해줘야만 사용이 가능한것들이 있음(파일o)
//			-try {} catch{} 해주면 해결됨 ↑
		
	}
}
