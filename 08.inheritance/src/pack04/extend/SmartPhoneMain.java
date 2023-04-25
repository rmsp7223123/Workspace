package pack04.extend;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(1, "삼성", "검정", 10);
		sp.PowerOn();
		sp.turnOffDmb();
		sp.internetON();
		System.out.println(sp.internet);
		System.out.println(sp.channel);
		sp.PowerOn();
	}
}
