package pack.b;

import pack.a.*;

//import : 다른패키지에 있는 클래스를 사용하겠다의 선언
//*<== 내부에 있는 접근가능한 모든클래스를 사용하겠다
public class C {
	B b;
	C c1= new C(1);
	C c2= new C(true);
	
	
	public C(int x) {
		System.out.println(c1);
	}

	C(boolean x) {

	}

	private C() {

	}

}