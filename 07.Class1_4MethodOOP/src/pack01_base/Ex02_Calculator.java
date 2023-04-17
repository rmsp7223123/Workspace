package pack01_base;

public class Ex02_Calculator {
//	스태틱 키워드가 있는지 없는지에 대한 판단
//	메소드의 구조
//	생성자 메소드(Constructor) : 객체를 생성할 때 필요한 메소드
//	
//	메소드 구조 :
//	리턴타입 메소드 이름(파라메터부) {
//		메소드 내용(코드)
//	}
//	파라메터부 : 어떤것이던 메소드가 실행 될 때 필요한(변수,클래스 등) 정보가 있다면
//				 받아오게끔 처리하는 부분
	
	void powerOn(int power) {
		if (power< 1) {
			System.out.println(" 배터리 부족으로 실행불가 ");
			powerOff();
		} else {
			System.out.println(" 전원을 켭니다. ");
		}
	}
	void powerOff() {
		System.out.println(" 전원을 끕니다. ");
	}
	
//	powerOff에서 main에 접근이 되는 이유
//	static 멤버여서 '메모리'에 먼저 있기 때문
//	main에서 powerOff에 접근이 안되는 이유
//	인스턴스화 과정을 안거쳤기에 메모리에 없음
	
	
	
//	void인지 void가 아닌지에 따라 리턴타입이 결정된다.
//	내가 알고있는 모든 타입 ==> 리턴타입으로 사용가능.
//	void : 리턴이 없는(작업 후 결과가 필요없는)
	
//	리턴 타입이 void가 아니게 주어지면 해당하는 타입을 반환하는 리턴 키워드가 반드시 필요함.
	int test() {
		return 0;
	}
	
	int plus(int inputdata1, int inputdata2) {
		return inputdata1 + inputdata2; // return이 되게되면 메소드 자체가 메모리에서 사라짐
	}
	
	int plus3(int num1, int num2, int num3) {
		return num1 + num2 + num3 ;
	}
}
