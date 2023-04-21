package test;

import java.util.Scanner;

public class JapangiDAO {
	void display(JapangiDTO dto) {
		for (int i = 0; i < dto.getBev().length; i++) {
			if (dto.getBev()[i] == null) {

				System.out.println(i + 1 + "번 비어있음 " + dto.bevCost[i] + "원 " + dto.bevCount[i] + "개");
			} else {

				System.out.println(i + 1 + "번 " + dto.bev[i] + " " + dto.bevCost[i] + "원 " + dto.bevCount[i] + "개");
			}
		}
	}

	JapangiDTO initDTO(String[] nameArr, int[] priceArr, int[] cntArr) {
		JapangiDTO dto = new JapangiDTO();
		for (int i = 0; i < nameArr.length; i++) {
			dto.setBev(i, nameArr[i]);
		}
		for (int i = 0; i < priceArr.length; i++) {
			dto.setBevCost(i, priceArr[i]);
		}
		for (int i = 0; i < cntArr.length; i++) {
			dto.setBevCount(i, cntArr[i]);
		}
		return dto;
	}

	void addBev(JapangiDAO dao, JapangiDTO dto) {
		Scanner sc = new Scanner(System.in);
		int manAddNum1;
		int manSelNum1;
		int manSelNum2;
		String addBev;
		System.out.println("1번 음료추가를 고르셨습니다.");
		System.out.println("최대 6종류의 음료를 보관할 수 있습니다.");
		dao.display(dto);

		while (true) {
			System.out.println("추가하려는 빈 슬롯의 번호를 적어주세요.");
			System.out.println("0번을 입력하시면 이전화면으로 돌아갑니다.");
			try {
				manAddNum1 = Integer.parseInt(sc.nextLine());
				if (manAddNum1 == 0) {
					break;
				}
				if (manAddNum1 < 0 || manAddNum1 > 6) {
					System.out.println("음료추가가 불가능합니다. 정상적인 슬롯을 골라주세요.");
					continue;
				}
				if (dto.getBev()[manAddNum1 - 1] == null) {
					System.out.println("음료 추가 가능");
					System.out.println("추가하실 음료의 이름을 입력해주세요.");
					addBev = sc.nextLine();
					dto.setBev(manAddNum1 - 1, addBev);
					System.out.println("추가하신 음료의 개수를 입력해주세요.");
					manSelNum1 = Integer.parseInt(sc.nextLine());
					dto.setBevCount(manAddNum1 - 1, manSelNum1);
					System.out.println("추가히신 음료의 가격을 입력해주세요.");
					manSelNum2 = Integer.parseInt(sc.nextLine());
					dto.setBevCost(manAddNum1 - 1, manSelNum2);
					System.out.println("음료추가가 완료되었습니다.");
					dao.display(dto);
					continue;
				} else {
					System.out.println("음료 추가가 불가능합니다. 다른 슬롯을 골라주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}

		}

	}

	void corBev(JapangiDAO dao, JapangiDTO dto) {
		Scanner sc = new Scanner(System.in);
		int corNum1;
		int manSelNum1;
		int manSelNum2;
		String addBev;
		System.out.println("2번 음료수정을 고르셨습니다.");
		dao.display(dto);
		while (true) {
			System.out.println("수정할 음료의 번호를 골라주세요.");
			System.out.println("0번을 입력시 이전화면으로 돌아갑니다.");
			try {
				corNum1 = Integer.parseInt(sc.nextLine());
				if (corNum1 == 0) {
					break;
				}
				if (corNum1 < 0 || corNum1 > 6) {
					System.out.println("음료추가가 불가능합니다. 정상적인 슬롯을 골라주세요.");
					continue;
				}
				if (dto.getBev()[corNum1 - 1] != null) {
					System.out.println("음료 수정 가능");
					System.out.println("수정하실 음료의 이름을 입력해주세요.");
					addBev = sc.nextLine();
					dto.setBev(corNum1 - 1, addBev);
					System.out.println("수정하신 음료의 개수를 입력해주세요.");
					manSelNum1 = Integer.parseInt(sc.nextLine());
					dto.setBevCount(corNum1 - 1, manSelNum1);
					System.out.println("수정히신 음료의 가격을 입력해주세요.");
					manSelNum2 = Integer.parseInt(sc.nextLine());
					dto.setBevCost(corNum1 - 1, manSelNum2);
					System.out.println("음료수정이 완료되었습니다.");
					dao.display(dto);
					continue;
				} else {
					System.out.println("음료 수정이 불가능합니다. 다른 슬롯을 골라주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}

		}

	}

	void delBev(JapangiDAO dao, JapangiDTO dto) {
		Scanner sc = new Scanner(System.in);
		int delNum1;
		System.out.println("3번 음료삭제를 고르셨습니다.");
		dao.display(dto);
		while (true) {
			System.out.println("삭제할 음료수의 번호를 눌러주세요.");
			System.out.println("0번을 입력시 이전화면으로 돌아갑니다.");
			try {
				delNum1 = Integer.parseInt(sc.nextLine());
				if (delNum1 == 0) {
					break;
				}
				if (delNum1 < 0 || delNum1 > 6) {
					System.out.println("음료삭제가 불가능합니다. 정상적인 슬롯을 골라주세요.");
				}
				if (dto.getBev()[delNum1 - 1] != null) {
					dto.setBev(delNum1 - 1, null);
					dto.setBevCount(delNum1 - 1, 0);
					dto.setBevCost(delNum1 - 1, 0);
					System.out.println("음료삭제가 완료되었습니다.");
					dao.display(dto);
					continue;
				} else {
					System.out.println("음료 삭제가 불가능합니다. 비어있지 않은 슬롯을 골라주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}

	}
}
