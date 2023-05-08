package phone1;

public class SmartDAO extends DmbDAO {
	SmartDTO sdao = new SmartDTO("검정", "아이폰", "종료", "정보없음", "인터넷꺼짐");

	public void mobile() {
		System.out.println("3세대 폰 (색상: " + dto.getColor() + ", 모델명: " + sdao.getModel() + ", 상태: " + dto.state
				+ ", 채널: " + dmb.channel + ")");
	}

	public void internet() {
		sdao.setInternet("인터넷꺼짐");
		while (true) {
			if (dto.state.equals("전화중") && sdao.internet.equals("인터넷꺼짐")) {
				System.out.println("인터넷을 켜주세요.");
			}

		}

	}

	void webtoon() {
		System.out.println("웹툰 앱 켜기 (on)");
		while (true) {
			String webtoon = sc.nextLine();
			if (sdao.internet.equals("인터넷꺼짐") && webtoon.equals("on")) {
				System.out.println("인터넷을 먼저 켜주세요.");
				System.out.println("인터넷 켜기(on)");
				String it = sc.nextLine();
				if (it.equals("on")) {
					sdao.internet = "인터넷사용중";
					System.out.println("인터넷이 켜졌습니다.(" + sdao.internet + ")");
				}
				if (sdao.internet.equals("인터넷사용중")) {
					System.out.println("웹툰 앱을 켭니다.");
					break;
				}
			} else {
				System.out.println("on을 입력해주세요.");
			}
		}
	}

}
