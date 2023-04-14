package pack03_constructor;

public class Ex03_Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;

	public Ex03_Car(String company, String model, String color) {
//		this <- 나 자신(중괄호 기준으로 나 자신)
		this.company = company;
		this.model = model;
		this.color = color;
	}
}
