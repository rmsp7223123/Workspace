package pack01_class;

import java.util.Scanner;

public class Ex01_StudentMain {
	public static void main(String[] args) {
//		모든 클래스는 변수처럼 메모리에 올리고 사용이 가능한것
//		클래스의 초기화 식
//		객체지향 : 한번 만들어 놓은 기능을 계속해서 재활용 할 수 있게함.
//		만들어놓은 기능을 여러군데서 사용하기때문에 기능추가를 하나의 클래스에만해도 공통적으로 적용
		Ex01_Student es1 = new Ex01_Student();
		es1.나이 = "12";
		es1.이름 = "김학생";
		es1.성별 = "남자";
		Ex01_Student es2 = new Ex01_Student();
		System.out.println(es1.나이 + es1.이름 + es1.성별);
		es1.study();
//		System.out.println("es1 변수가 Student 객체를 참조합니다. " +es1);
//		Scanner sc = new Scanner(System.in);
//		스캐너(객체) 사용자에게 어떤 값을 콘솔창을 통해서 입력받아오는 '기능'을 가진 객체
		
		
//		es1 = null;
//		Ex01_Student es2 = null;
//		if (es1==es2) {
//			System.out.println("?" + es1 + "/" + es2);
//		}
	}
}
