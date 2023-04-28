package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone("아이폰14", "검정");
		System.out.println("구매하시려는 제품을 선택해주세요.");
		System.out.println("1번 = 1세대폰, 2번 = 2세대 폰(dmb), 3번 = 3세대 폰(스마트폰), 4번 = 슈퍼폰, 0번 = 취소");
		Scanner sc = new Scanner(System.in);
		String power;
		while (true) {
			String selPhone = sc.nextLine();
			if (selPhone.equals("1")) {
				System.out.println("제품명 :" + phone.model + " 색상 :" + phone.color + "을 지급합니다.");
				System.out.println("전원을 켜시려면 poweron을 취소하시려면 0번을 입력해주세요.");
				while (true) {
					power = sc.nextLine();
					if (power.equals("poweron")) {
						System.out.println("전원이 켜졌습니다.");
						phone.stateOn();
						break;
					} else if (power.equals("0")) {
						System.out.println("취소합니다.");
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						continue;
					}
				}
				break;
			} else if (selPhone.equals("2")) {

				break;
			} else if (selPhone.equals("3")) {

				break;
			} else if (selPhone.equals("4")) {

				break;
			} else if (selPhone.equals("0")) {
				System.out.println("취소를 선택하셨습니다. 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 정확한 숫자를 입력해주세요.");
				continue;
			}
		}
	}
}
