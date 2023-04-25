package pack.b;

import pack.a.*;

//import : 다른패키지에 있는 클래스를 사용하겠다의 선언
//*<== 내부에 있는 접근가능한 모든클래스를 사용하겠다
public class C {
	
//	같은 이름의 메소드를 사용할 때 접근제한자의 차이를 만들어보기 
	B b;
	C c1= new C(1);
	C c2= new C(true);
	C c3= new C();
	
	
	public C(int x) {
//		public : java프로젝트 내에서 모두 접근이 가능
	}

	C(boolean x) {
//		default : 같은 패키지 내에서 접근이가능
	}

	private C() {
//		private : 클래스 내부에서만 접근이 가능
	}

}