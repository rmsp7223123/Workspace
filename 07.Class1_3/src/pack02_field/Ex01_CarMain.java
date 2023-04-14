package pack02_field;

public class Ex01_CarMain {//Main이 붙었기 때문에 main 메소드 만들기.
	public static void main(String[] args) {
		Ex01_car myCar = new Ex01_car(); // 인스턴스화 : 객체(클래스)를 메모리에 올려 사용하게 만드는것
//											내부에 있는 모든 멤버가 메모리에 올라가는것
		System.out.println("제조사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed );
		System.out.println("현재속도 : " + myCar.speed );
		System.out.println("사용자가 앞으로가기를 눌렀다.");
		myCar.speed = 30;
		System.out.println(myCar.speed + " 앞으로 달리기 시작");
	}
}
