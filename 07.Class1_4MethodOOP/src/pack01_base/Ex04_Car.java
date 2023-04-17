package pack01_base;

public class Ex04_Car {
	int gas;

	public Ex04_Car(int gas) {
		this.gas = gas;
	}
	
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
}
