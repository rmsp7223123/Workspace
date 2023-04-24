package test01;

import java.util.Scanner;

public class DrinkMain {
	public static void main(String[] args) {
		DrinkDAO dao = new DrinkDAO();
//		DrinkDTO[] drinkArr = dao.initDrinks();

		while (true) {
			System.out.println("0.관리자모드 1.음료주문,  -1.종료");

			int inputMenu = dao.inputInt();
			if (inputMenu == 0) {
				System.out.println("관리자모드를 실행합니다.");
				System.out.println("보안규칙에 따라 관리자 로그인을 해주세요.");
				AdminDAO adminDao = new AdminDAO();
				if (adminDao.adminlogin()) {
					System.out.println("1.음료추가 2.음료수정 3.음료삭제 -1메인메뉴로 이동");
					while (true) {						
						inputMenu = dao.inputInt();
						if(inputMenu == 1) {
							adminDao.addMenu(dao);
						} else if (inputMenu ==2) {
							
						} else if (inputMenu ==3) {
							
						} else if (inputMenu ==-1) {
							break;
						} else {
							System.out.println("잘못입력하셨습니다. 정상적인 숫자를 입력해주세요.");
							continue;
						}
					}
				}
			}
			else if (inputMenu == 1) {
				dao.display();
				System.out.println("음료주문 선택");
				System.out.println("돈을 투입해주세요.");
				int money = dao.inputMoney();
				System.out.println(money + "원이 투입되었습니다.");
				while (money != -1) {
					System.out.println("잔돈 : " + money + "음료 번호를 입력해주세요.");
					dao.display();
					int choice = dao.choiceMenu();
					System.out.println(choice + "번 선택완료");
					money = dao.orderMenu(choice, money);
				}

			}

			else if (inputMenu == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
