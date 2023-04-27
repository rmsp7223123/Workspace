package pack01.inter;

//extends <- 클래스의 상속 : 내부에 있는 모든 멤버를 물려받아 사용가능하게 함
//implements <- 인터페이스의 상속 : 인터페이스 내부에 있는 모든 메소드를 재정의해서 구현할수있음
//인터페이스 : 어떤방법(메소드)을 구현하는것을 강제함(abstract)
public class TestMain implements TestInterface {
	
	public static void main(String[] args) {
		System.out.println(ip);
//		상수이기 때문에 인터페이스에서 최초에 값 할당을 제외하고는 값 수정이 불가능
	}

	@Override
	public void test1() {

	}

	@Override
	public boolean join(String id, String pw) {
//		재정의(기능구현을 진행함)
		return false;
	}

	@Override
	public void test2() {
//		메소드 구현 자체를 안할 수 없음
	}

}
