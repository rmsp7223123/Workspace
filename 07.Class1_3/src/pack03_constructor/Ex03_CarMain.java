package pack03_constructor;

public class Ex03_CarMain {
	public static void main(String[] args) {
		Ex03_Car ec = new Ex03_Car("현대", "그랜져", "검정색");
		System.out.println(ec.company);
		System.out.println(ec.model);
		System.out.println(ec.color);
		System.out.println(ec.maxSpeed);
		System.out.println(ec.speed);
	}
}
