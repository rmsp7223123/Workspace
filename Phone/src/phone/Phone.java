package phone;

import java.util.Scanner;

public class Phone {

	Scanner sc = new Scanner(System.in);
	String selPhone;
	String model;
	String state = "꺼짐";
	String color;
	String power;
	String selNum1;
	int callNum;
	String sendVoice;
	String reciVoice;
	String msgCho;
	String callCho;
	String sendPhoneNum;
	String sendMsg;
	String selBtn;
	String myPhoneNum;
	String checkMsg;
	String funcList;

	public String getFuncList() {
		return funcList;
	}

	public void setFuncList(String funcList) {
		this.funcList = funcList;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSendPhoneNum() {
		return sendPhoneNum;
	}

	public void setSendPhoneNum(String sendPhoneNum) {
		this.sendPhoneNum = sendPhoneNum;
	}

	public String getSendMsg() {
		return sendMsg;
	}

	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}

	public Phone(String selPhone, String model, String color, String myPhoneNum) {
		this.selPhone = selPhone;
		this.model = model;
		this.color = color;
		this.myPhoneNum = myPhoneNum;
	}

	public String stateOff() {
		setState("꺼짐");
		System.out.println("전원이 꺼져있습니다.");
		System.out.println("전원을 켜시려면 1번을 취소하시려면 0번을 입력해주세요.");
		while (true) {
			power = sc.nextLine();
			if (power.equals("1")) {
				System.out.println("전원이 켜졌습니다.");
				return power;
			} else if (power.equals("0")) {
				System.out.println("취소합니다.");
				return power;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void stateOn() {
		setState("켜짐");
		// 통화중 상태 + 여러 상태 추가?
		// 어떠한 상태시에 다른 기능들이 안되는것 추가? or 처음부터 관련 선택지외에 불가능하게?
		// 전화 불가능 상태일 때 state = @@ 라 전화 받기가 불가능합니다.
		// 아니면 전원이 꺼져있으니 처음부터 전원키는 기능제외 다 불가능하게?
		// 음성 송수신 -> 통화상태가 아니면 할 수 없게
		// 3세대 폰에 인터넷상태 +@ 표시 ?
	}

	public void call() {
		setState("통화중");
		while (true) {
			System.out.println("음성메시지를 발신하시려면 1번 수신하시려면 2번 취소하시려면 0번을 입력해주세요.");
			callCho = sc.nextLine();
			if (callCho.equals("1")) {
				sendMsg();
				continue;
			} else if (callCho.equals("2")) {
				reciMsg();
				continue;
			} else if (callCho.equals("0")) {
				System.out.println("취소합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void sendMsg() {
		System.out.println("상대방의 번호를 입력하면 음성메시지 전송창으로 이동하고 0번을 누르면 이전화면으로 돌아갑니다.");
		setSendPhoneNum(sc.nextLine());
		if (getSendPhoneNum().equals("0")) {
			System.out.println("이전화면으로 이동합니다.");
		} else {
			while (true) {
				System.out.println("전달하실 메시지를 입력해주세요. 0번을 입력시 메시지 전송을 취소하고 이전화면으로 이동합니다.");
				selBtn = sc.nextLine();
				if (selBtn.equals("0")) {
					System.out.println("메시지 전송을 취소합니다.");
					break;
				} else {
					setSendMsg(selBtn);
					System.out.println("나 : " + getSendMsg());
					continue;
				}
			}

		}
	}

	public void reciMsg() {
		while (true) {
			System.out.println("음성메시지를 확인하시려면 1번 취소하시려면 0번을 입력해주세요.");
			checkMsg = sc.nextLine();
			if (checkMsg.equals("1")) {
				if (getSendPhoneNum().equals(myPhoneNum)) {
					System.out.println(getSendPhoneNum() + " : " + getSendMsg());
					continue;
				} else {
					System.out.println("수신된 메시지가 없습니다.");
					break;
				}
			} else if (checkMsg.equals("0")) {
				System.out.println("취소합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
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
