package test;

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

}
