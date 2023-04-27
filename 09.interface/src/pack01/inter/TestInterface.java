package pack01.inter;

//추상 클래스 : abstract class.. 추상 메소드 등.class
//추상 == abstract : 메소드의 return 타입, 메소드명, 파라메터만 지정이 되어있으며
//		실제 구현은 상속을 받은 객체가 override를 통해서 해야함
//		
//interface : ↑↑용도로 사용하기 위해서 만든 .java파일
//대규모 프로젝트에서 어떤 방법을 일원화하기위해 많이 사용됨

public interface TestInterface {
//	인터페이스 내부에서 만든 변수는 상수(final)임
	String ip = "192.168.0.123";
//	abstract가 앞에 생략되어있음
	void test1();
	
	boolean join(String id, String pw);
	
	void test2();
}
