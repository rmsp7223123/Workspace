package test;

public class JapangiMain {
	public static void main(String[] args) {
		JapangiDTO dto = new JapangiDTO();
		dto.bev[0] = "콜라";
		dto.bev[1] = "사이다";
		dto.bev[2] = "환타";
		dto.bevCost[0] = 800;
		dto.bevCost[1] = 1000;
		dto.bevCost[2] = 900;
		dto.bevCount[0] = 8;
		dto.bevCount[1] = 5;
		dto.bevCount[2] = 1;
		
		JapangiDAO dao = new JapangiDAO();
		dao.display(dto);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		
	}//main
}
