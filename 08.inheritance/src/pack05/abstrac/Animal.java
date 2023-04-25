package pack05.abstrac;

//추상클래스 라는것은 객체로 만들려고 사용하는게 아님
//객체로 만드는게 아닌 부모로써 상속받은 객체들의 방법을 미리 정의해놓은 것(구조)
//추상 : abstract 
public abstract class Animal {
	public String kind; // 종류를 식별하기위한 필드
	
	public void breathe() {
		System.out.println("동물이 숨을 쉰다.");
	}
	
	public abstract void sound(); 
//	abstract 메소드는 메소드의 리턴타입이나 메소드의 이름 매개변수등의 구조만 만드는 형태,
//	실제 구현은 자식클래스가 재정의해서 한다.
}
