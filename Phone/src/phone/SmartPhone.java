package phone;

public class SmartPhone extends DmbPhone {
	String internet;
	String webInter;
	String[] webArr = { "웹툰이름1", "웹툰이름2", "웹툰이름3", "웹툰이름4", "웹툰이름5" };
	int selWeb;
	String stopWeb;

	public SmartPhone(String selPhone, String model, String color, String myPhoneNum) {
		super(selPhone, model, color, myPhoneNum);
	}

	public void entInter() {
		System.out.println("인터넷 기능에 접속하셨습니다.");
		System.out.println("인터넷 기능을 이용하시려면 1번 취소하시려면 0번을 입력해주세요.");
		while (true) {
			internet = sc.nextLine();
			if (internet.equals("1")) {
				System.out.println("인터넷이 활성화 되었습니다.");
				System.out.println("이전화면으로 이동합니다.");
				setState("인터넷 켜짐");
				break;
			} else if (internet.equals("0")) {
				System.out.println("인터넷 기능을 취소하고 이전화면으로 이동합니다.");
				setState("켜짐");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
			}
			break;
		}
	}

	public void webtoon() {
		while (true) {
			if (getState().equals("인터넷 켜짐")) {
				System.out.println("웹툰에 접속합니다.");
				for (int i = 0; i < webArr.length; i++) {
					System.out.println((i + 1) + "번 " + webArr[i]);
				}
				while (true) {
					try {
						System.out.println("읽으실 웹툰의 번호를 선택해주시거나 0번을 눌러 취소해주세요.");
						selWeb = Integer.parseInt(sc.nextLine());
						if (selWeb > 0 && selWeb <= webArr.length) {
							System.out.println(webArr[selWeb - 1] + "을 선택하셨습니다.");
							System.out.println("웹툰을 그만 보시고 싶으실 땐 0번을 입력하시면 이전화면으로 이동합니다.");
							System.out.println("내\n\n용");
							while (true) {
								stopWeb = sc.nextLine();
								if (stopWeb.equals("0")) {
									System.out.println("웹툰을 그만보고 이전화면으로 이동합니다.");
									break;
								} else {
									System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
								}
							}
						} else if (selWeb == 0) {
							System.out.println("취소하고 이전화면으로 이동합니다.");
							break;
						} else {
							System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
						}
					} catch (Exception e) {
						System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
					}
					break;
				}
			} else {
				while (true) {
					System.out.println("인터넷이 꺼져있어 웹툰에 접속하실 수 없습니다. 인터넷기능으로 이동하시려면 1번을 취소하고 이전화면으로 이동하시려면 0번을 입력해주세요.");
					webInter = sc.nextLine();
					if (webInter.equals("1")) {
						entInter();
						break;
					} else if (webInter.equals("0")) {
						System.out.println("취소후 이전화면으로 이동합니다.");
						break;
					} else {
						System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
					}
				}

			}
			break;
		}
	}
}
