package phone;

import java.util.Scanner;

public class Phone {
	Scanner sc = new Scanner(System.in);
	String model;
	String state;
	String color;
	String power;
	String selNum1;
	int callNum;
	String sendVoice;
	String reciVoice;

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void stateOff() {
		System.out.println("전원이 꺼졌습니다.");
		System.out.println("전원을 켜시려면 poweron을 취소하시려면 0번을 입력해주세요.");
		while (true) {
			power = sc.nextLine();
			if (power.equals("poweron")) {
				System.out.println("전원이 켜졌습니다.");
				break;
			} else if (power.equals("0")) {
				System.out.println("취소합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void stateOn() {
		// 통화중 상태 + 여러 상태 추가?
		// 어떠한 상태시에 다른 기능들이 안되는것 추가? or 처음부터 관련 선택지외에 불가능하게?
		// 전화 불가능 상태일 때 state = @@ 라 전화 받기가 불가능합니다.
		// 아니면 전원이 꺼져있으니 처음부터 전원키는 기능제외 다 불가능하게?
		// 음성 송수신 -> 통화상태가 아니면 할 수 없게
		// 3세대 폰에 인터넷상태 +@ 표시 ?
		System.out.println("원하시는 기능을 선택해주세요.");
		System.out.println("1번 = 전화걸기, 0번 전원종료");
		// 2세대,3세대 폰으로 넘어가서 기능을 불러오고 +@ ?
		while (true) {
			selNum1 = sc.nextLine();
			if (selNum1.equals("1")) {
				System.out.println("전화걸기로 이동합니다.");
				// call로 이동
			} else if (selNum1.equals("0")) {
				System.out.println("전원종료를 선택하셨습니다. 전원이 종료됩니다.");
				// state.off로 이동
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 정확히 입력해주세요.");
				continue;
			}
		}

	}

	public void call() {
		System.out.println("통화하실 상대방의 번호를 입력해주세요.");
		while (true) {
			try {
				callNum = Integer.parseInt(sc.nextLine());
				System.out.println(callNum + "으로 전화합니다.");
			} catch (Exception e) {
				System.out.println("번호만 입력해주세요.");
			}
		}
	}

	public void sendMsg() {
		while (true) {
			System.out.println("전달하실 메시지를 입력해주세요. 0번을 입력시 메시지 전송을 취소하고 이전화면으로 이동합니다.");
			sendVoice = sc.nextLine();
			if (sendVoice.equals("0")) {
				System.out.println("메시지 전송을 취소합니다.");
				break;
			} else {
				System.out.println("나 : " + sendVoice);
				continue;
			}
		}
	}

	public void reciMsg() {
		while (true) {
			System.out.println("전달받을 메시지를 입력해주세요. 0번을 입력시 메시지 수신을 취소하고 이전화면으로 이동합니다.");
			reciVoice = sc.nextLine();
			if (reciVoice.equals("0")) {
				System.out.println("메시지 전송을 취소합니다.");
				break;
			} else {
				System.out.println("상대방 : " + reciVoice);
				continue;
			}
		}
	}

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
