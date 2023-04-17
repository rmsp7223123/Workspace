package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		Ex02_Calculator ca = new Ex02_Calculator();
		ca.powerOn(0);
		ca.test(); //int 타입을 무조건 리턴함 ==> int형 변수랑 같이 취급
		int result = ca.test() + 10;
		System.out.println(result);
		System.out.println(1+ca.test());
		System.out.println();
		int result1 = ca.plus3(5,15,10);
		System.out.println(result1);
		System.out.println(result1/3);
//		String inputdata = sc.nexLine(); <== nextLine() == String을 리턴하는 메소드
	}
}
