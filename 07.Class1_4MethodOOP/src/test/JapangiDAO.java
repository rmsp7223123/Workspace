package test;

public class JapangiDAO {
	void display(JapangiDTO dto, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i + "번" + dto.bev[i - 1] + " " + dto.bevCost[i - 1] + "원 " +dto.bevCount[i-1]+ "개");
		}
	}

}
