package test;

public class member {
	
	public member(int field) {
		System.out.println(field);
		System.out.println(this.field);
		this.field = field;
	}

//	static 여부
//	인스턴스화 : 클래스가 가지고있는 멤버중에 인스턴스 멤버들을 메모리에 올려서 사용가능하게 하는 과정
//	생성자(Constructor)메소드 : 클래스가 메모리에 올라갈 때 사용할 생성식 == 클래스와 이름이 대소문자가 정확히 같음
	int field = 1; // 인스턴스멤버
	static int sField = 2; // 스태틱멤버

	public static void main(String[] args) {
		member m = new member(50); // 인스턴스화 과정
		System.out.println(m.field);
		System.out.println(sField);
	}
}
