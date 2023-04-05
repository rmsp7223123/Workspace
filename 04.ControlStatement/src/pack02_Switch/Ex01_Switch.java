package pack02_Switch;

public class Ex01_Switch {
	public static void main(String[] args) {
//		switch (key) {
//		case value:
//			실행
//			break; <== 제어문을 종료하고 제어문의 블럭킹 지역을 빠져나감.
//
//		default: <== else
//			break;
//		}
		int num = 2;
		switch (num - 1) {
		case 1: // if ( num == 1)
			System.out.println("숫자 1");
			break; // ※
		case 2:
			System.out.println("숫자 2");
			break;
		default:
			System.out.println("숫자1과 숫자2가 아님");
		}
	}
}
