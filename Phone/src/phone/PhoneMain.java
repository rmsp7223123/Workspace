package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String powerBtn;
		String selFunc;

		while (true) {
			System.out.println("구매하시려는 핸드폰의 세대를 선택해주세요.");
			System.out.println("1번 = 1세대폰, 2번 = 2세대 폰(dmb), 3번 = 3세대 폰(스마트폰), 0번 = 취소");
			String selPhone = sc.nextLine();
			if (selPhone.equals("0")) {
				System.out.println("구매를 취소합니다.");
				break;
			} else if (!(selPhone.equals("1") || selPhone.equals("2") || selPhone.equals("3"))) {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
				continue;
			}
			System.out.println("구매하시려는 제품의 모델을 입력해주세요.");
			String model = sc.nextLine();
			System.out.println("구매하시려는 제품의 색상을 입력해주세요.");
			String color = sc.nextLine();
			System.out.println("원하시는 전화번호를 입력해주세요.");
			String myPhoneNum = sc.nextLine();
			Phone phone = new Phone(selPhone, model, color, myPhoneNum);
			DmbPhone dmbPhone = new DmbPhone(selPhone, model, color, myPhoneNum);
			SmartPhone smartPhone = new SmartPhone(selPhone, model, color, myPhoneNum);
			System.out.println("선택하신 제품의 세대 :" + phone.selPhone + "세대" + " 모델명 : " + phone.model + " 색상 : "
					+ phone.color + " 상태 : " + phone.state + " 전화번호 : " + phone.myPhoneNum);
			if (selPhone.equals("1")) {
				while (true) {
					powerBtn = phone.stateOff();
					if (powerBtn.equals("1")) {
						phone.stateOn();
						break;
					} else if (powerBtn.equals("0")) {
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시눌러주세요");
						continue;
					}
				}
				if (phone.getState().equals("켜짐")) {
					while (true) {
						System.out.println("전화기능으로 이동하시려면 1번 \n전원을 끄시려면 0번을 입력해주세요.");
						selFunc = sc.nextLine();
						if (selFunc.equals("1")) {
							phone.call();
							continue;
						} else if (selFunc.equals("0")) {
							phone.stateOff();
							break;
						}
					}
					break;
				} else {
					break;
				}

			} else if (selPhone.equals("2")) {
				while (true) {
					powerBtn = dmbPhone.stateOff();
					if (powerBtn.equals("1")) {
						dmbPhone.stateOn();
						break;
					} else if (powerBtn.equals("0")) {
						break;
					} else {
						System.out.println("잘못 누르셨습니다. 다시눌러주세요");
						continue;
					}
				}
				if (dmbPhone.getState().equals("켜짐")) {
					while (true) {
						dmbPhone.stateOn();
						System.out.println("전화기능으로 이동하시려면 1번 DMB기능을 이용하시려면 2번 \n전원을 끄시려면 0번을 입력해주세요.");
						selFunc = sc.nextLine();
						if (selFunc.equals("1")) {
							dmbPhone.call();
							continue;
						} else if (selFunc.equals("0")) {
							dmbPhone.stateOff();
							break;
						} else if (selFunc.equals("2")) {
							dmbPhone.watchDmb();
							continue;
						}
					}
					break;
				} else {
					break;
				}
			} else if (selPhone.equals("3")) {
				while (true) {
					powerBtn = smartPhone.stateOff();
					if (powerBtn.equals("1")) {
						smartPhone.stateOn();
						break;
					} else if (powerBtn.equals("0")) {
						break;
					} else {
						System.out.println("잘못 누르셨습니다. 다시눌러주세요");
						continue;
					}
				}
				if (smartPhone.getState().equals("켜짐")) {
					while (true) {
						System.out.println(
								"전화기능으로 이동하시려면 1번 DMB기능을 이용하시려면 2번 \n인터넷을 이용하시려면 3번 웹툰을 이용하시려면 4번 \n전원을 끄시려면 0번을 입력해주세요.");
						selFunc = sc.nextLine();
						if (selFunc.equals("1")) {
							smartPhone.call();
						} else if (selFunc.equals("0")) {
							smartPhone.stateOff();
							break;
						} else if (selFunc.equals("2")) {
							smartPhone.watchDmb();
						} else if (selFunc.equals("3")) {
							smartPhone.entInter();
						} else if (selFunc.equals("4")) {
							smartPhone.webtoon();
						}
					}
					break;
				} else {
					break;
				}
			}
		}
	}
}
