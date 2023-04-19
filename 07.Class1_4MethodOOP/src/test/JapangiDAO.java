package test;

public class JapangiDAO {
	void display(JapangiDTO dto) {
		System.out.println(dto.bev[0] +" "+ dto.bevCost[0]+ "원 " + dto.bevCount[0]+ "개");
		System.out.println(dto.bev[1] +" "+ dto.bevCost[1]+ "원 " + dto.bevCount[1]+ "개");
		System.out.println(dto.bev[2] +" "+ dto.bevCost[2]+ "원 " + dto.bevCount[2]+ "개");
	}

}
