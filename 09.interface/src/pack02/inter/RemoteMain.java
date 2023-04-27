package pack02.inter;

public class RemoteMain {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Television tv = new Television();
		audio.turnOn();
		audio.setVolume(10000);
		audio.turnOff();
		tv.turnOn();
		tv.setVolume(-50);
		tv.turnOff();
//		다형성 : 인터페이스를 상속받은 객체 Audio & TV는 공통적으로 메소드(turnOn,turnOff,setVolume)를 가지고있음
//		따라서 RemoteControl(Interface) == Audio == TV
		
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new Television();
		rcArr[1] = new Audio();
		for (int i = 0; i<rcArr.length; i++) {
			rcArr[i].turnOn();
		}

	}
}
