package test;

public class GetterSetter {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 1) {
			System.out.println("잘못됨");
		} else {
			this.age = age;
		}
	}

	public void method(int num) {
		try {
			if (num <= 0) {
				System.out.println("오류");
			} else {
				age = num;
				System.out.println(age + " : gs.age의 값");
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요");
		}
	}
}
