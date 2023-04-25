package pack04.singletone;

public class Ex01_Single {
	
	static {
		System.out.println("스태틱 출력");
	}
	public static void main(String[] args) {
		System.out.println("메인 출력");
	}
	
//	싱글톤 = static {} 블럭킹을 만들어서 main메소드나 클래스 멤버 접근 전 어떤 작업을 해야할 때 사용하는것 
	
}
