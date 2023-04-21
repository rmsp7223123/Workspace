package test;

import java.util.Scanner;

public class JapangiMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JapangiDTO dto = new JapangiDTO();
		dto.setBev(0, "콜라");
		dto.setBev(1, "사이다");
		dto.setBev(2, "환타");
		dto.setBevCost(0, 800);
		dto.setBevCost(1, 1000);
		dto.setBevCost(2, 900);
		dto.setBevCount(0, 8);
		dto.setBevCount(1, 5);
		dto.setBevCount(2, 1);

		JapangiDAO dao = new JapangiDAO();
		String id;
		String pw;
		String inputNum;
		String manNum1;
		String addBev;
		int manSelNum1;
		int manSelNum2;
		int corNum1;
		int delNum1;
		int manAddNum1;
		int selNum1;
		int inputMoney;
		int totalMoney = 0;
		int chanMoney10, chanMoney50, chanMoney100, chanMoney500, chanMoney1000 = 0;
		while (true) {
			System.out.println("1 : 관리자기능 ");
			System.out.println("2 : 음료수구매 ");
			System.out.println("3 : 종료 ");
			inputNum = sc.nextLine();

			if (inputNum.equals("1")) {
				System.out.println("관리자 기능에 접속하셨습니다.");
				while (true) {
					System.out.println("id를 입력해주세요" + " 초기메뉴로 돌아가시려면 0번을 입력해주세요.");
					id = sc.nextLine();
					if (id.equals("0")) {
						break;
					}
					System.out.println("pw를 입력해주세요");
					pw = sc.nextLine();
					if (id.equals("master") && pw.equals("admin")) {
						System.out.println("관리자 기능에 접속합니다.");
						dao.display(dto);
						while (true) {
							System.out.println("원하는 기능을 선택해주세요");
							System.out.println("1번 음료추가");
							System.out.println("2번 음료수정");
							System.out.println("3번 음료삭제");
							System.out.println("0번 초기화면으로 돌아가기");
							manNum1 = sc.nextLine();
							if (manNum1.equals("1")) {
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

							} else if (manNum1.equals("2")) {
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
							} else if (manNum1.equals("3")) {
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
							} else if (manNum1.equals("0")) {
								break;
							} else {
								System.out.println("정상적인 숫자만 입력해주세요.");
								continue;
							}
						}
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}
			} else if (inputNum.equals("2")) {
				System.out.println("음료수 구매를 선택하셨습니다");
				dao.display(dto);
				System.out.println("9번을 입력시 음료수 구매로 넘어갑니다.");
				System.out.println("0번을 입력시 초기화면으로 돌아갑니다.");
				while (true) {
					System.out.println("돈을 투입해주세요.");
					try {
						inputMoney = Integer.parseInt(sc.nextLine());
						if (inputMoney == 9 || inputMoney == 0) {
							break;
						}
						if (inputMoney % 10 != 0) {
							System.out.println("동전과 지폐만 투입해주세요.");
							System.out.println("현재 투입된 금액은 : " + totalMoney + "입니다.");
							continue;
						}
					} catch (Exception e) {
						inputMoney = 0;
						System.out.println("정상적인 값을 입력해주세요.");
					}
					totalMoney += inputMoney;
					System.out.println("현재 투입된 금액은 : " + totalMoney + "입니다.");
				}
				if (inputMoney == 0) {
					continue;
				}
				System.out.println("원하시는 음료수를 선택해주세요");
				System.out.println("0번을 입력시 잔돈을 반환 후 초기화면으로 돌아갑니다.");
				while (true) {
					dao.display(dto);
					try {
						selNum1 = Integer.parseInt(sc.nextLine());
						if (selNum1 == 0) {
							chanMoney1000 = totalMoney / 1000;
							chanMoney500 = totalMoney % 1000 / 500;
							chanMoney100 = totalMoney % 1000 % 500 / 100;
							chanMoney50 = totalMoney % 1000 % 500 % 100 / 50;
							chanMoney10 = totalMoney % 1000 % 500 % 100 % 50 / 10;
							if (totalMoney == 0) {
								System.out.println("잔돈이 없습니다. 초기화면으로 돌아갑니다.");
							} else {

								if (chanMoney1000 != 0) {
									System.out.print("천원 " + chanMoney1000 + "개");
								}
								if (chanMoney500 != 0) {
									System.out.print(" 오백원 " + chanMoney500 + "개");
								}
								if (chanMoney100 != 0) {
									System.out.print(" 백원 " + chanMoney100 + "개");
								}
								if (chanMoney50 != 0) {
									System.out.print(" 오십원 " + chanMoney50 + "개");
								}
								if (chanMoney10 != 0) {
									System.out.print(" 십원 " + chanMoney10 + "개");
								}
								System.out.println("를 반환후 초기화면으로 돌아갑니다.");

							}
							totalMoney = 0;
							break;
						}
						if (dto.bevCount[selNum1 - 1] < 1) {
							System.out.println("잔돈 : " + totalMoney);
							System.out.println("재고가 부족합니다. 다른 음료수를 선택하시거나 0번을 눌러 초기화면으로 돌아가주세요.");

							continue;
						}
						System.out.println(dto.bev[selNum1 - 1] + "를 선택하셨습니다.");
						if (totalMoney < dto.bevCost[selNum1 - 1]) {
							System.out.println("잔돈 : " + totalMoney);
							System.out.println("돈이 부족합니다.");
							System.out.println("음료수를 다시 선택해주시거나 0번을 눌러 잔돈을 반환 후 초기화면으로 돌아가주세요.");

						} else {
							totalMoney -= dto.bevCost[selNum1 - 1];
							System.out.println(dto.bev[selNum1 - 1] + "음료가 나왔습니다.");
							System.out.println("잔돈 : " + totalMoney + "원이 남았습니다");
							System.out.println("잔돈 반환후 초기화면으로 돌아가시려면 0번 더 구매하시려면 원하는 음료를 선택해주세요.");
							dto.bevCount[selNum1 - 1]--;
						}
					} catch (Exception e) {
						System.out.println("정상적인 숫자만 입력해주세요.");
					}
				}
			}

			else if (inputNum.equals("3")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			}
		}

	}// main
}
