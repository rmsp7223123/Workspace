package pack03_constructor;

public class Ex02_KoreanMain {
	public static void main(String[] args) {
		Ex02_Korean ec = new Ex02_Korean("문병준", "123456-1234567");
//		데이터의 정합성 : 이름과 주민번호가 없는 데이터(객체)하나는 실제하면 안됨.
		System.out.println("국적 : " +ec.nation);
		System.out.println("이름 : " +ec.name);
		System.out.println("주민번호 : " +ec.ssn);
	}
}
