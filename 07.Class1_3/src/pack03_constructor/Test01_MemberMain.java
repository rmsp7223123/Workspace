package pack03_constructor;

public class Test01_MemberMain {
	public static void main(String[] args) {
		Test01_Member ec = new Test01_Member();
		ec.id = "asd111";
		ec.pw = "qwe111";
		ec.name = "문병준";
		ec.age = 26;
		System.out.println("ID : " + ec.id);
		System.out.println("PW : " + ec.pw);
		System.out.println("NAME : " + ec.name);
		System.out.println("age : " + ec.age);
	}
}
