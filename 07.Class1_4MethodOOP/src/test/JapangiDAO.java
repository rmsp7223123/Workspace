package test;

public class JapangiDAO {
	void display(JapangiDTO dto) {
		for (int i = 0; i < dto.getBev().length; i++) {
			if (dto.getBev()[i] == null) {

				System.out.println(i + 1 + " 비어있음 " + dto.bevCost[i] + "원 " + dto.bevCount[i] + "개");
			} else {

				System.out.println(i + 1 + "번" + dto.bev[i] + " " + dto.bevCost[i] + "원 " + dto.bevCount[i] + "개");
			}
		}
	}

	void display1(JapangiDTO dto, int seven) {
		for (int i = 1; i < seven; i++) {
			System.out.println(i + "번" + dto.bev[i - 1] + " " + dto.bevCost[i - 1] + "원 " + dto.bevCount[i - 1] + "개");
		}
	}

}
