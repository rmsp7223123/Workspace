package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	int method1 (int num1, int num2) {
		System.out.println("method1");
		return 0;
	}
	int method2 () {
		System.out.println("method2");
		return 0;
	}	
	void method3(int num1, int num2) {
		System.out.println("method3");
	}
	void method4() {
		System.out.println("method4");
	}
	void method5(String data) {
		System.out.println("method5");
		if(data == null) {
			return; // 메소드를 중지시키고 블럭킹 끝으로 이동
		}
	}
	
	String sMethod() {
		return "a";
	}
	double dMethod() {
		return 0;
	}
	int[] aMethod() {
		return new int[1]; 
	}
	Scanner scanMethod() {
	return new Scanner(System.in);	
//	해당 메소드를 이용해서 스캐너 기능 사용시 NullPointerException 발생
	}
}
