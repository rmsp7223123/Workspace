package test01;

import java.util.Scanner;

public class DrinkDAO {
	DrinkDTO[] drinkArr;
	public DrinkDAO() {
		drinkArr = initDrinks();
	}
	public DrinkDTO[] initDrinks() {
		DrinkDTO[] drinkArr = new DrinkDTO[3];
		drinkArr[0] = new DrinkDTO("콜라", 800, 8);
		drinkArr[1] = new DrinkDTO("사이다", 1000, 5);
		drinkArr[2] = new DrinkDTO("환타", 900, 1);
		
		return drinkArr;
	}
	
	public void display() {
		System.out.println(" 음료명\t\t가격\t개수");
		for (int i = 0; i< drinkArr.length; i++) {
			System.out.print((i+1)+"번 "+drinkArr[i].getName()+"\t");
			System.out.print(drinkArr[i].getPrice()+"\t");
			System.out.print(" " +drinkArr[i].getCnt());
			System.out.println();
		}
	}
	
	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {			
			try {
				int rntInt = Integer.parseInt(sc.nextLine());
				return rntInt;
 			} catch (Exception e) {
				System.out.println("정상적인 금액을 투입해주세요");
			}
		}
	}
	
	int[] coinArr = {1000, 500, 100, 50, 10};
	public int inputMoney() {
		while (true) {
			
			int money = inputInt();
			int tempMoney = money;
			int charge = money;
			for (int i = 0; i< coinArr.length; i++) {
				tempMoney = charge / coinArr[i];
				charge = charge % coinArr[i];
				if (charge == 0) {
					break;
				}
			}
			if (charge != 0) {
				System.out.println(money + "반환됨 금액 입력을 다시해주세요.");
			} else {
				return money;
			}
			return money;
		}
		}
	
	public int choiceMenu() {
		while (true) {			
			int choice =inputInt();
			if (choice > 0 && choice <= drinkArr.length) {
				if(drinkArr[choice-1].getCnt() < 1) {
					System.out.println("음료의 재고가 없습니다. 다른 음료를 선택해주세요.");
					continue;
				}
				System.out.println(drinkArr[choice-1].getName());
				return choice;
			} else {
				System.out.println("잘못 입력됨 1번 ~ " +drinkArr.length + "번까지만 골라주세요");
			}
		}
		}
	
	public int orderMenu(int choice, int money) {
		if(money >= drinkArr[choice-1].getPrice()) {
			drinkArr[choice-1].setCnt(drinkArr[choice-1].getCnt()-1);
			System.out.println(drinkArr[choice-1].getName() + " 주문완료");
			return money - drinkArr[choice-1].getPrice();
		} else {
			System.out.println(money + "원이 반환됨 금액부족, 다시 이용해주세요.");
			return -1;
		}
	}
}// class
