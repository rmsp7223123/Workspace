package pack01_base;

public class Ex01_Car {
//	클래스의 중괄호 사이(블럭킹내부)에 있는 모든것들은 해당하는 이름의 클래스 멤버이다.
	int speed; // 기본값 0
	
//	멤버의 구분
//	1. 인스턴스 멤버 : 인스턴스화 과정을 거쳐야만 사용이 가능
//					   인스턴스화 과정 후 메모리에 올라가기 때문 ==> new class();
//					   인스턴스 멤버들끼리는 언제든지 접근이 가능
	
//	2.스태틱 멤버 : 메모리에 별도의 인스턴스화 과정없이 올라가기 때문에 언제든지 사용이 가능
//					단 메모리에 항상 먼저 올라가야 하기 때문에 인스턴스 멤버에 바로접근이 불가능
//					==> 인스턴스화 과정 후 사용 가능
	
	void run() {
		System.out.println(speed + "로 달린다");
	}
	
	public static void main(String[] args) {
		Ex01_Car ec = new Ex01_Car();
		System.out.println(ec.speed);
	}
}
