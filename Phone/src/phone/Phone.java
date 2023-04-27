package phone;

import java.util.Scanner;

public class Phone {
	Scanner sc = new Scanner(System.in);
	String model;
	String state;
	String color;
	String power;
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void stateOff() {
		System.out.println("전원을 켜시려면 poweron을 입력해주세요.");
		while (true) {
			power = sc.nextLine();
			if (power.equals("poweron")) {
				System.out.println("전원이 켜졌습니다.");
				System.out.println("원하시는 기능을 선택해주세요.");
				System.out.println("1번 = 전화걸기, 2번 전원종료");
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void stateOn() {

	}
//	-기능1: 전원 켜기 & 끄기 : return 이 없는 기능으로 단순하게 전원이 켜고 꺼지며 , 상태 정보가 변경 된다
//		    (ex . 전원 켜기 : 상태 ( 전원 켜짐 ) , 전원 끄기 ( 전원 꺼짐 )
//		    
//	-기능2: 전화 받기 & 끊기 : 객체의 전원 상태 정보가 켜짐이고 전화중이 아닌경우에 전화 받기가 가능하며 
//	                         전화를 받게 되면 상태 정보는 전화중으로 변경 된다.
//	                         객체의 상태 정보가 전화중인 경우 전화 끊기가 가능하다.
//	                       
//	-기능3: 음성 전송 & 수신 : 전화중 상태에서만 음성 전송 및 수신이 가능하며 문자열을 입력하여 음성을 전송하고 문자열을
//              입력하여 수신 받는것으로 인식한다.

}
