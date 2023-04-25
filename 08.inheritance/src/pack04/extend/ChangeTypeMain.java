package pack04.extend;

public class ChangeTypeMain {
	public static void main(String[] args) {
//		CellPhone> DmbPhone > SmartPhone
//		CellPhone은 부모클래스이기 때문에 자식클래스의 일부가 그대로 존재
//		자식클래스를 부모클래스에 담게되면 그 기능을 그대로 사용이 가능
//		CellPhone cp = new DmbPhone(1, "삼성", "검정");
//		CellPhone cp2 = new SmartPhone(1, "삼성", "검정", 1);
//		cp.PowerOn();
//		cp2.PowerOn(); // 자식클래스에서 재정의 된 메소드가 호출
		CellPhone[] cpArr = new CellPhone[2];
		cpArr[0] = new DmbPhone(1, "삼성", "검정");
		cpArr[1] = new SmartPhone(1, "삼성", "검정", 1);
		
		DmbPhone dp = new SmartPhone(1, null, null, 1);
		
		for(int i = 0; i<cpArr.length; i++) {
			cpArr[i].PowerOn();
		}
		dp.PowerOff();
		
		SmartPhone sp = (SmartPhone) new DmbPhone(1, "삼성", "검정");
//		자식= 부모 ; 강제로 캐스팅 해줘야함
		sp.PowerOff();
//		오류
	}
}
