package pack03_constructor;

public class Test01_MemberDToMain {
	public static void main(String[] args) {
		Test01_MemberDTo ec = new Test01_MemberDTo("문병준", "asd123", "qwe123");
		System.out.println("NAME : " + ec.name);
		System.out.println("ID : " + ec.id);
		System.out.println("PW : " + ec.pw);
		System.out.println("AGE : " + ec.age);
	}
}
