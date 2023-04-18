package pack01_base;

public class Ex07_OverLoading {
//	메소드의 이름이 같고 타입과 파라메터의 개수를 다르게해서 선택해 사용할 수 있게 한 것.
	void method() {
	}
	void method(int param1) {
	}
	void method(String param1) {
	}
	
	public static void main(String[] args) {
		Ex07_OverLoading eo = new Ex07_OverLoading();
//		대표적으로 메소드 오버로딩이 돼있는 것은 println임
//		어떤 타입을 넣어도 일단 출력이 되게끔 만들어뒀음.
	}
}
