package pack05.abstrac;

public class ExamMain {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.sound();
		d.sound();
		
		System.out.println("--------------------------");
		
		Animal animal = new Cat();
		animal.sound();
		animal = new Dog();
		animal.sound();
	}
}
