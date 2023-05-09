package pack01_myjar;

import phone.Phone;

public class Ex01_Myjar {
	public static void main(String[] args) {
//		자바프로젝트가 외부에서 사용되어야 할 때 여러가지 확장자로 추출될 수 있음
//		Scanner, Random 등은 자바프로젝트로 이미 만들어놓고 추출되어 기본Java언어에 포함되어있는 기능들

		Phone ph = new Phone(null, null, null, null);
		ph.stateOn();
		ph.stateOff();
	}
}
