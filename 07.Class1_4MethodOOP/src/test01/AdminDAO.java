package test01;

import java.util.Scanner;

public class AdminDAO {
	public boolean adminlogin() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (count == 3) {
				System.out.println("시도횟수 3회를 초과하여 메인메뉴로 이동합니다.");
				return false;
			}
			System.out.println("3회 이상 오류시 메인메뉴로 이동합니다.");
			System.out.println("id를 입력해주세요.");
			String id = sc.nextLine();
			System.out.println("pw를 입력해주세요.");
			String pw = sc.nextLine();
			if (id.equals("master") && pw.equals("admin")) {
				System.out.println("로그인 되었습니다.");
				return true;
			} else {
				System.out.println("ID 또는 PW를 확인해주세요.");
				count++;
			}
		}
	}

	public void addMenu(DrinkDAO dao) {
		dao.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("음료의 이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("음료의 가격 입력 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("음료의 개수 입력 : ");
		int cnt = Integer.parseInt(sc.nextLine());
		DrinkDTO dto = new DrinkDTO(name, price, cnt);
		DrinkDTO[] tempArrs = new DrinkDTO[dao.drinkArr.length+1];
		for (int i = 0; i<dao.drinkArr.length; i++) {
			tempArrs[i] = dao.drinkArr[i];
		}
		tempArrs[tempArrs.length-1] = dto;
		dao.drinkArr = tempArrs;
		System.out.println(name + "이(가) 추가되었습니다.");
	}

}// class
