package pack04.extend;

public class DmbPhone extends CellPhone{
	int channel;

	public DmbPhone(int channel, String model, String color) {
		this.channel = channel;
		this.model = model;
		this.color = color;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " +channel +"번 DMB 방송 수신 시작");
	}
	
	void changeChnanel(int channel) {
		this.channel = channel;
		turnOnDmb();
	}
	
	void turnOffDmb() {
		System.out.println("방송 수신을 멈춘다.");
	}
}
