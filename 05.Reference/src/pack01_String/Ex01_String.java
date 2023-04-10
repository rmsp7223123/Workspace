package pack01_String;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		// String : 기본형 변수 x, 참조형 변수
		// 참조형 변수는 스택이라는 메모리공간에 힙 영역의 주소만 저장하고
		// 실제 값은 힙 영역안에 있는 형태 (기본형 변수는 힙 영역 사용X)
		String strVar1 = "MBJ"; //메모리주소 1
		String strVar2 = "MBJ"; //메모리주소 1
		if (strVar1 == strVar2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		// new <== 힙 영역에 공간을 만들다 (인스턴스 과정)
		String strVar3 = new String("MBJ");
		String strVar4 = new String("MBJ");
		
		Scanner sc = new Scanner(System.in);
		String strVar5 = sc.nextLine();
		if(strVar1 == strVar5) {
			System.out.println("strVar1이랑 같음");
		} else if(strVar3 == strVar5) {
			System.out.println("strvar3이랑 같음");
		} else {
			System.out.println("1,3,5는 다 다름");
		}
		
		if (strVar3 == strVar4) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
