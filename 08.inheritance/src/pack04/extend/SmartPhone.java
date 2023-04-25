package pack04.extend;

public class SmartPhone extends DmbPhone{
	int internet;
//	DmbPhone dp = new DmbPhone(param...)
	@Override
	public void PowerOn() {
		System.out.println("로고가 움직이면서 로딩이 나옴");
		super.PowerOn();
	}
	@Override
	public void PowerOff() {
		System.out.println("0.5초 내에 전원이 꺼짐");
	}
	public SmartPhone(int channel, String model, String color, int internet) {
		super(channel, model, color); // 부모 클래스가 별도의 생성자 메소드를 가지고 있다면
									  // 해당하는 부모 클래스가 인스턴스화 되어야지만
									  // 자식 객체도 생성이 가능하다.
		this.internet = internet;
	}

	public void internetON() {
		System.out.println("인터넷을 합니다");
	}
}
