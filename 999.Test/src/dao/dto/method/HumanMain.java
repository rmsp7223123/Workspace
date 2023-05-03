package dao.dto.method;

public class HumanMain {
	public static void main(String[] args) {
		HumanDAO dao = new HumanDAO();
		HumanDTO hu = new HumanDTO();
		dao.ask(hu);

		HumanDTO[] humanArr = new HumanDTO[5];
		for (int i = 0; i < humanArr.length; i++) {
			humanArr[i] = new HumanDTO();
		}
		System.out.println(humanArr[0].ear);
		System.out.println(humanArr[1].ear);
		System.out.println(humanArr[2].ear);
		System.out.println(humanArr[3].ear);
		System.out.println(humanArr[4].ear);
	}
}
