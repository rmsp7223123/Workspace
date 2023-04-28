package phone;

public class DmbPhone extends Phone {
	int channel = 1;
	String selDmb;

	public DmbPhone(String selPhone, String model, String color, String myPhoneNum) {
		super(selPhone, model, color, myPhoneNum);

	}

	public void watchDmb() {
		setState("DMB시청중");
		System.out.println("DMB 시청을 시작합니다.");
		System.out.println("채널 : " + channel);
		System.out.println("채널을 변경하시려면 1번, 그만보시려면 0번을 입력해주세요.");
		while (true) {
			selDmb = sc.nextLine();
			if (selDmb.equals("1")) {
				chanCha();
			} else if (selDmb.equals("0")) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
			}
			break;
		}
	}

	public void chanCha() {
		while (true) {
			try {
				System.out.println("변경하실 채널 번호를 입력해주세요. 채널변경을 그만하시려면 0번을 입력해주세요.");
				int chanCha = Integer.parseInt(sc.nextLine());
				if (chanCha == 0) {
					System.out.println("채널변경을 그만하고 이전화면으로 이동합니다.");
					break;
				} else if (chanCha == getChannel()) {
					System.out.println("같은 채널로는 이동하실 수 없습니다.");
				} else {
					System.out.println("이전 채널 : " + getChannel() + " 변경 채널 : " + chanCha);
					setChannel(chanCha);
				}
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			}
		}

	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
}
