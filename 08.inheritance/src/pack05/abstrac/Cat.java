package pack05.abstrac;

public class Cat extends Animal{

	@Override
	public void sound() {
//		추상메소드에서 abstract로 지정해놓은 구조를 가진 메소드는 반드시 자식객체가
//		재정의해서 구현해야함
		System.out.println("야옹");
	}

}
