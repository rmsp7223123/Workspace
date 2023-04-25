package pack04.extend;

public class CellPhone {
//	1세대 폰 : 전원을 켜고 끄는 기능과 통화기능이 있는 핸드폰
	String model;
	String color;
	
	final String CHIP = "칩"; // final 이라는것은 값 할당 이후엔 절대 수정이 불가능
							  // 상수라고도 표현함
							  // 변수의 이름을 지을 땐 반드시 전체 대문자로함
	
	
	
	private void changeFolder() {// 1세대폰만 사용가능한 기능 (private)
		System.out.println("1세대 폰의 모델 특성상 화면이 돌아가는 기능입니다.");
	}
	
	public void PowerOn() {
		System.out.println("전원을 켭니다");
	}
	public void PowerOff() {
		System.out.println("전원을 끕니다");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String input) {
		System.out.println("나 : " + input);
	}
	public void receiveVoice(String input) {
		System.out.println("상대방 : " + input);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}
