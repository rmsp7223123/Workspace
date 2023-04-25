package pack04.extend;

public class ExamMain {
	public static void main(String[] args) {
		DmbPhone dp = new DmbPhone(1, "삼성", "검정");
		dp.PowerOn();
		dp.bell();
		dp.sendVoice("할말1111");
		dp.receiveVoice("할말 ㅁㅇㄹㅇㅁㄴㄹ");
		dp.hangUp();
		dp.PowerOff();
		//cellPhone
		dp.turnOnDmb();
		dp.changeChnanel(50);
		dp.turnOffDmb();
		dp.PowerOff();
		//dmbPhone
	}
}
