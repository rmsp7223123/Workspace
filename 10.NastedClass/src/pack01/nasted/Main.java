package pack01.nasted;

import pack01.nasted.A.B;
import pack01.nasted.A.C;

public class Main {
//	클래스의 중괄호 사이에 있는 모든 것 ==> 멤버 : 인스턴스 멤버 /스태틱 멤버(스태틱여부)
//	전역변수 : 클래스 내부에서 어디서든 사용 가능

//	외부 클래스에서 다른 클래스 멤버에 접근하는 법
//	인스턴스 멤버(static x) : 인스턴스화 과정을 거쳐야만 접근가능
//	스태틱 멤버(static o) : 해당하는 클래스에 .찍어도 접근이 가능
	public static void main(String[] args) {
		A a = new A(0); // A클래스의 중괄호 사이 모든것(접근제한자 차이제외)을 사용할 수 있음.
//		인스턴스화 과정 : 생성자 메소드를 이용하거나 값할당등을 해 null이 아닌 참조가 되는 상태로 만듦
		System.out.println(a.aField);
		System.out.println(a.methodA());
		
//		B라는 클래스는 클래스가 맞지만, A의 인스턴스멤버이다
		B b = a.new B();
		b.methodB();
		C c = new C();
		System.out.println(c.fieldC);
		c.methodC();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(a.methodA());

	}
}
